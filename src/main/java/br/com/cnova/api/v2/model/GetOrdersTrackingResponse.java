package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.OrdersTracking;
import br.com.cnova.api.v2.model.MetadataEntry;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class GetOrdersTrackingResponse  {
  
  private List<OrdersTracking> trackings = new ArrayList<OrdersTracking>() ;
  private List<MetadataEntry> metadata = new ArrayList<MetadataEntry>() ;

  
  /**
   * Informações de tracking do pedido
   **/
  @ApiModelProperty(value = "Informações de tracking do pedido")
  @JsonProperty("trackings")
  public List<OrdersTracking> getTrackings() {
    return trackings;
  }
  public void setTrackings(List<OrdersTracking> trackings) {
    this.trackings = trackings;
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
    sb.append("class GetOrdersTrackingResponse {\n");
    
    sb.append("  trackings: ").append(trackings).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
