import com.models.User
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig
import io.confluent.kafka.serializers.KafkaAvroSerializer
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.errors.SerializationException
import java.util.*

class CustomProducer {

    companion object {

        fun runProducer() {
            var props = Properties()
            props[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = KafkaConstants.BOOTSTRAP_SERVERS
            props[ProducerConfig.ACKS_CONFIG] = "all"
            props[ProducerConfig.RETRIES_CONFIG] = 0
            props[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = KafkaConstants.KAFKA_STRING_SERIALIZER
            props[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = KafkaAvroSerializer::class.java
            props[AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG] = KafkaConstants.SCHEMA_REGISTRY_URL

            try {
                var producer = KafkaProducer<String, User>(props)
                for (i in 0..100) {
                    val user =   User.newBuilder().setName("user$i").setAge(20 + i).setPanNumber("PAN$i$i$i$i$i").build()
                    val record: ProducerRecord<String, User> =
                        ProducerRecord<String, User>("userTopic", "$i", user)
                    producer.send(record)
                    Thread.sleep(1000L)
                    println("produced $i")
                }
                producer.flush()
                System.out.printf("Successfully produced messages to a topic called userTopic",)

            } catch (e: SerializationException) {
                e.printStackTrace()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }
    }


}