Session 7 — Interview Questions & Answers
1. What is REST API?
   Answer:
   REST API is an API that follows REST principles and allows different applications to communicate over HTTP.
   It uses HTTP methods such as:
   GET     → Read
   POST    → Create
   PUT     → Update
   DELETE  → Delete

2. What is a Controller?
   Answer:
   A Controller is a Spring component that handles HTTP requests from the client and sends a response.
   Example:
   @RestController
   public class StudentController {

   @GetMapping("/student")
   public String getStudent() {
   return "Vinamr";
   }
   }

3. What is @Controller?
   Answer:
   @Controller is used to mark a class as a Spring MVC controller that handles web requests.
   It is commonly used when returning views/pages.
4. What is @RestController?
   Answer:
   @RestController is used to create REST APIs. It automatically converts the returned data into the HTTP response body.
   It is equivalent to:
   @Controller
+
@ResponseBody

5. Difference between @Controller and @RestController?
   Answer:
   @Controller	@RestController
   Mainly used for MVC/web pages	Mainly used for REST APIs
   Usually returns a view	Usually returns data
   @ResponseBody may be needed	@ResponseBody is included automatically


Interview line:
@Controller is generally used for returning views, whereas @RestController is used for creating REST APIs and returning data directly in the response body.

6. What is @RequestMapping?
   Answer:
   @RequestMapping is used to map HTTP requests to a controller or method.
   Example:
   @RequestMapping("/students")
   public class StudentController {
   }

Then:
@GetMapping("/all")

results in:
GET /students/all

7. What is @GetMapping?
   Answer:
   @GetMapping maps an HTTP GET request to a controller method. It is generally used to retrieve data.
   @GetMapping("/students")
   public String getStudents() {
   return "All Students";
   }

8. What is @PostMapping?
   Answer:
   @PostMapping maps an HTTP POST request to a controller method. It is generally used to create new data.
   @PostMapping("/student")
   public String addStudent() {
   return "Student Added";
   }

9. What is @PutMapping?
   Answer:
   @PutMapping maps an HTTP PUT request and is generally used to update existing data.
   @PutMapping("/student")
   public String updateStudent() {
   return "Student Updated";
   }

10. What is @DeleteMapping?
    Answer:
    @DeleteMapping maps an HTTP DELETE request and is generally used to delete data.
    @DeleteMapping("/student")
    public String deleteStudent() {
    return "Student Deleted";
    }

11. What are CRUD operations?
    Answer:
    CRUD stands for:
    C → Create
    R → Read
    U → Update
    D → Delete

In REST APIs:
POST    → Create
GET     → Read
PUT     → Update
DELETE  → Delete

12. Difference between GET and POST?
    Answer:
    GET	POST
    Used to retrieve data	Used to create/send data
    Data is generally sent through URL parameters	Data is generally sent in request body
    Should not modify server data	Can modify server data
    Can be cached	Generally not cached like GET


13. Difference between POST and PUT?
    Answer:
    POST is generally used to create a new resource, while PUT is generally used to update or completely replace an existing resource.

Example:
POST /students
→ Create student

PUT /students/10
→ Update student with ID 10

14. How do you create a REST API in Spring Boot?
    Answer:
    We create a class using @RestController and map methods using HTTP mapping annotations.
    Example:
    @RestController
    @RequestMapping("/students")
    public class StudentController {

    @GetMapping
    public String getStudents() {
    return "All Students";
    }

    @PostMapping
    public String addStudent() {
    return "Student Added";
    }
    }