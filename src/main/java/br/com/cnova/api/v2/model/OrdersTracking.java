package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.OrderItemReference;
import java.util.Date;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class OrdersTracking  {
  
  private String order = null;
  private List<OrderItemReference> items = new ArrayList<OrderItemReference>() ;
  private String status = null;
  private Date processedAt = null;
  private String errors = null;

  
  /**
   * Dados do pedido
   **/
  @ApiModelProperty(value = "Dados do pedido")
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   * Items do pedido
   **/
  @ApiModelProperty(value = "Items do pedido")
  @JsonProperty("items")
  public List<OrderItemReference> getItems() {
    return items;
  }
  public void setItems(List<OrderItemReference> items) {
    this.items = items;
  }

  
  /**
   * Status do pedido
   **/
  @ApiModelProperty(value = "Status do pedido")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Data do processamento
   **/
  @ApiModelProperty(value = "Data do processamento")
  @JsonProperty("processedAt")
  public Date getProcessedAt() {
    return processedAt;
  }
  public void setProcessedAt(Date processedAt) {
    this.processedAt = processedAt;
  }

  
  /**
   * Erros do envido de pedidos
   **/
  @ApiModelProperty(value = "Erros do envido de pedidos")
  @JsonProperty("errors")
  public String getErrors() {
    return errors;
  }
  public void setErrors(String errors) {
    this.errors = errors;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersTracking {\n");
    
    sb.append("  order: ").append(order).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  processedAt: ").append(processedAt).append("\n");
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
