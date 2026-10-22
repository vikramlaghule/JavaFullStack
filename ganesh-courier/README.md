# Ganesh Courier (Spring Boot)
Requirements: Java 17+, Maven.
Run:  mvn spring-boot:run   then open http://localhost:8080
Demo logins: ramesh / ramesh123   and   sunita / sunita123

## Add an employee (no registration page)
Open http://localhost:8080/h2-console (log in to the app first), JDBC URL `jdbc:h2:file:./data/courier`, user `sa`, empty password, then run:
  INSERT INTO employee(username,password,name,mobile) VALUES ('vijay','{noop}vijay123','Vijay Kale','9890000000');
The name and mobile appear in that employee's Profile and in the Welcome message.
For real use store passwords as {bcrypt}... hashes instead of {noop}.
