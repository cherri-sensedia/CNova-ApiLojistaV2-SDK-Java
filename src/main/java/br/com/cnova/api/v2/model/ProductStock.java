package br.com.cnova.api.v2.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ProductStock  {
  
  private Integer quantity = null;
  private Integer crossDockingTime = null;
  private Integer warehouse = null;

  
  /**
   * Quantidade do estoque
   **/
  @ApiModelProperty(value = "Quantidade do estoque")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   * Tempo de preparação/fabricação do produto em dias. Esse tempo é incluído no cálculo de frete
   **/
  @ApiModelProperty(value = "Tempo de preparação/fabricação do produto em dias. Esse tempo é incluído no cálculo de frete")
  @JsonProperty("crossDockingTime")
  public Integer getCrossDockingTime() {
    return crossDockingTime;
  }
  public void setCrossDockingTime(Integer crossDockingTime) {
    this.crossDockingTime = crossDockingTime;
  }

  
  /**
   * ID do warehouse. Ele deve ser utilizado nas atualizações de estoque dos produtos
   **/
  @ApiModelProperty(value = "ID do warehouse. Ele deve ser utilizado nas atualizações de estoque dos produtos")
  @JsonProperty("warehouse")
  public Integer getWarehouse() {
    return warehouse;
  }
  public void setWarehouse(Integer warehouse) {
    this.warehouse = warehouse;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductStock {\n");
    
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  crossDockingTime: ").append(crossDockingTime).append("\n");
    sb.append("  warehouse: ").append(warehouse).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
