package br.com.cnova.api.v2.model;

import java.util.*;
import br.com.cnova.api.v2.model.SellerItemPrice;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LoadsSellerItemsPrices  {
  
  private String skuSellerId = null;
  private List<SellerItemPrice> prices = new ArrayList<SellerItemPrice>() ;

  
  /**
   * SKU do produto do lojista que deverá ser alterado
   **/
  @ApiModelProperty(required = true, value = "SKU do produto do lojista que deverá ser alterado")
  @JsonProperty("skuSellerId")
  public String getSkuSellerId() {
    return skuSellerId;
  }
  public void setSkuSellerId(String skuSellerId) {
    this.skuSellerId = skuSellerId;
  }

  
  /**
   * Preço do produto
   **/
  @ApiModelProperty(required = true, value = "Preço do produto")
  @JsonProperty("prices")
  public List<SellerItemPrice> getPrices() {
    return prices;
  }
  public void setPrices(List<SellerItemPrice> prices) {
    this.prices = prices;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadsSellerItemsPrices {\n");
    
    sb.append("  skuSellerId: ").append(skuSellerId).append("\n");
    sb.append("  prices: ").append(prices).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
