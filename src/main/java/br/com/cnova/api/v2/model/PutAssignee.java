package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.User;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class PutAssignee  {
  
  private User user = null;
  private String visibility = null;
  private String body = null;

  
  /**
   * Dados do usuário que fará o atendimento do Ticket
   **/
  @ApiModelProperty(required = true, value = "Dados do usuário que fará o atendimento do Ticket")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * Se for 'public', o consumidor poderá ver, se for private o consumidor não receberá a mensagem
   **/
  @ApiModelProperty(required = true, value = "Se for 'public', o consumidor poderá ver, se for private o consumidor não receberá a mensagem")
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  
  /**
   * Mensagem a ser enviada como descrição da operação
   **/
  @ApiModelProperty(required = true, value = "Mensagem a ser enviada como descrição da operação")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutAssignee {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("  visibility: ").append(visibility).append("\n");
    sb.append("  body: ").append(body).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
