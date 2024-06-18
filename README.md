# Crud 2w (Backend)
## Instalação e Execução
### Pré-requisitos:

- Java JDK 17 ou superior instalado
Maven para build e gerenciamento de dependências.
- Git instalado na máquina.

### Instalação:
```bash
$ git clone https://github.com/Masih-Saldanha/crud2w_back.git

$ cd crud2w_back
```

### Execução:
```bash
$ ./mvnw spring-boot:run
```
- O servidor estará acessível em http://localhost:8080.
- Após isso basta seguir o README do frontend que automáticamente o frontend estará conectado com o backend.

## API:

A documentação da API pode ser acessada usando o Postman Collection. Siga os passos abaixo para importar e explorar a coleção de requisições:

### Baixando o Postman:

Baixe e instale o Postman se ainda não tiver instalado e logue em sua conta.

### Importando a Postman Collection:

- Importe o Postman Collection aqui: [<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://app.getpostman.com/run-collection/31646133-663126e1-6fd5-483e-9d33-ac757e527868?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D31646133-663126e1-6fd5-483e-9d33-ac757e527868%26entityType%3Dcollection%26workspaceId%3D9d95541f-eb9d-4203-b1cb-be3485f39086#?env%5BCRUD%202w%20Environment%5D=W3sia2V5IjoiaWQiLCJ2YWx1ZSI6IiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiMTI1Iiwic2Vzc2lvbkluZGV4IjowfSx7ImtleSI6InByb2R1dG9JZCIsInZhbHVlIjoiIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQiLCJzZXNzaW9uVmFsdWUiOiIxMjUiLCJzZXNzaW9uSW5kZXgiOjF9XQ==).

- Faça o fork da Collection para o seu Workspace e escolha o Environment "CRUD 2w Environment".
- Após isso, você poderá ver todas as requisições disponíveis, incluindo exemplos de requisições e respostas, e parâmetros necessários para cada endpoint.
- Caso queira rodar executar a Collection, execute os testes através do seu programa/app PostMan e não pelo site, uma vez que os testes são feito no localhost e tenha certeza que está com o backend já rodando localmente.

### Caso tenha tido algum problema, segue a documentação da API por escrito:

```
- POST /api/produto
    - Rota para criação do produto
    - headers: {}
    - body: {
        "nome": "Nome teste",
        "tipo": "ELETRONICO", // ou "MOVEL"
        "descricao": "Descricao teste"
    }
```
```
- GET /api/produto
    - Rota que retorna uma lista com todos os produtos
    - headers: {}
    - body: {}
```
```
- PUT /api/produto/{id}
    - Rota para editar um produto específico pela sua Id
    - headers: {}
    - body: {
        "nome": "Nome teste editado",
        "tipo": "MOVEL", // ou "ELETRONICO"
        "descricao": "Descricao teste editado"
    }
```
```
- DELETE /api/produto/{id}
    - Rota para deletar um produto específico pela Id
    - headers: {}
    - body: {}
```
