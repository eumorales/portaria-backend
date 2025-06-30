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

![Diagrama de Classe](https://github.com/user-attachments/assets/7952bb3c-1b3a-40f0-b168-6153f12539cc)

### Diagrama de Domínio 

![image](https://github.com/user-attachments/assets/efc0a6e2-9382-45e5-8430-cda694f6de2d)

### Diagrama de Sequência

> Usuario = Porteiro/Adm

Reservar Item <br>
![CriacaoReservaViaCrachaDiagramaSequencia](https://github.com/user-attachments/assets/3f491cb7-2265-4857-ab09-6268ca4e747d)

<br>

Retirar Item <br>
![RetiradaItemViaCrachaDiagramaSequencia](https://github.com/user-attachments/assets/59fb65ce-1a5a-4124-bdb3-1a5cbc99863f)

<br>

Devolver Item <br>
![DevolucaoDeItemViaCrachaDiagramaSequencia](https://github.com/user-attachments/assets/29558563-a28b-4cf0-ada3-c5351e8d782f)

<br>


### Diagrama de Caso de Uso 

![DiagramaCasoDeUsoSistemaPortariaImagemJPG](https://github.com/user-attachments/assets/f364f72b-ec65-4e62-afc2-d28708fea00f)

### Descritivo de Caso de Uso

> AbrirDashboard <br>

![image](https://github.com/user-attachments/assets/a5235b27-9460-4910-9993-2008027c1dd3)


<br>

> LerCrachá <br>

![image](https://github.com/user-attachments/assets/0786b68f-599b-4923-8b76-5e95b72482ba)


<br>


> GerenciarReservasUsuário <br>

![image](https://github.com/user-attachments/assets/cb33ff77-bbbb-42a4-8e78-15ca1fb72e78)


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

> GerenciarUsuário <br>

![image](https://github.com/user-attachments/assets/4d0146aa-c449-4fdf-83f2-d9a6772c6e68)

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


