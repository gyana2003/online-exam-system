# 🧠 Online Exam System

A full-stack web application built using **Spring Boot + Oracle Database + HTML + CSS + JavaScript**.  
This project allows students to take exams online with a timer, auto-submit answers, and view results on a leaderboard. Admins can add questions from a web panel.

---

## 🚀 Features

- 🔐 Student Login & Register
- 🧑‍💼 Admin Panel to Add Questions
- 📝 Online Exam with Countdown Timer
- ⏱️ Auto Submit When Time Ends
- 📊 Score Calculation
- 🏆 Leaderboard Ranking
- 🎯 Difficulty Levels (Easy / Medium / Hard)

---

## 🏗️ Tech Stack

- Java 21  
- Spring Boot  
- Oracle Database (21c XE)  
- Hibernate / JPA  
- Maven  
- HTML / CSS / JavaScript  

---

## 📂 Project Structure

onlineexam/  
├── src/main/java/com/exam/onlineexam/  
│   ├── controller/  
│   ├── model/  
│   ├── repository/  
│   └── OnlineexamApplication.java  
│  
├── src/main/resources/  
│   ├── application.properties  
│   └── static/frontend/  
│       ├── login.html  
│       ├── register.html  
│       ├── exam.html  
│       ├── leaderboard.html  
│       ├── admin.html  
│       └── style.css  
│  
├── pom.xml  
└── README.md  

---

## ▶️ How to Run the Project

### 1️⃣ Clone Repository
git clone https://github.com/gyana2003/online-exam-system.git  
cd online-exam-system  

### 2️⃣ Configure Database  
Edit file:  
src/main/resources/application.properties  

Example configuration:

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE  
spring.datasource.username=system  
spring.datasource.password=System  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
server.port=8085  

### 3️⃣ Run Application
.\mvnw.cmd spring-boot:run  

### 4️⃣ Open in Browser

Login Page:  
http://localhost:8085/frontend/login.html  

Admin Panel:  
http://localhost:8085/frontend/admin.html  

Exam Page:  
http://localhost:8085/frontend/exam.html  

Leaderboard:  
http://localhost:8085/frontend/leaderboard.html  

---

## 🧪 Modules

### 👨‍🎓 Student
- Register/Login  
- Attend Exam  
- View Score  
- See Leaderboard  

### 🧑‍💼 Admin
- Add Questions  
- Set Options & Answers  
- Choose Difficulty  

### ⚙️ System
- Timer Countdown  
- Auto Submit  
- Result Storage (Oracle DB)  

---

## 📊 APIs Used

GET /api/questions  
POST /api/addQuestion  
POST /api/saveResult  
GET /api/leaderboard  

---

## 🎓 Learning Outcomes

This project demonstrates:

- Spring Boot REST API development  
- Oracle DB integration  
- Full-stack development  
- Git & GitHub workflow  
- MVC architecture  
- Real-time exam logic  

---

## 👨‍💻 Author

Gyana Ranjan Jena  

GitHub: https://github.com/gyana2003  
Email: gyanaranjanjena452@gmail.com  

---

## 📌 Status

🚧 Currently under development  
New features are being added regularly.

---

## ⭐ Future Enhancements

- Difficulty-based exam selection  
- Result history per student  
- Certificate PDF generation  
- Dark mode UI  
- Admin analytics dashboard  
