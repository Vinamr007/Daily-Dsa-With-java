Lesson 3 — Component Scanning & Stereotypes
21. What is Component Scanning?

Component scanning is the process by which Spring searches specified packages for classes marked with component annotations and registers them as Spring Beans.

22. What is @Component?

@Component tells Spring to detect the class during component scanning and create and manage its object as a Spring Bean.

@Component
public class Car {
}
23. What is @Service?

@Service is a stereotype annotation used to indicate a class that contains business logic.

@Service
public class PaymentService {
}
24. What is @Repository?

@Repository is a stereotype annotation used to indicate a class responsible for data-access or database operations.

@Repository
public class StudentRepository {
}
25. Difference between @Component, @Service, and @Repository?

All three are Spring stereotype annotations used to register classes as Spring Beans. @Component is general-purpose, @Service is used for business logic, and @Repository is used for data-access logic.

Remember:

@Component  → General
@Service    → Business Logic
@Repository → Database/Data Access
26. What is @ComponentScan?

@ComponentScan tells Spring which packages it should scan to find component classes such as @Component, @Service, and @Repository.

In Spring Boot, component scanning is normally enabled through @SpringBootApplication.