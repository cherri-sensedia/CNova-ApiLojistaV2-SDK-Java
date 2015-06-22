package br.com.cnova.api.v2.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class PutTicketStatus  {
  
  public enum TicketStatusEnum {
     closed,  attendance, 
  };
  private TicketStatusEnum ticketStatus = null;

  
  /**
   * Novo status desejado do Ticket. Fechado <strong> (closed) </strong> e Em Monitoramento <strong> (attendance) </strong>
   **/
  @ApiModelProperty(required = true, value = "Novo status desejado do Ticket. Fechado <strong> (closed) </strong> e Em Monitoramento <strong> (attendance) </strong>")
  @JsonProperty("ticketStatus")
  public TicketStatusEnum getTicketStatus() {
    return ticketStatus;
  }
  public void setTicketStatus(TicketStatusEnum ticketStatus) {
    this.ticketStatus = ticketStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutTicketStatus {\n");
    
    sb.append("  ticketStatus: ").append(ticketStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
