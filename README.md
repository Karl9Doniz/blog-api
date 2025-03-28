# blog-api

This is a Blog platform API project, built using Java and Spring framework.

It is built upon Spring Boot (Web, Jpa), Hibernate, Spring Security, PostgreSQL and other dependencies.

Project was compiled using Java 21, so this and later versions are recommended.

### Prerequisites

Java 21 or later

Docker

### Build and run

Since the project uses docker for database initialization, be cure to run:

```bash
  docker compose run
```

Open separate terminal, clean and install:

```bash
    ./mvnw clean install
```

Then run:

```bash
    ./mvnw spring-boot:run
```

Or use your IDE tools to build the project.

From here, you may use Postman or other instrument to work with the api.

### Project description

Baseline backend project that provides API for creating blog posts, tags and categories for the posts.
