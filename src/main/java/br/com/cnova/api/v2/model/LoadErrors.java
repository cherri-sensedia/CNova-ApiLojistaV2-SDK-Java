package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.LoadError;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LoadErrors  {
  
  private List<LoadError> errors = new ArrayList<LoadError>() ;

  
  /**
   * Lista contendo os skus que não puderam ser cancelado e o erro para cada um
   **/
  @ApiModelProperty(value = "Lista contendo os skus que não puderam ser cancelado e o erro para cada um")
  @JsonProperty("errors")
  public List<LoadError> getErrors() {
    return errors;
  }
  public void setErrors(List<LoadError> errors) {
    this.errors = errors;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadErrors {\n");
    
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
