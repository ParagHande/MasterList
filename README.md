<h2>Project Overview</h2><br>
-Developed a Spring Boot application with Spring MVC. <br>
-Implemented REST API for handling POST /v2/master_list and GET /v2/master_list requests. <br>
-Stored API response data in PostgreSQL using Spring Data JPA. <br>
-Followed a proper controller-service-repository structure for better code organization. <br>
-Ensured data persistence with an entity model (MasterList.java). <br> <be>
 
<h2>API Endpoints </h2><br>
POST: Accepts JSON input and stores data in PostgreSQL. <br>
GET: Retrieves all stored records. <br> <be>

<h2>Database Integration</h2> <br>
-Configured PostgreSQL database connection (application.properties). <br>
-Used Spring JPA Repository for CRUD operations. <br> <be>

<h2>Code Structure</h2> <br>
-Controller: MasterListController.java <br>
-Service Layer: MasterListService.java <br>
-Repository Layer: MasterListRepository.java <br>
-Entity Class: MasterList.java <br> <be>

<h2>How to Run the Project</h2><br>
-Setup PostgreSQL and create a database masterlistdb. <br>
-Configure application.properties with correct database credentials. <br>
-Run the application using mvn spring-boot: run or from an IDE. <br>
-Test API via Postman using provided endpoints. <br>


