package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.CustomerSandbox;
import java.util.*;
import br.com.cnova.api.v2.model.ItemsSandbox;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class OrderSandbox  {
  
  private String site = null;
  private List<ItemsSandbox> items = new ArrayList<ItemsSandbox>() ;
  private CustomerSandbox customer = null;

  
  /**
   * Site para o qual o pedido será criado. . Consulte a lista completa de sites disponíveis no serviço <a href='#!/sites' target='_blank'><strong>GET /sites</strong></a>
   **/
  @ApiModelProperty(required = true, value = "Site para o qual o pedido será criado. . Consulte a lista completa de sites disponíveis no serviço <a href='#!/sites' target='_blank'><strong>GET /sites</strong></a>")
  @JsonProperty("site")
  public String getSite() {
    return site;
  }
  public void setSite(String site) {
    this.site = site;
  }

  
  /**
   * Lista de produtos do pedido
   **/
  @ApiModelProperty(required = true, value = "Lista de produtos do pedido")
  @JsonProperty("items")
  public List<ItemsSandbox> getItems() {
    return items;
  }
  public void setItems(List<ItemsSandbox> items) {
    this.items = items;
  }

  
  /**
   * Informações do cliente
   **/
  @ApiModelProperty(required = true, value = "Informações do cliente")
  @JsonProperty("customer")
  public CustomerSandbox getCustomer() {
    return customer;
  }
  public void setCustomer(CustomerSandbox customer) {
    this.customer = customer;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSandbox {\n");
    
    sb.append("  site: ").append(site).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
