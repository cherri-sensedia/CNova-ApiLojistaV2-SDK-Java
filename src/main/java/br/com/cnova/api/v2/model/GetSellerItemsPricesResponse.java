package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.SellerItemsPricesStatus;
import br.com.cnova.api.v2.model.MetadataEntry;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class GetSellerItemsPricesResponse  {
  
  private List<SellerItemsPricesStatus> skus = new ArrayList<SellerItemsPricesStatus>() ;
  private List<MetadataEntry> metadata = new ArrayList<MetadataEntry>() ;

  
  /**
   * Skus do pedido
   **/
  @ApiModelProperty(value = "Skus do pedido")
  @JsonProperty("skus")
  public List<SellerItemsPricesStatus> getSkus() {
    return skus;
  }
  public void setSkus(List<SellerItemsPricesStatus> skus) {
    this.skus = skus;
  }

  
  /**
   * Dados adicionais da consulta
   **/
  @ApiModelProperty(value = "Dados adicionais da consulta")
  @JsonProperty("metadata")
  public List<MetadataEntry> getMetadata() {
    return metadata;
  }
  public void setMetadata(List<MetadataEntry> metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSellerItemsPricesResponse {\n");
    
    sb.append("  skus: ").append(skus).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
