# Help Desk for Ticket Generation

## 1. Project Overview

The **Help Desk for Ticket Generation** is a full-stack web application designed to manage support requests efficiently.
Users can create tickets, track their status, and communicate issues, while administrators can manage and resolve them.

This system is useful for:

* IT support teams
* Customer service departments
* Internal organization help desks
* Academic or hackathon demonstrations

---

## 2. Key Features

* Ticket creation and management
* Status tracking (Open, In Progress, Resolved, Closed)
* RESTful backend APIs
* Modern frontend interface
* Full-stack architecture (Frontend + Backend)

---

## 3. Tech Stack

### 3.1 Backend

* Java
* Spring Boot
* REST APIs
* Maven

### 3.2 Frontend

* React (Vite)
* JavaScript
* CSS

### 3.3 Tools

* IntelliJ IDEA (Backend development)
* VS Code (Frontend development)
* Git & GitHub (Version control)

---

## 4. Project Structure

```
Help-Desk-For-TicketGeneration
│
├── help-desk-backend
│   ├── src
│   ├── pom.xml
│   └── ...
│
├── help-desk-frontend
│   ├── src
│   ├── package.json
│   └── ...
│
└── README.md
```

---

## 5. Installation and Setup

### 5.1 Clone the Repository

```bash
git clone https://github.com/Kishan22298/Help-Desk-For-TicketGeneration-.git
cd Help-Desk-For-TicketGeneration-
```

---

### 5.2 Backend Setup

1. Open the `help-desk-backend` folder in **IntelliJ**.
2. Ensure Java and Maven are installed.
3. Run the Spring Boot application.

Or using terminal:

```bash
cd help-desk-backend
mvn spring-boot:run
```

Backend will run on:

```
http://localhost:8080
```

---

### 5.3 Frontend Setup

1. Open `help-desk-frontend` in **VS Code**.
2. Install dependencies:

```bash
npm install
```

3. Start the frontend:

```bash
npm run dev
```

Frontend will run on:

```
http://localhost:5173
```

---

## 6. API Endpoints (Example)

| Method | Endpoint      | Description       |
| ------ | ------------- | ----------------- |
| GET    | /tickets      | Get all tickets   |
| POST   | /tickets      | Create new ticket |
| PUT    | /tickets/{id} | Update ticket     |
| DELETE | /tickets/{id} | Delete ticket     |

---

## 7. Future Enhancements

* User authentication (JWT)
* Role-based access (Admin/User)
* Email notifications
* Ticket priority system
* Dashboard analytics

---

## 8. Author

**Kishan Kumar**
GitHub: https://github.com/Kishan22298

---

## 9. License

This project is for educational and demonstration purposes.
