# CS 320: Software Test Automation and QA Portfolio

This repository showcases my work in software testing, automation, and quality assurance, featuring unit testing suites developed using JUnit 5. The included artifacts demonstrate a commitment to delivering functional, robust, and secure software by verifying core business logic against strict requirements.

## Reflections on Software Engineering & Quality Assurance

### 1. Ensuring Functionality and Security
To guarantee that software is both functional and secure, testing must be treated as a continuous, foundational process rather than an afterthought. 

* **Defensive Coding & Validation:** Functionality begins at the class level by implementing strict input validation within constructors and mutator methods. Ensuring that fields cannot be null, exceed length constraints, or accept invalid data formats prevents the application from entering unstable states.
* **Automated Unit Testing:** Utilizing frameworks like JUnit allows for rapid, repeatable verification of business logic. A robust test suite should aim for high code coverage, specifically targeting:
  * **Success Paths:** Verifying that valid data is processed correctly.
  * **Boundary Conditions:** Testing the absolute limits of allowed data inputs.
  * **Negative/Exception Paths:** Ensuring the system gracefully handles invalid input and throws the expected exceptions without crashing.
* **Security Practices:** Beyond input sanitization, security is maintained by minimizing attack surfaces (e.g., keeping fields private, preventing unauthorized state modification) and ensuring data integrity through secure communication protocols and checksum verifications during deployment.

### 2. Interpreting and Incorporating User Needs
Translating user requirements into functional software requires breaking down high-level business logic into precise, unambiguous constraints.

* **Requirements Analysis:** User stories and requirements documentation dictate the boundaries of the application (e.g., specific character limits, unique identifier constraints, and mandatory fields).
* **Test-Driven Mentality:** By analyzing these constraints *before* or alongside development, you can structure unit tests to act as the ultimate source of truth. If a requirement states that a Contact ID must be unique and fewer than 10 characters, the test suite explicitly enforces that rule. 
* **User-Centric Architecture:** Incorporating user needs means ensuring the software is reliable and predictable for the end user, preventing unexpected failures through rigorous validation at the boundary layers of the application.

### 3. Software Design Approaches
My approach to designing software centers on modularity, clear separation of concerns, and maintainability.

* **Separation of Concerns:** Software should be split into distinct, manageable components. For instance, separating the core data model (e.g., `Contact`) from the business logic layer (e.g., `ContactService`) ensures that data structure changes do not break core application features.
* **Clean & Scalable Architecture:** Designing with state management, modular services, and dependency injection in mind makes applications highly adaptable. This structure allows new features, APIs, or database integrations to be introduced with minimal friction.
* **Design for Testability:** Good software design inherently simplifies testing. Writing decoupled, cohesive classes means individual components can be isolated and thoroughly tested without relying on complex, monolithic dependencies. This ensures that as the codebase grows, it remains stable, maintainable, and agile.
