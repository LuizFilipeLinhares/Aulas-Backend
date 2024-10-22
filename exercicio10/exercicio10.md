#

### Aluno
- Luiz Filipe Linhares

### Casos de Uso
 - Cadastrar de contas
 - Consulta de Contas

### Recursos
 - `Notas`
 - `Usuários`

### Endpoints

| Descrição | URI | Método | Body | Response | Erro |
| --- | --- | --- | --- | --- | --- |
Buscar conta | /accounts/{id} | GET | Vazio | `200 OK` | `404 Not Found` - Usuário não encontrado |
Logar | /usuario/login | PUT | `{"email": "string", "senha": "string"}` | `200 OK` | `404 Not Found` - Login inválido |
Cadastrar usuário | /usuario/cadastrar | POST | `{"nome": "string", "email": "string", "senha": "string"}` | `201 Created` | `400 Bad Request` - Dados inválidos |
Alterar usuário | /usuario/alterar/{id} | PUT | `{"nome": "string", "email": "string", "senha": "string"}` | `200 OK` | `400 Bad Request` - Dados inválidos |
Inativar usuário  | /usuario/inativar/{id} | PUT | Vazio | `200 OK` | `404 Not Found` - Usuário não encontrado |
Listar notas | /notas/listar/{usuario_id} | GET | Vazio | `200 OK` | Vazio |
Buscar nota | /notas/{id} | GET | Vazio | `200 OK` | `404 Not Found` - Nota não encontrada |
Cadastrar nota | /notas/cadastrar | POST | `{"titulo": "string", "descricao": "string", "usuario_id": "number"}` | `201 Created` | `400 Bad Request` - Dados inválidos |
Alterar nota | /notas/{id} | PUT | `{"titulo": "string", "descricao": "string"}` | `200 OK` | `400 Bad Request` - Dados inválidos |
Deletar nota | /notas/{id} | DELETE | Vazio | `200 OK` | `404 Not Found` - Nota não encontrada |