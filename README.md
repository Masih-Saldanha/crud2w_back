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
