package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.OrderItemReference;
import br.com.cnova.api.v2.model.Carrier;
import java.util.Date;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LoadsOrdersTrackings  {
  
  private Integer order = null;
  private List<OrderItemReference> items = new ArrayList<OrderItemReference>() ;
  private Date occurredAt = null;
  private String url = null;
  private String number = null;
  private String sellerDeliveryId = null;
  private String cte = null;
  private List<Carrier> carrier = new ArrayList<Carrier>() ;
  private Integer invoice = null;

  
  /**
   * Pedido
   **/
  @ApiModelProperty(value = "Pedido")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  
  /**
   * Itens do pedido
   **/
  @ApiModelProperty(value = "Itens do pedido")
  @JsonProperty("items")
  public List<OrderItemReference> getItems() {
    return items;
  }
  public void setItems(List<OrderItemReference> items) {
    this.items = items;
  }

  
  /**
   * Data da ocorrencia
   **/
  @ApiModelProperty(value = "Data da ocorrencia")
  @JsonProperty("occurredAt")
  public Date getOccurredAt() {
    return occurredAt;
  }
  public void setOccurredAt(Date occurredAt) {
    this.occurredAt = occurredAt;
  }

  
  /**
   * Url para consulta na transportadora
   **/
  @ApiModelProperty(value = "Url para consulta na transportadora")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * ID do objeto na transportadora
   **/
  @ApiModelProperty(value = "ID do objeto na transportadora")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  
  /**
   * ID único da entrega para o lojista no parceiro, não pode haver repetição deste ID
   **/
  @ApiModelProperty(value = "ID único da entrega para o lojista no parceiro, não pode haver repetição deste ID")
  @JsonProperty("sellerDeliveryId")
  public String getSellerDeliveryId() {
    return sellerDeliveryId;
  }
  public void setSellerDeliveryId(String sellerDeliveryId) {
    this.sellerDeliveryId = sellerDeliveryId;
  }

  
  /**
   * Conhecimento de Transporte Eletôniconico
   **/
  @ApiModelProperty(value = "Conhecimento de Transporte Eletôniconico")
  @JsonProperty("cte")
  public String getCte() {
    return cte;
  }
  public void setCte(String cte) {
    this.cte = cte;
  }

  
  /**
   * Informações da Transportadora
   **/
  @ApiModelProperty(value = "Informações da Transportadora")
  @JsonProperty("carrier")
  public List<Carrier> getCarrier() {
    return carrier;
  }
  public void setCarrier(List<Carrier> carrier) {
    this.carrier = carrier;
  }

  
  /**
   * Informações sobre a Nota Fiscal de compra
   **/
  @ApiModelProperty(value = "Informações sobre a Nota Fiscal de compra")
  @JsonProperty("invoice")
  public Integer getInvoice() {
    return invoice;
  }
  public void setInvoice(Integer invoice) {
    this.invoice = invoice;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadsOrdersTrackings {\n");
    
    sb.append("  order: ").append(order).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  occurredAt: ").append(occurredAt).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  sellerDeliveryId: ").append(sellerDeliveryId).append("\n");
    sb.append("  cte: ").append(cte).append("\n");
    sb.append("  carrier: ").append(carrier).append("\n");
    sb.append("  invoice: ").append(invoice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
