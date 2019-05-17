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

import io.apihub.client.model.Domicilio;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Datos generales de la persona a consultar
 */
@ApiModel(description = "Datos generales de la persona a consultar")

public class Persona {
  @SerializedName("primerNombre")
  private String primerNombre = null;

  @SerializedName("segundoNombre")
  private String segundoNombre = null;

  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;

  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;

  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;

  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;

  @SerializedName("rfc")
  private String rfc = null;

  @SerializedName("curp")
  private String curp = null;

  @SerializedName("domicilio")
  private Domicilio domicilio = null;

  public Persona primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }

   /**
   * Primer nombre de la persona
   * @return primerNombre
  **/
  @ApiModelProperty(example = "ROBERTO", required = true, value = "Primer nombre de la persona")
  public String getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  public Persona segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }

   /**
   * Segundo nombre de la persona
   * @return segundoNombre
  **/
  @ApiModelProperty(example = "CARLOS", value = "Segundo nombre de la persona")
  public String getSegundoNombre() {
    return segundoNombre;
  }

  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }

  public Persona apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }

   /**
   * Apellido paterno de la persona
   * @return apellidoPaterno
  **/
  @ApiModelProperty(example = "SAHAGUN", required = true, value = "Apellido paterno de la persona")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public Persona apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }

   /**
   * Apellido materno de la persona
   * @return apellidoMaterno
  **/
  @ApiModelProperty(example = "ZARAGOZA", value = "Apellido materno de la persona")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public Persona apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }

   /**
   * Apellido adicional de la persona, si tuviere
   * @return apellidoAdicional
  **/
  @ApiModelProperty(value = "Apellido adicional de la persona, si tuviere")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }

  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }

  public Persona fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

   /**
   * Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)
   * @return fechaNacimiento
  **/
  @ApiModelProperty(example = "2001-01-01", required = true, value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Persona rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }

   /**
   * RFC con homoclave de la persona
   * @return rfc
  **/
  @ApiModelProperty(example = "SAZR010101", value = "RFC con homoclave de la persona")
  public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public Persona curp(String curp) {
    this.curp = curp;
    return this;
  }

   /**
   * CURP de la persona, emitida por RENAPO
   * @return curp
  **/
  @ApiModelProperty(example = "SAZR010101HCMLNS09", value = "CURP de la persona, emitida por RENAPO")
  public String getCurp() {
    return curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }

  public Persona domicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }

   /**
   * Datos de un domicilio de la persona
   * @return domicilio
  **/
  @ApiModelProperty(value = "Datos de un domicilio de la persona")
  public Domicilio getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.primerNombre, persona.primerNombre) &&
        Objects.equals(this.segundoNombre, persona.segundoNombre) &&
        Objects.equals(this.apellidoPaterno, persona.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, persona.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, persona.apellidoAdicional) &&
        Objects.equals(this.fechaNacimiento, persona.fechaNacimiento) &&
        Objects.equals(this.rfc, persona.rfc) &&
        Objects.equals(this.curp, persona.curp) &&
        Objects.equals(this.domicilio, persona.domicilio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, apellidoAdicional, fechaNacimiento, rfc, curp, domicilio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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

