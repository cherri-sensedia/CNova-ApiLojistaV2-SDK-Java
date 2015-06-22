package br.com.cnova.api.v2.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Dimensions  {
  
  private Integer weight = null;
  private Integer length = null;
  private Integer width = null;
  private Integer height = null;

  
  /**
   * Peso do produto, em quilos. Não pode ser 0 (zero) e deve ter no máximo duas casas decimais
   **/
  @ApiModelProperty(required = true, value = "Peso do produto, em quilos. Não pode ser 0 (zero) e deve ter no máximo duas casas decimais")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  /**
   * Comprimento do produto, em metros. Não pode ser 0 (zero) e deve ter no máximo duas casas decimais
   **/
  @ApiModelProperty(required = true, value = "Comprimento do produto, em metros. Não pode ser 0 (zero) e deve ter no máximo duas casas decimais")
  @JsonProperty("length")
  public Integer getLength() {
    return length;
  }
  public void setLength(Integer length) {
    this.length = length;
  }

  
  /**
   * Largura do produto, em metros. Não pode ser 0 (zero) e deve ter no máximo duas casas decimais
   **/
  @ApiModelProperty(required = true, value = "Largura do produto, em metros. Não pode ser 0 (zero) e deve ter no máximo duas casas decimais")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   * Altura do produto, em metros. Não pode ser 0 (zero) e deve ter no máximo duas casas decimais
   **/
  @ApiModelProperty(required = true, value = "Altura do produto, em metros. Não pode ser 0 (zero) e deve ter no máximo duas casas decimais")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  length: ").append(length).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
