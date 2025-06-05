# Department & Employee Management API

This is a Spring Boot RESTful API for managing **departments** and **employees**, created as part of an academic or enterprise application. It includes endpoints for managing departments, viewing department employee counts, and searching employees by salary.


## Features

### Department Endpoints (`/dept`)

 #### 📦 `GET /dept`  
  Get all departments.

  <img width="662" alt="image" src="https://github.com/user-attachments/assets/9e6ec8a8-4d0c-43f9-b7bc-7a137cd25baf" />

<br/>
<br/>

  #### 📦 `GET /dept/{id}` 
  
 Get a department by its ID.

 <img width="646" alt="image" src="https://github.com/user-attachments/assets/dbf27fcc-9bc0-4a9c-9969-7d7716cd602e" />

<br/>
<br/>

  #### 📦 `POST /dept` 
 Add a new department.  

 <img width="635" alt="image" src="https://github.com/user-attachments/assets/ee18b5cb-fbd4-4482-819e-37c9224cd64b" />

<br/>
<br/>

  #### 📦 `GET /dept/names` 
 Get a list of department names.

<img width="650" alt="image" src="https://github.com/user-attachments/assets/a59c30d8-2cc8-45fa-8dbb-a224f98d9d42" />

<br/>
<br/>

  #### 📦 `GET /dept/search/{name}` 
 Search departments by name.

<img width="638" alt="image" src="https://github.com/user-attachments/assets/b84e57ca-9dfc-4823-a03d-25df3618c370" />

<br/>
<br/>

  #### 📦 `GET /dept/empcount/{id}` 
 Get the number of employees in a department by department ID.

 <img width="638" alt="image" src="https://github.com/user-attachments/assets/24ea9b78-f399-4b4d-8314-509a56e851bf" />

 
<br/>
<br/>

  #### 📦 `GET /dept/vempcount/{id}` 
 Get a department view with employee count (using ViewDepartment).

 
<img width="641" alt="image" src="https://github.com/user-attachments/assets/9e7e2e17-2dba-4ada-9e66-256767e44f69" />

<hr/>

### Employee Endpoints (/emp)

#### 📦 `GET /emp/salary/{a}/{b}` 
 Search employees whose salary is between a and b.

 <img width="650" alt="image" src="https://github.com/user-attachments/assets/e0e225c7-f221-4b40-a244-958318040a4b" />

 

