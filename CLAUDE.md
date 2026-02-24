# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Repairtrack is a Spring Boot 4.0.3 REST API backend for monitoring car repairs, using Java 25 and Maven.

## Common Commands

```bash
# Run the application
./mvnw spring-boot:run

# Run all tests
./mvnw test

# Run a specific test class
./mvnw test -Dtest=RepairtrackApplicationTests

# Build executable JAR
./mvnw clean package

# Clean build
./mvnw clean install
```

## Architecture

The project uses a **package-by-module** structure under `com.mod.Repairtrack.modules`, with four domain modules planned:

- `owner` — vehicle owners
- `vehicle` — vehicle records
- `mechanic` — mechanic profiles
- `repair` — repair records

Each module should follow a layered pattern: `Controller → Service → Repository → Entity`.

### Key Technologies

| Layer | Technology |
|---|---|
| Web | Spring Web MVC |
| Persistence | Spring Data JPA + Hibernate |
| DB Migrations | Flyway (migrations in `src/main/resources/db/migration/`) |
| Code gen | Lombok |
| Test DB | H2 in-memory |

### Configuration

- `src/main/resources/application.yaml` — main app config (currently minimal)
- `src/test/resources/application-test.yaml` — test profile: H2 in-memory DB with `ddl-auto: create-drop`

The test profile uses H2 dialect; production DB is not yet configured in `application.yaml`.

### Database Migrations

Add Flyway SQL migration files to `src/main/resources/db/migration/` using the naming convention `V{version}__{description}.sql` (e.g., `V1__create_owner_table.sql`).
