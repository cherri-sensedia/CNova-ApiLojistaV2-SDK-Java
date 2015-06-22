package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.ProductStock;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class SellerItemsStocks  {
  
  private String skuSellerId = null;
  private List<ProductStock> stocks = new ArrayList<ProductStock>() ;

  
  /**
   * SKU do produto do lojista que deverá ser alterado
   **/
  @ApiModelProperty(value = "SKU do produto do lojista que deverá ser alterado")
  @JsonProperty("skuSellerId")
  public String getSkuSellerId() {
    return skuSellerId;
  }
  public void setSkuSellerId(String skuSellerId) {
    this.skuSellerId = skuSellerId;
  }

  
  /**
   * Estoque do produto
   **/
  @ApiModelProperty(value = "Estoque do produto")
  @JsonProperty("stocks")
  public List<ProductStock> getStocks() {
    return stocks;
  }
  public void setStocks(List<ProductStock> stocks) {
    this.stocks = stocks;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerItemsStocks {\n");
    
    sb.append("  skuSellerId: ").append(skuSellerId).append("\n");
    sb.append("  stocks: ").append(stocks).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
