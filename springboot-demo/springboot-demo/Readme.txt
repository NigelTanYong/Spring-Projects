Configurations:
1. Generate a project with configuration through https://start.spring.io/
  -project: Maven
  -language: Java
  -spring boot: 3.3.5 (this vesrsion was used at time of upload)
  -packaging: Jar
  -dependencies: Spring Web, Spring Data JPA, H2 Database
2. Configure the port, h2 database in the application.properties file to your liking

To see how project works:
  View Salary table on H2 Console: http://localhost:9999/h2-console
  Endpoints to use in browser:
  - View entire lists of employees details in JSON: http://localhost:9999/api/employees
  - View specific employee details: http://localhost:9999/api/employees/{your_id}
  - View entire employee's salary with the id in JSON: http://localhost:9999/api/employees/salary/{your_id}
  
  Endpoints to POST in Postman:
  Add new Employee: http://localhost:9999/api/employees
  Add Salary to Employee with the id: http://localhost:9999/api/employees/{your_id}/savesalary
