/*
 * Vectores de Saldos
 * La API Vectores de Saldos devuelve un vector con los saldos de la persona en cuestión. La información es mensual, comprende un periodo de 12 meses más el mes en curso e incluye el monto a pagar y los saldos actual y vencido.
 *
 * OpenAPI spec version: 0.0.0
 * Contact: api@circulodecredito.com.mx
 *
 */


package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * error
 */
@ApiModel(description = "error")

public class Error {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  public Error code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Código de error.
   * @return code
  **/
  @ApiModelProperty(example = "VA003", value = "Código de error.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Mensaje de error.
   * @return message
  **/
  @ApiModelProperty(example = "Título de error, El campo \"{Campo}\" es requerido.", value = "Mensaje de error.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

