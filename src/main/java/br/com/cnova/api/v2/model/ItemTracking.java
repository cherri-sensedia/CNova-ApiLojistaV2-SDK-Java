package br.com.cnova.api.v2.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ItemTracking  {
  
  private String skuSellerId = null;
  private Integer quantity = null;
  private String href = null;

  
  /**
   * SKU ID do produto do Lojista
   **/
  @ApiModelProperty(required = true, value = "SKU ID do produto do Lojista")
  @JsonProperty("skuSellerId")
  public String getSkuSellerId() {
    return skuSellerId;
  }
  public void setSkuSellerId(String skuSellerId) {
    this.skuSellerId = skuSellerId;
  }

  
  /**
   * Quantidade de itens alterados pela operação de tracking
   **/
  @ApiModelProperty(required = true, value = "Quantidade de itens alterados pela operação de tracking")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   * Link para acesso ao item
   **/
  @ApiModelProperty(required = true, value = "Link para acesso ao item")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTracking {\n");
    
    sb.append("  skuSellerId: ").append(skuSellerId).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  href: ").append(href).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
