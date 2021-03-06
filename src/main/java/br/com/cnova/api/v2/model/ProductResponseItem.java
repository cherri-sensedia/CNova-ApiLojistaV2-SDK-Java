package br.com.cnova.api.v2.model;

import java.util.Date;
import br.com.cnova.api.v2.model.SkuSeller;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ProductResponseItem  {
  
  private SkuSeller skuSeller = null;
  private String status = null;
  private Date createdAt = null;

  
  /**
   * SKU do produto do Lojista
   **/
  @ApiModelProperty(value = "SKU do produto do Lojista")
  @JsonProperty("skuSeller")
  public SkuSeller getSkuSeller() {
    return skuSeller;
  }
  public void setSkuSeller(SkuSeller skuSeller) {
    this.skuSeller = skuSeller;
  }

  
  /**
   * Status do produto
   **/
  @ApiModelProperty(value = "Status do produto")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Data de envio do produto
   **/
  @ApiModelProperty(value = "Data de envio do produto")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResponseItem {\n");
    
    sb.append("  skuSeller: ").append(skuSeller).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
