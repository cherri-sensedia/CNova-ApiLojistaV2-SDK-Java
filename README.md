# SDK Java para API V2 de Lojistas

Provê os componentes java para uso da API V2 de lojistas.

## Criando um API Client

Antes de utilizar as APIs, é necessário a criação de um client com as configurações de _base path_ e também as credenciais para acesso.

Abaixo segue o código de exemplo:

```java
ApiClient apiClient = new ApiClient();
apiClient.setBasePath("http://sandbox.cnova.com/api/v2");

// Alterar a chave informada com o valor de client_id disponível para sua APP
((ApiKeyAuth)apiClient.getAuthentication("client_id")).setApiKey("ll0rQx9SSszz");

// Alterar a chave informada com o valor de access_token disponível para sua APP
((ApiKeyAuth)apiClient.getAuthentication("access_token")).setApiKey("nllKgtXTMvzz");
```

## APIs Disponíveis

A seguir, são apresentadas as APIs disponíveis para operação dos recursos expostos pela CNova.

### Loads API

API utilizada para realização de operações de carga.

```java
LoadsApi loads = new LoadsApi(apiClient);

// Criação de um novo produto

Product p = new Product();

p.setSkuId("CEL_LGG4");
p.setProductSellerId("CEL");
p.setTitle("Produto de testes LG G4");
p.setDescription("<h2>O novo produto de testes</h2>, LG G4");
p.setBrand("LG");
p.getGtin().add("123456ft");
p.getCategories().add("Teste>API");
p.getImages().add("http://img.g.org/img1.jpeg");

SellerItemPrice price = new SellerItemPrice();
price.setDefault(1999D);
price.setOffer(1799D);

p.setPrice(price);

Stock stock = new Stock();
stock.setQuantity(100);
stock.setCrossDockingTime(0);

p.setStock(stock);

Dimensions dimensions = new Dimensions();
dimensions.setWeight(10);
dimensions.setLength(10);
dimensions.setWidth(10);
dimensions.setHeight(10);

p.setDimensions(dimensions);

ProductAttribute pa = new ProductAttribute();
pa.setName("cor");
pa.setValue("Verde");

p.getAttributes().add(pa);

// Adiciona o novo produto na lista a ser enviada
List<Product> products = new ArrayList<Product>();
products.add(p);

// Envia a carga de produtos
loads.postProducts(products);
```

```java
LoadsApi loads = new LoadsApi(apiClient);		

String createdAt = apiClient.formatDate(new Date());

GetProductsResponse resp1 = loads.getProducts(createdAt + ",*", null, 0, 5);
System.out.println(resp1);
```

### Seller Items API

API utilizada para gerenciamento dos recursos enviados pelo lojista.

```java
SellerItemsApi sellerItems = new SellerItemsApi(apiClient);

GetSellerItemsResponse resp = sellerItems.getSellerItems(null, 0, 5);
System.out.println(resp);
```

### Orders API

API utilizada para gerenciamento de pedidos.

```java
OrdersApi orders = new OrdersApi(apiClient);

// Prepara a atualização de traking
TrackingUpdate body = new TrackingUpdate();

ItemTrackingUpdate it1 = new ItemTrackingUpdate();
it1.setSkuSellerId("23258312-1");

ItemTrackingUpdate it2 = new ItemTrackingUpdate();
it2.setSkuSellerId("23258312-2");

body.getItems().add(it1);
body.getItems().add(it2);

body.setOccurredAt(new Date());
body.setSellerDeliveryId("99995439701");
body.setNumber("01092014");
body.setUrl("servico envio2");
body.setCte("010920141");

Carrier c = new Carrier();
c.setName("Sedex");
c.setCnpj("72874279234");
body.setCarrier(c);

Invoice i = new Invoice();
i.setCnpj("72874279234");
i.setNumber("123");
i.setSerie("456");
i.setIssuedAt(new Date());
i.setAccessKey("01091111111111111111111111111111111111101092");
i.setLinkXml("xlm teste");
i.setLinkDanfe("link nfe teste");
body.setInvoice(i);

// Envia a atualização de traking para a API
orders.postOrderTrackingSent(body, "987601");
```

```java
OrdersApi orders = new OrdersApi(apiClient);

GetOrdersResponse resp = orders.getOrders(0, 5);
for (Order order : resp.getOrders()) {
	System.out.println(order.getId() + " - " + order.getStatus());
}
```

### Tickets API

API utilizada para gerenciamento de tickets.

```java
TicketsApi tickets = new TicketsApi(apiClient);

// Criação de um novo ticket
PostTicket newTicket = new PostTicket();
newTicket.setTo("atendimento+OS_706000500000@mktp.extra.com.br");
newTicket.setBody("Corpo da mensagem do ticket");

tickets.postTicket(newTicket);

// Consulta dos tickets gerados.
Tickets resp = tickets.getTickets("Aberto", null, null, null, null, 0, 5);
System.out.println(resp);
```

### Categories API

API utilziada na obtenção da árvore de categorias disponível.

```java 
CategoriesApi categories = new CategoriesApi(apiClient);

GetCategoriesResponse resp = categories.getCategories(0, 5);

for (Category category : resp.getCategories()) {
	System.out.println(category.getId() + " - " + category.getName());
}
```

### Sites API

API utilizada na obtenção da lista de sites.

```java 
SitesApi sites = new SitesApi(apiClient);
GetSitesResponse resp = sites.getSites();
	
System.out.println(resp);
```

### Warehouses API

API utilizada na obtenção da lista de warehouses (armazéns).

```java 
WarehousesApi warehouses = new WarehousesApi(apiClient);
GetWarehousesResponse resp = warehouses.getWarehouses();

System.out.println(resp);
```
