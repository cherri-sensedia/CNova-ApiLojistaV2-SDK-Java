# SDK Java para API V2 de Lojistas

Provê os componentes java para uso da API V2 de lojistas.

## Criando um API Client

Antes de utilizar as APIs, é necessário a criação de um client com as configurações de _base path_ e também as credenciais para acesso.

Abaixo segue o código de exemplo:

	ApiClient apiClient = new ApiClient();
	apiClient.setBasePath("http://sandbox.cnova.com/api/v2");
		
	// Alterar a chave informada com o valor de client_id disponível para sua APP
	((ApiKeyAuth)apiClient.getAuthentication("client_id")).setApiKey("ll0rQx9SSszz");
	
	// Alterar a chave informada com o valor de access_token disponível para sua APP
	((ApiKeyAuth)apiClient.getAuthentication("access_token")).setApiKey("nllKgtXTMvzz");

## APIs Disponíveis

A seguir, são apresentadas as APIs disponíveis para operação dos recursos expostos pela CNova.

### Loads API

API utilizada para realização de operações de carga.

### Seller Items API

API utilizada para gerenciamento dos recursos enviados pelo lojista.

### Tickets API

API utilizada para gerenciamento de pedidos.

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

	'''java
	SitesApi sites = new SitesApi(apiClient);
	GetSitesResponse resp = sites.getSites();
	
	System.out.println(resp);
	'''

### Warehouses API

API utilizada na obtenção da lista de warehouses (armazéns).

	WarehousesApi warehouses = new WarehousesApi(apiClient);
	GetWarehousesResponse resp = warehouses.getWarehouses();
	
	System.out.println(resp);