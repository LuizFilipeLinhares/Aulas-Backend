#

### Aluno
- Luiz Filipe Linhares

### Casos de Uso
 - Cadastrar de contas
 - Consulta de Contas
 - Cadastro de pagamentos

### Recursos
 - `Contas`
 - `Pagamento`

### Endpoints

| Descrição | URI | Método | Body | Response | Erro |
| --- | --- | --- | --- | --- | --- |
Buscar conta | /accounts/{id} | GET | Vazio | `200 OK` | `400 Bad Requst` - Conta não encontrado |
Buscar Pagamentos | /payments/{id} | GET | Vazio | `200 OK` | `400 Bad Requst` - pagamento não encontrado |
Cadastrar pagamento | /payments | POST | `{"recipient": "string","amount": "decimal","currency": "string","paymentMethod": "string"}` | `201 Created` | `400 Bad Request` - Dados inválidos |
Cadastrar conta | /accounts | POST | `{ "email": "string", "senha": "string"}` | `200 OK` | `400 Bad Request` - Dados inválidos |
Alterar conta  | /accounts/{id} | PUT | `{ "name" : "string", "phone": "string"}`, | `200 OK` | `400 Bad Request` - Id não encontrado |
Deletar conta | /accounts/{id} | DELETE | Vazio | `200 OK` | `404 Not Found` - Nota não encontrada |
