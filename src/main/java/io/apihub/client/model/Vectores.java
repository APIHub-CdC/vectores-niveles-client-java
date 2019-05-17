package io.apihub.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Vectores {
  @SerializedName("numActualiza")
  private Integer numActualiza = null;

  @SerializedName("tipoNegocio")
  private String tipoNegocio = null;

  @SerializedName("claveOtorgante")
  private String claveOtorgante = null;

  @SerializedName("ccrednumcta")
  private String ccrednumcta = null;

  @SerializedName("claveTipoContrato")
  private String claveTipoContrato = null;

  @SerializedName("fechaMontoPagoMaximo")
  private String fechaMontoPagoMaximo = null;

  @SerializedName("montoPagoMaximo")
  private BigDecimal montoPagoMaximo = null;

  @SerializedName("montoPagoPromedio")
  private BigDecimal montoPagoPromedio = null;

  @SerializedName("fechaSaldoMaximo")
  private String fechaSaldoMaximo = null;

  @SerializedName("saldoMaximo")
  private BigDecimal saldoMaximo = null;

  @SerializedName("saldoPromedio")
  private BigDecimal saldoPromedio = null;

  @SerializedName("fechaSaldoVencidoMaximo")
  private String fechaSaldoVencidoMaximo = null;

  @SerializedName("saldoVencidoMaximo")
  private BigDecimal saldoVencidoMaximo = null;

  @SerializedName("saldoVencidoPromedio")
  private BigDecimal saldoVencidoPromedio = null;

  public Vectores numActualiza(Integer numActualiza) {
    this.numActualiza = numActualiza;
    return this;
  }

  public Integer getNumActualiza() {
    return numActualiza;
  }

  public void setNumActualiza(Integer numActualiza) {
    this.numActualiza = numActualiza;
  }

  public Vectores tipoNegocio(String tipoNegocio) {
    this.tipoNegocio = tipoNegocio;
    return this;
  }

  public String getTipoNegocio() {
    return tipoNegocio;
  }

  public void setTipoNegocio(String tipoNegocio) {
    this.tipoNegocio = tipoNegocio;
  }

  public Vectores claveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
    return this;
  }

  public String getClaveOtorgante() {
    return claveOtorgante;
  }

  public void setClaveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
  }

  public Vectores ccrednumcta(String ccrednumcta) {
    this.ccrednumcta = ccrednumcta;
    return this;
  }

  public String getCcrednumcta() {
    return ccrednumcta;
  }

  public void setCcrednumcta(String ccrednumcta) {
    this.ccrednumcta = ccrednumcta;
  }

  public Vectores claveTipoContrato(String claveTipoContrato) {
    this.claveTipoContrato = claveTipoContrato;
    return this;
  }

  public String getClaveTipoContrato() {
    return claveTipoContrato;
  }

  public void setClaveTipoContrato(String claveTipoContrato) {
    this.claveTipoContrato = claveTipoContrato;
  }

  public Vectores fechaMontoPagoMaximo(String fechaMontoPagoMaximo) {
    this.fechaMontoPagoMaximo = fechaMontoPagoMaximo;
    return this;
  }

  public String getFechaMontoPagoMaximo() {
    return fechaMontoPagoMaximo;
  }

  public void setFechaMontoPagoMaximo(String fechaMontoPagoMaximo) {
    this.fechaMontoPagoMaximo = fechaMontoPagoMaximo;
  }

  public Vectores montoPagoMaximo(BigDecimal montoPagoMaximo) {
    this.montoPagoMaximo = montoPagoMaximo;
    return this;
  }

  public BigDecimal getMontoPagoMaximo() {
    return montoPagoMaximo;
  }

  public void setMontoPagoMaximo(BigDecimal montoPagoMaximo) {
    this.montoPagoMaximo = montoPagoMaximo;
  }

  public Vectores montoPagoPromedio(BigDecimal montoPagoPromedio) {
    this.montoPagoPromedio = montoPagoPromedio;
    return this;
  }

  public BigDecimal getMontoPagoPromedio() {
    return montoPagoPromedio;
  }

  public void setMontoPagoPromedio(BigDecimal montoPagoPromedio) {
    this.montoPagoPromedio = montoPagoPromedio;
  }

  public Vectores fechaSaldoMaximo(String fechaSaldoMaximo) {
    this.fechaSaldoMaximo = fechaSaldoMaximo;
    return this;
  }

  public String getFechaSaldoMaximo() {
    return fechaSaldoMaximo;
  }

  public void setFechaSaldoMaximo(String fechaSaldoMaximo) {
    this.fechaSaldoMaximo = fechaSaldoMaximo;
  }

  public Vectores saldoMaximo(BigDecimal saldoMaximo) {
    this.saldoMaximo = saldoMaximo;
    return this;
  }

  public BigDecimal getSaldoMaximo() {
    return saldoMaximo;
  }

  public void setSaldoMaximo(BigDecimal saldoMaximo) {
    this.saldoMaximo = saldoMaximo;
  }

  public Vectores saldoPromedio(BigDecimal saldoPromedio) {
    this.saldoPromedio = saldoPromedio;
    return this;
  }

  public BigDecimal getSaldoPromedio() {
    return saldoPromedio;
  }

  public void setSaldoPromedio(BigDecimal saldoPromedio) {
    this.saldoPromedio = saldoPromedio;
  }

  public Vectores fechaSaldoVencidoMaximo(String fechaSaldoVencidoMaximo) {
    this.fechaSaldoVencidoMaximo = fechaSaldoVencidoMaximo;
    return this;
  }

  public String getFechaSaldoVencidoMaximo() {
    return fechaSaldoVencidoMaximo;
  }

  public void setFechaSaldoVencidoMaximo(String fechaSaldoVencidoMaximo) {
    this.fechaSaldoVencidoMaximo = fechaSaldoVencidoMaximo;
  }

  public Vectores saldoVencidoMaximo(BigDecimal saldoVencidoMaximo) {
    this.saldoVencidoMaximo = saldoVencidoMaximo;
    return this;
  }

  public BigDecimal getSaldoVencidoMaximo() {
    return saldoVencidoMaximo;
  }

  public void setSaldoVencidoMaximo(BigDecimal saldoVencidoMaximo) {
    this.saldoVencidoMaximo = saldoVencidoMaximo;
  }

  public Vectores saldoVencidoPromedio(BigDecimal saldoVencidoPromedio) {
    this.saldoVencidoPromedio = saldoVencidoPromedio;
    return this;
  }

  public BigDecimal getSaldoVencidoPromedio() {
    return saldoVencidoPromedio;
  }

  public void setSaldoVencidoPromedio(BigDecimal saldoVencidoPromedio) {
    this.saldoVencidoPromedio = saldoVencidoPromedio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vectores vectores = (Vectores) o;
    return Objects.equals(this.numActualiza, vectores.numActualiza) &&
        Objects.equals(this.tipoNegocio, vectores.tipoNegocio) &&
        Objects.equals(this.claveOtorgante, vectores.claveOtorgante) &&
        Objects.equals(this.ccrednumcta, vectores.ccrednumcta) &&
        Objects.equals(this.claveTipoContrato, vectores.claveTipoContrato) &&
        Objects.equals(this.fechaMontoPagoMaximo, vectores.fechaMontoPagoMaximo) &&
        Objects.equals(this.montoPagoMaximo, vectores.montoPagoMaximo) &&
        Objects.equals(this.montoPagoPromedio, vectores.montoPagoPromedio) &&
        Objects.equals(this.fechaSaldoMaximo, vectores.fechaSaldoMaximo) &&
        Objects.equals(this.saldoMaximo, vectores.saldoMaximo) &&
        Objects.equals(this.saldoPromedio, vectores.saldoPromedio) &&
        Objects.equals(this.fechaSaldoVencidoMaximo, vectores.fechaSaldoVencidoMaximo) &&
        Objects.equals(this.saldoVencidoMaximo, vectores.saldoVencidoMaximo) &&
        Objects.equals(this.saldoVencidoPromedio, vectores.saldoVencidoPromedio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numActualiza, tipoNegocio, claveOtorgante, ccrednumcta, claveTipoContrato, fechaMontoPagoMaximo, montoPagoMaximo, montoPagoPromedio, fechaSaldoMaximo, saldoMaximo, saldoPromedio, fechaSaldoVencidoMaximo, saldoVencidoMaximo, saldoVencidoPromedio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vectores {\n");
    
    sb.append("    numActualiza: ").append(toIndentedString(numActualiza)).append("\n");
    sb.append("    tipoNegocio: ").append(toIndentedString(tipoNegocio)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    ccrednumcta: ").append(toIndentedString(ccrednumcta)).append("\n");
    sb.append("    claveTipoContrato: ").append(toIndentedString(claveTipoContrato)).append("\n");
    sb.append("    fechaMontoPagoMaximo: ").append(toIndentedString(fechaMontoPagoMaximo)).append("\n");
    sb.append("    montoPagoMaximo: ").append(toIndentedString(montoPagoMaximo)).append("\n");
    sb.append("    montoPagoPromedio: ").append(toIndentedString(montoPagoPromedio)).append("\n");
    sb.append("    fechaSaldoMaximo: ").append(toIndentedString(fechaSaldoMaximo)).append("\n");
    sb.append("    saldoMaximo: ").append(toIndentedString(saldoMaximo)).append("\n");
    sb.append("    saldoPromedio: ").append(toIndentedString(saldoPromedio)).append("\n");
    sb.append("    fechaSaldoVencidoMaximo: ").append(toIndentedString(fechaSaldoVencidoMaximo)).append("\n");
    sb.append("    saldoVencidoMaximo: ").append(toIndentedString(saldoVencidoMaximo)).append("\n");
    sb.append("    saldoVencidoPromedio: ").append(toIndentedString(saldoVencidoPromedio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}