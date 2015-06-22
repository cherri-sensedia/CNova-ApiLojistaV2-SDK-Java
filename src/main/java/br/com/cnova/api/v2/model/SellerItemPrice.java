package br.com.cnova.api.v2.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class SellerItemPrice  {
  
  private Double offer = null;
  private String site = null;
  private Double _default = null;

  
  /**
   * Preço real de venda. Preço por do produto no Marketplace
   **/
  @ApiModelProperty(required = true, value = "Preço real de venda. Preço por do produto no Marketplace")
  @JsonProperty("offer")
  public Double getOffer() {
    return offer;
  }
  public void setOffer(Double offer) {
    this.offer = offer;
  }

  
  /**
   * Site no qual o produto ficará ou não disponível. Os possíveis sites são: 'EX', 'PF', 'CB', 'EH', 'BT', 'CD'. Consulte a lista completa de sites disponíveis no serviço <a href='#!/sites' target='_blank'><strong>GET /sites</strong></a>
   **/
  @ApiModelProperty(required = true, value = "Site no qual o produto ficará ou não disponível. Os possíveis sites são: 'EX', 'PF', 'CB', 'EH', 'BT', 'CD'. Consulte a lista completa de sites disponíveis no serviço <a href='#!/sites' target='_blank'><strong>GET /sites</strong></a>")
  @JsonProperty("site")
  public String getSite() {
    return site;
  }
  public void setSite(String site) {
    this.site = site;
  }

  
  /**
   * Preço de do produto no Marketplace
   **/
  @ApiModelProperty(required = true, value = "Preço de do produto no Marketplace")
  @JsonProperty("default")
  public Double getDefault() {
    return _default;
  }
  public void setDefault(Double _default) {
    this._default = _default;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerItemPrice {\n");
    
    sb.append("  offer: ").append(offer).append("\n");
    sb.append("  site: ").append(site).append("\n");
    sb.append("  _default: ").append(_default).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
