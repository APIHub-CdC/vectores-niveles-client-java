package io.apihub.client.model;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class Input {
  
  @JsonAdapter(TipoNegocioEnum.Adapter.class)
  public enum TipoNegocioEnum {
  _1("0001"),    
  _2("0002"),    
  _3("0003"),    
  _4("0004"),    
  _5("0005"),    
  _6("0006"),    
  _7("0007"),    
  _8("0008"),    
  _9("0009"),    
  _10("0010"),    
  _11("0011"),    
  _12("0012"),    
  _13("0013"),    
  _14("0014"),    
  _15("0015"),    
  _16("0016"),    
  _17("0017"),    
  _18("0018"),    
  _19("0019"),    
  _20("0020"),    
  _21("0021"),    
  _22("0022"),    
  _23("0023"),    
  _24("0024"),    
  _25("0025"),    
  _26("0026"),    
  _27("0027"),    
  _28("0028"),    
  _29("0029"),    
  _30("0030"),    
  _31("0031"),    
  _32("0032"),    
  _33("0033"),    
  _34("0034"),    
  _35("0035"),    
  _36("0036"),    
  _37("0037"),    
  _38("0038"),    
  _39("0039"),    
  _40("0040"),    
  _41("0041"),    
  _42("0042"),    
  _43("0043"),    
  _44("0044"),    
  _45("0045"),    
  _46("0046"),    
  _47("0047"),    
  _48("0048"),    
  _49("0049"),    
  _50("0050"),    
  _51("0051"),    
  _52("0052");

    private String value;

    TipoNegocioEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TipoNegocioEnum fromValue(String text) {
      for (TipoNegocioEnum b : TipoNegocioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TipoNegocioEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TipoNegocioEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TipoNegocioEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TipoNegocioEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tipoNegocio")
  private TipoNegocioEnum tipoNegocio = null;

  /**
   * Clave del tipo de contrato.
   */
  @JsonAdapter(TipoContratoEnum.Adapter.class)
  public enum TipoContratoEnum {
    AA("AA"),
    
    HB("HB"),
    
    AB("AB"),
    
    HE("HE"),
    
    AE("AE"),
    
    HV("HV"),
    
    AM("AM"),
    
    LC("LC"),
    
    AR("AR"),
    
    MC("MC"),
    
    AV("AV"),
    
    NG("NG"),
    
    BC("BC"),
    
    PB("PB"),
    
    BL("BL"),
    
    PC("PC"),
    
    BR("BR"),
    
    PE("PE"),
    
    CA("CA"),
    
    PG("PG"),
    
    CC("CC"),
    
    PQ("PQ"),
    
    CF("CF"),
    
    PM("PM"),
    
    CO("CO"),
    
    PN("PN"),
    
    PP("PP"),
    
    ED("ED"),
    
    SH("SH"),
    
    EQ("EQ"),
    
    TC("TC"),
    
    FF("FF"),
    
    TD("TD"),
    
    FI("FI"),
    
    TG("TG"),
    
    FT("FT"),
    
    TS("TS"),
    
    GS("GS"),
    
    VR("VR"),
    
    OT("OT"),
    
    NC("NC");

    private String value;

    TipoContratoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TipoContratoEnum fromValue(String text) {
      for (TipoContratoEnum b : TipoContratoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TipoContratoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TipoContratoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TipoContratoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TipoContratoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tipoContrato")
  private TipoContratoEnum tipoContrato = null;

  @SerializedName("persona")
  private Persona persona = null;

  public Input tipoNegocio(TipoNegocioEnum tipoNegocio) {
    this.tipoNegocio = tipoNegocio;
    return this;
  }

   /**
   * Clave del tipo de negocio.
   * @return tipoNegocio
  **/
  public TipoNegocioEnum getTipoNegocio() {
    return tipoNegocio;
  }

  public void setTipoNegocio(TipoNegocioEnum tipoNegocio) {
    this.tipoNegocio = tipoNegocio;
  }

  public Input tipoContrato(TipoContratoEnum tipoContrato) {
    this.tipoContrato = tipoContrato;
    return this;
  }

  public TipoContratoEnum getTipoContrato() {
    return tipoContrato;
  }

  public void setTipoContrato(TipoContratoEnum tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public Input persona(Persona persona) {
    this.persona = persona;
    return this;
  }

  public Persona getPersona() {
    return persona;
  }

  public void setPersona(Persona persona) {
    this.persona = persona;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;
    return Objects.equals(this.tipoNegocio, input.tipoNegocio) &&
        Objects.equals(this.tipoContrato, input.tipoContrato) &&
        Objects.equals(this.persona, input.persona);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoNegocio, tipoContrato, persona);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    tipoNegocio: ").append(toIndentedString(tipoNegocio)).append("\n");
    sb.append("    tipoContrato: ").append(toIndentedString(tipoContrato)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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

