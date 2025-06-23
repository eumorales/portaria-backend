# 🛡️ Portaria UFN

Este sistema permite a **gestão de usuários, itens e reservas** em ambientes controlados, como instituições de ensino. Com ele, porteiros podem controlar a retirada e devolução de **chaves**, **controles** e outros itens.

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

![Diagrama de Domínio](https://github.com/user-attachments/assets/3e813b2f-dc2c-47a1-b1a8-1ec26f25bde9)

### Diagrama de Caso de Uso 

### Descritivo de Caso de Uso
