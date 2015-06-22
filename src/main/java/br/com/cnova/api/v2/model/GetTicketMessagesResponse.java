package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.Messages;
import br.com.cnova.api.v2.model.MetadataEntry;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class GetTicketMessagesResponse  {
  
  private List<Messages> messages = new ArrayList<Messages>() ;
  private List<MetadataEntry> metadata = new ArrayList<MetadataEntry>() ;

  
  /**
   * Mensagens
   **/
  @ApiModelProperty(value = "Mensagens")
  @JsonProperty("messages")
  public List<Messages> getMessages() {
    return messages;
  }
  public void setMessages(List<Messages> messages) {
    this.messages = messages;
  }

  
  /**
   * Metadados do status
   **/
  @ApiModelProperty(required = true, value = "Metadados do status")
  @JsonProperty("metadata")
  public List<MetadataEntry> getMetadata() {
    return metadata;
  }
  public void setMetadata(List<MetadataEntry> metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTicketMessagesResponse {\n");
    
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
