package io.apihub.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Datos de la respuesta de Vectores de Saldos")

public class Respuesta {
    @SerializedName("vectoresNivel")
    private List<Vectores> vectoresNivel = new ArrayList<Vectores>();
  
    public Respuesta vectoresNivel(List<Vectores> vectoresNivel) {
      this.vectoresNivel = vectoresNivel;
      return this;
    }
  
    public Respuesta addVectoresNivelItem(Vectores vectoresNivelItem) {
      this.vectoresNivel.add(vectoresNivelItem);
      return this;
    }
  
    @ApiModelProperty(required = true, value = "Lista de Objecto de vectores nivel")
    public List<Vectores> getVectoresNivel() {
      return vectoresNivel;
    }
  
    public void setVectoresNivel(List<Vectores> vectoresNivel) {
      this.vectoresNivel = vectoresNivel;
    }
  
  
    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Respuesta response = (Respuesta) o;
      return Objects.equals(this.vectoresNivel, response.vectoresNivel);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(vectoresNivel);
    }
  
  
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Response {\n");
      
      sb.append("    vectoresNivel: ").append(toIndentedString(vectoresNivel)).append("\n");
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