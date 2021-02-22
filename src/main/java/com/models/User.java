/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.models;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8492580172694615034L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.models\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"panNumber\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"testSchemaField\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public int age;
  @Deprecated public java.lang.String panNumber;
  @Deprecated public java.lang.String testSchemaField;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param age The new value for age
   * @param panNumber The new value for panNumber
   * @param testSchemaField The new value for testSchemaField
   */
  public User(java.lang.String name, java.lang.Integer age, java.lang.String panNumber, java.lang.String testSchemaField) {
    this.name = name;
    this.age = age;
    this.panNumber = panNumber;
    this.testSchemaField = testSchemaField;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return age;
    case 2: return panNumber;
    case 3: return testSchemaField;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: age = (java.lang.Integer)value$; break;
    case 2: panNumber = (java.lang.String)value$; break;
    case 3: testSchemaField = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'panNumber' field.
   * @return The value of the 'panNumber' field.
   */
  public java.lang.String getPanNumber() {
    return panNumber;
  }

  /**
   * Sets the value of the 'panNumber' field.
   * @param value the value to set.
   */
  public void setPanNumber(java.lang.String value) {
    this.panNumber = value;
  }

  /**
   * Gets the value of the 'testSchemaField' field.
   * @return The value of the 'testSchemaField' field.
   */
  public java.lang.String getTestSchemaField() {
    return testSchemaField;
  }

  /**
   * Sets the value of the 'testSchemaField' field.
   * @param value the value to set.
   */
  public void setTestSchemaField(java.lang.String value) {
    this.testSchemaField = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static com.models.User.Builder newBuilder() {
    return new com.models.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static com.models.User.Builder newBuilder(com.models.User.Builder other) {
    return new com.models.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static com.models.User.Builder newBuilder(com.models.User other) {
    return new com.models.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.String name;
    private int age;
    private java.lang.String panNumber;
    private java.lang.String testSchemaField;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.models.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.panNumber)) {
        this.panNumber = data().deepCopy(fields()[2].schema(), other.panNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.testSchemaField)) {
        this.testSchemaField = data().deepCopy(fields()[3].schema(), other.testSchemaField);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(com.models.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.panNumber)) {
        this.panNumber = data().deepCopy(fields()[2].schema(), other.panNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.testSchemaField)) {
        this.testSchemaField = data().deepCopy(fields()[3].schema(), other.testSchemaField);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.models.User.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.models.User.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.models.User.Builder setAge(int value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.models.User.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'panNumber' field.
      * @return The value.
      */
    public java.lang.String getPanNumber() {
      return panNumber;
    }

    /**
      * Sets the value of the 'panNumber' field.
      * @param value The value of 'panNumber'.
      * @return This builder.
      */
    public com.models.User.Builder setPanNumber(java.lang.String value) {
      validate(fields()[2], value);
      this.panNumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'panNumber' field has been set.
      * @return True if the 'panNumber' field has been set, false otherwise.
      */
    public boolean hasPanNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'panNumber' field.
      * @return This builder.
      */
    public com.models.User.Builder clearPanNumber() {
      panNumber = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'testSchemaField' field.
      * @return The value.
      */
    public java.lang.String getTestSchemaField() {
      return testSchemaField;
    }

    /**
      * Sets the value of the 'testSchemaField' field.
      * @param value The value of 'testSchemaField'.
      * @return This builder.
      */
    public com.models.User.Builder setTestSchemaField(java.lang.String value) {
      validate(fields()[3], value);
      this.testSchemaField = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'testSchemaField' field has been set.
      * @return True if the 'testSchemaField' field has been set, false otherwise.
      */
    public boolean hasTestSchemaField() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'testSchemaField' field.
      * @return This builder.
      */
    public com.models.User.Builder clearTestSchemaField() {
      testSchemaField = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public User build() {
      try {
        User record = new User();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.panNumber = fieldSetFlags()[2] ? this.panNumber : (java.lang.String) defaultValue(fields()[2]);
        record.testSchemaField = fieldSetFlags()[3] ? this.testSchemaField : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
