package br.com.cnova.api.v2.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Video  {
  
  private String name = null;
  private String type = null;
  private String url = null;
  private String thumbnail = null;
  private String embedded = null;

  
  /**
   * Nome do vídeo
   **/
  @ApiModelProperty(required = true, value = "Nome do vídeo")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Formato do vídeo
   **/
  @ApiModelProperty(required = true, value = "Formato do vídeo")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * URL do vídeo do produto
   **/
  @ApiModelProperty(required = true, value = "URL do vídeo do produto")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * URL de thumbnail
   **/
  @ApiModelProperty(value = "URL de thumbnail")
  @JsonProperty("thumbnail")
  public String getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  
  /**
   * URL embedded do vídeo
   **/
  @ApiModelProperty(value = "URL embedded do vídeo")
  @JsonProperty("embedded")
  public String getEmbedded() {
    return embedded;
  }
  public void setEmbedded(String embedded) {
    this.embedded = embedded;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  thumbnail: ").append(thumbnail).append("\n");
    sb.append("  embedded: ").append(embedded).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
