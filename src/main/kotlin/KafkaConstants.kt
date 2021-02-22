import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.common.serialization.StringSerializer

object KafkaConstants {

    const val BOOTSTRAP_SERVERS = "localhost:9092"
    const val KAFKA_STRING_SERIALIZER = "org.apache.kafka.common.serialization.StringSerializer"
    const val KAFKA_STRING_DESERIALIZER = "org.apache.kafka.common.serialization.StringDeserializer"
    const val SCHEMA_REGISTRY_URL = "http://localhost:8081"
    const val CONSUMER_GROUP = "G3"
    const val TOPIC = "userTopic"

}