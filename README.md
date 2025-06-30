# 🛡️ Portaria UFN

Este sistema permite a **gestão de usuários, itens e reservas** em ambientes controlados, como instituições de ensino. Com ele, porteiros podem controlar a retirada e devolução de **chaves**, **controles** e outros itens.

---

# 👨🏻‍💼 Integrantes do grupo

> 🙋🏻‍♂️ Matheus Nogueira Albuquerque <br>
> 🙋🏻‍♂️ Gilberto Morales <br>
> 🙋🏻‍♂️ Romeo Noro Guterres <br>
> 🙋🏻‍♂️ Anthony Guedes <br>

---

## 🧭 Fluxo Principal

1. 👤 Criar usuários (alunos, professores, porteiros)
2. 🔐 Cadastrar itens (chaves, controles, etc.)
3. 📋 Fazer reservas usando matrícula
4. 📦 Registrar retirada quando o usuário buscar o item
5. 🔁 Registrar devolução quando o item for devolvido

---

## 📡 Endpoints da API

### 👥 USUÁRIOS `/api/users`

- `GET /api/users` – Listar todos os usuários
- `GET /api/users/{id}` – Buscar usuário por ID
- `GET /api/users/matricula/{matricula}` – Buscar por matrícula/SIAPE
- `POST /api/users` – Criar novo usuário
- `PUT /api/users/{id}` – Atualizar usuário
- `DELETE /api/users/{id}` – Remover usuário

---

### 🔑 ITENS `/api/items`

- `GET /api/items` – Listar todos os itens
- `GET /api/items/disponiveis` – Listar itens disponíveis
- `GET /api/items/{id}` – Buscar item por ID
- `GET /api/items/tipo/{tipo}` – Filtrar por tipo (`CHAVE`, `CONTROLE`, `OUTRO`)
- `GET /api/items/disponiveis/tipo/{tipo}` – Itens disponíveis por tipo
- `POST /api/items` – Criar novo item
- `PUT /api/items/{id}` – Atualizar item
- `PATCH /api/items/{id}/disponibilidade?disponivel={true|false}` – Alterar disponibilidade
- `DELETE /api/items/{id}` – Remover item

---

### 📅 RESERVAS `/api/reservas`

- `GET /api/reservas` – Listar todas as reservas
- `GET /api/reservas/{id}` – Buscar reserva por ID
- `GET /api/reservas/item/{itemId}` – Reservas por item
- `GET /api/reservas/usuario/matricula/{matricula}` – Reservas por usuário
- `GET /api/reservas/ativas/matricula/{matricula}` – Reservas ativas por usuário
- `POST /api/reservas` – Criar nova reserva
- `PATCH /api/reservas/{reservaId}/retirada` – Registrar retirada
- `PATCH /api/reservas/{reservaId}/devolucao` – Registrar devolução

---

### 🏢 PORTARIA `/api/portaria`

- `GET /api/portaria/cracha/{matricula}` – Ler crachá (buscar usuário)
- `POST /api/portaria/cracha/{matricula}/reservar/{itemId}` – Reservar via crachá
- `POST /api/portaria/cracha/{matricula}/retirar/{reservaId}` – Retirar via crachá
- `POST /api/portaria/cracha/{matricula}/devolver/{reservaId}` – Devolver via crachá
- `GET /api/portaria/cracha/{matricula}/reservas-ativas` – Consultar reservas ativas via crachá
- `GET /api/portaria/dashboard` – Dashboard para porteiros  

---

## 📈 Diagramas

### Diagrama de Classe 

> Está apenas o do User pois o IntelliJ está com um bug ao gerar os outros, esta puxando outras classes mesmo não selecionadas, mas todas seguem a logica de: <br> <br>
> Model -> Repository -> Controller -> Service. <br> <br>
> Igual o exemplo do User abaixo

User <br>
![image](https://github.com/user-attachments/assets/c1b50b94-f3c2-46ab-a275-cee9789b52f5)

### Diagrama de Domínio 

![image](https://github.com/user-attachments/assets/efc0a6e2-9382-45e5-8430-cda694f6de2d)

### Diagrama de Sequência

Criar item <br>
![image](https://github.com/user-attachments/assets/75675d80-fea5-4d64-b79c-f1a3892aff7c)

Reservar por crachá <br>
![image](https://github.com/user-attachments/assets/fb320684-82cd-41c3-a434-7b6cbc95c863)

Retirar por crachá <br>
![image](https://github.com/user-attachments/assets/977d431e-46bd-4ee7-8cde-b2dc879bb46e)

Devolver por crachá <br>
![image](https://github.com/user-attachments/assets/7a24b471-7c56-4a6d-a936-caad0ba50041)

Criar usuário <br>

![image](https://github.com/user-attachments/assets/cd9082ec-912b-4215-be9c-97c678acb3ae)

<br>

Atualizar usuário <br>

![image](https://github.com/user-attachments/assets/f8d12ec1-f263-42d8-9cfb-5b2a0d94e13f)


<br>

Deletar usuário <br>

![image](https://github.com/user-attachments/assets/9ef50478-095f-4a09-81d6-9c9a5d34e337)

<br>

Criar reserva <br>

![image](https://github.com/user-attachments/assets/b61aa7e1-53e2-422e-9a10-7f8852eefa03)

<br>

Registrar retirada <br>

![image](https://github.com/user-attachments/assets/e8c68b3b-0e44-4d5e-9fb4-2584a4f51cd7)


<br>

Registrar devolução <br>
![image](https://github.com/user-attachments/assets/e75e62a5-4b6d-41f5-b300-2d15823d0f29)
<br>

### Diagrama de Caso de Uso 

![image](https://github.com/user-attachments/assets/eb4994ca-90c3-44ad-85ee-a925755763a7)


### Descritivo de Caso de Uso

> AbrirDashboard <br>

![image](https://github.com/user-attachments/assets/a5235b27-9460-4910-9993-2008027c1dd3)

<br>

> LerCrachá <br>

![image](https://github.com/user-attachments/assets/2935a8f2-f8fc-45d5-a8df-74b4b682f3d7)

<br>

> CadastrarNovoItem <br>

![image](https://github.com/user-attachments/assets/dde694e7-03ef-4a64-a77a-9b80c85866ae)

<br>

> EditarItemExistente <br>

![image](https://github.com/user-attachments/assets/c142621c-1992-4f16-afb4-185c7bca1aba)

<br>

> IndisponibilizarItem <br>

![image](https://github.com/user-attachments/assets/307c3b9d-763d-4574-8b9e-c29b25f908a3)

<br>

> ExcluirItem <br>

![image](https://github.com/user-attachments/assets/92993b53-b08e-4653-b066-3203c662b056)

<br>

> CadastrarNovoUsuário <br>

![image](https://github.com/user-attachments/assets/398dd7c1-3eee-40b5-b544-14cd1572a296)

<br> 

> EditarUsuárioExistente <br>

![image](https://github.com/user-attachments/assets/61d5102b-df3b-44ab-961c-f5433203e13d)

<br> 

> ExcluirUsuário <br>

![image](https://github.com/user-attachments/assets/405fb8f7-bcd3-4dc6-b46d-0804de2d05ac)

<br> 

> GerenciarReservas <br>

![image](https://github.com/user-attachments/assets/e47b0567-f814-47dc-988f-e7fcb6a81706)

<br> 


