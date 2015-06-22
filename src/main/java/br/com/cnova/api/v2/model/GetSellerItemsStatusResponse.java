package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.SellerItemsStatus;
import br.com.cnova.api.v2.model.MetadataEntry;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class GetSellerItemsStatusResponse  {
  
  private List<SellerItemsStatus> skus = new ArrayList<SellerItemsStatus>() ;
  private List<MetadataEntry> metadata = new ArrayList<MetadataEntry>() ;

  
  /**
   * Informações de status de SKU do produto do lojista
   **/
  @ApiModelProperty(value = "Informações de status de SKU do produto do lojista")
  @JsonProperty("skus")
  public List<SellerItemsStatus> getSkus() {
    return skus;
  }
  public void setSkus(List<SellerItemsStatus> skus) {
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
    sb.append("class GetSellerItemsStatusResponse {\n");
    
    sb.append("  skus: ").append(skus).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
