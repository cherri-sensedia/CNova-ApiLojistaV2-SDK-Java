package br.com.cnova.api.v2.model;

import br.com.cnova.api.v2.model.SellerItemStatus;
import br.com.cnova.api.v2.model.Link;
import br.com.cnova.api.v2.model.Url;
import br.com.cnova.api.v2.model.Dimensions;
import br.com.cnova.api.v2.model.Image;
import br.com.cnova.api.v2.model.ProductAttribute;
import br.com.cnova.api.v2.model.SellerItemStock;
import java.util.*;
import br.com.cnova.api.v2.model.SellerItemPrice;
import br.com.cnova.api.v2.model.Video;
import br.com.cnova.api.v2.model.GiftWrap;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class SellerItem  {
  
  private String skuSellerId = null;
  private String skuSiteId = null;
  private String title = null;
  private String brand = null;
  private List<String> gtin = new ArrayList<String>() ;
  private List<SellerItemStatus> status = new ArrayList<SellerItemStatus>() ;
  private List<SellerItemPrice> prices = new ArrayList<SellerItemPrice>() ;
  private List<SellerItemStock> stocks = new ArrayList<SellerItemStock>() ;
  private List<Url> urls = new ArrayList<Url>() ;
  private List<Image> images = new ArrayList<Image>() ;
  private Link product = null;
  private Dimensions dimensions = null;
  private GiftWrap giftWrap = null;
  private List<ProductAttribute> attributes = new ArrayList<ProductAttribute>() ;
  private List<Video> videos = new ArrayList<Video>() ;

  
  /**
   * SKU ID do produto do Lojista
   **/
  @ApiModelProperty(required = true, value = "SKU ID do produto do Lojista")
  @JsonProperty("skuSellerId")
  public String getSkuSellerId() {
    return skuSellerId;
  }
  public void setSkuSellerId(String skuSellerId) {
    this.skuSellerId = skuSellerId;
  }

  
  /**
   * SKU Id do produto do Extra.
   **/
  @ApiModelProperty(value = "SKU Id do produto do Extra.")
  @JsonProperty("skuSiteId")
  public String getSkuSiteId() {
    return skuSiteId;
  }
  public void setSkuSiteId(String skuSiteId) {
    this.skuSiteId = skuSiteId;
  }

  
  /**
   * Título de venda do produto no Marketplace. Ex Televisor de LCD Sony Bravia 40...
   **/
  @ApiModelProperty(required = true, value = "Título de venda do produto no Marketplace. Ex Televisor de LCD Sony Bravia 40...")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Marca do produto. Ex Sony
   **/
  @ApiModelProperty(required = true, value = "Marca do produto. Ex Sony")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  
  /**
   * Lista que pode conter tanto o código EAN do produto (código de barras) quanto códigos ISBN (geralmente utilizados para livros)
   **/
  @ApiModelProperty(value = "Lista que pode conter tanto o código EAN do produto (código de barras) quanto códigos ISBN (geralmente utilizados para livros)")
  @JsonProperty("gtin")
  public List<String> getGtin() {
    return gtin;
  }
  public void setGtin(List<String> gtin) {
    this.gtin = gtin;
  }

  
  /**
   * Status do produto para cada site
   **/
  @ApiModelProperty(required = true, value = "Status do produto para cada site")
  @JsonProperty("status")
  public List<SellerItemStatus> getStatus() {
    return status;
  }
  public void setStatus(List<SellerItemStatus> status) {
    this.status = status;
  }

  
  /**
   * Informações de preço de venda do produto para cada site
   **/
  @ApiModelProperty(required = true, value = "Informações de preço de venda do produto para cada site")
  @JsonProperty("prices")
  public List<SellerItemPrice> getPrices() {
    return prices;
  }
  public void setPrices(List<SellerItemPrice> prices) {
    this.prices = prices;
  }

  
  /**
   * Informações de estoque do produto para cada site
   **/
  @ApiModelProperty(required = true, value = "Informações de estoque do produto para cada site")
  @JsonProperty("stocks")
  public List<SellerItemStock> getStocks() {
    return stocks;
  }
  public void setStocks(List<SellerItemStock> stocks) {
    this.stocks = stocks;
  }

  
  /**
   * Lista de urls do produto para cada site no qual o mesmo está disponível
   **/
  @ApiModelProperty(value = "Lista de urls do produto para cada site no qual o mesmo está disponível")
  @JsonProperty("urls")
  public List<Url> getUrls() {
    return urls;
  }
  public void setUrls(List<Url> urls) {
    this.urls = urls;
  }

  
  /**
   * Lista de imagens do produto
   **/
  @ApiModelProperty(required = true, value = "Lista de imagens do produto")
  @JsonProperty("images")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }

  
  /**
   * Informações do catálogo de produtos
   **/
  @ApiModelProperty(required = true, value = "Informações do catálogo de produtos")
  @JsonProperty("product")
  public Link getProduct() {
    return product;
  }
  public void setProduct(Link product) {
    this.product = product;
  }

  
  /**
   * Informações de dimensões do produto
   **/
  @ApiModelProperty(required = true, value = "Informações de dimensões do produto")
  @JsonProperty("dimensions")
  public Dimensions getDimensions() {
    return dimensions;
  }
  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  
  /**
   * Informações de embrulho para presente
   **/
  @ApiModelProperty(value = "Informações de embrulho para presente")
  @JsonProperty("giftWrap")
  public GiftWrap getGiftWrap() {
    return giftWrap;
  }
  public void setGiftWrap(GiftWrap giftWrap) {
    this.giftWrap = giftWrap;
  }

  
  /**
   * Características do produto
   **/
  @ApiModelProperty(required = true, value = "Características do produto")
  @JsonProperty("attributes")
  public List<ProductAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<ProductAttribute> attributes) {
    this.attributes = attributes;
  }

  
  /**
   * Lista de videos do produto
   **/
  @ApiModelProperty(value = "Lista de videos do produto")
  @JsonProperty("videos")
  public List<Video> getVideos() {
    return videos;
  }
  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerItem {\n");
    
    sb.append("  skuSellerId: ").append(skuSellerId).append("\n");
    sb.append("  skuSiteId: ").append(skuSiteId).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  brand: ").append(brand).append("\n");
    sb.append("  gtin: ").append(gtin).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  prices: ").append(prices).append("\n");
    sb.append("  stocks: ").append(stocks).append("\n");
    sb.append("  urls: ").append(urls).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("  product: ").append(product).append("\n");
    sb.append("  dimensions: ").append(dimensions).append("\n");
    sb.append("  giftWrap: ").append(giftWrap).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("  videos: ").append(videos).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
