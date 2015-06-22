package br.com.cnova.api.v2;

import br.com.cnova.api.v2.client.ApiException;
import br.com.cnova.api.v2.client.ApiClient;
import br.com.cnova.api.v2.client.Configuration;

import br.com.cnova.api.v2.model.*;

import java.util.*;

import br.com.cnova.api.v2.model.GetSitesResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class SitesApi {
  private ApiClient apiClient;

  public SitesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SitesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Recupera uma lista de sites
   * &lt;p&gt;Recupera uma lista de sites que operam como Marketplace.&lt;/p&gt;
   * @return GetSitesResponse
   */
  public GetSitesResponse getSites () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/sites".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json; charset=utf-8"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "client_id", "access_token" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (GetSitesResponse) apiClient.deserialize(response, "", GetSitesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
