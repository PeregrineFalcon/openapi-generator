/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Model for testing model name same as property name
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class Name {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Integer name;

  public static final String SERIALIZED_NAME_SNAKE_CASE = "snake_case";
  @SerializedName(SERIALIZED_NAME_SNAKE_CASE)
  private Integer snakeCase;

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private String property;

  public static final String SERIALIZED_NAME_123NUMBER = "123Number";
  @SerializedName(SERIALIZED_NAME_123NUMBER)
  private Integer _123number;

  public Name() {
  }

  public Name(
     Integer snakeCase, 
     Integer _123number
  ) {
    this();
    this.snakeCase = snakeCase;
    this._123number = _123number;
  }

  public Name name(Integer name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }


   /**
   * Get snakeCase
   * @return snakeCase
  **/
  @javax.annotation.Nullable
  public Integer getSnakeCase() {
    return snakeCase;
  }



  public Name property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }


   /**
   * Get _123number
   * @return _123number
  **/
  @javax.annotation.Nullable
  public Integer get123number() {
    return _123number;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123number, name._123number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123number: ").append(toIndentedString(_123number)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("snake_case");
    openapiFields.add("property");
    openapiFields.add("123Number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Name
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Name.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Name is not found in the empty JSON string", Name.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Name.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Name` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Name.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("property") != null && !jsonObj.get("property").isJsonNull()) && !jsonObj.get("property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Name.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Name' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Name> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Name.class));

       return (TypeAdapter<T>) new TypeAdapter<Name>() {
           @Override
           public void write(JsonWriter out, Name value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Name read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Name given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Name
  * @throws IOException if the JSON string is invalid with respect to Name
  */
  public static Name fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Name.class);
  }

 /**
  * Convert an instance of Name to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

