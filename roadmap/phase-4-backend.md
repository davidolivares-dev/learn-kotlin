# Phase 4: Backend

Apply everything to real-world backend development. This is where the language skills become professional skills.

**Estimated time:** 4-5 sessions (2-3 hours each)

**Prerequisites:** Phase 3 complete

---

## Module 12: HTTP & Serialization

**Directory:** `modules/http-and-serialization/`

### Key Topics
- kotlinx.serialization — `@Serializable`, `Json`, custom serializers
- JSON encoding/decoding with type safety
- HTTP clients: Ktor client or OkHttp
- Making GET/POST requests with proper error handling
- Deserializing responses into data classes
- Configuring serialization (naming strategies, ignoring unknowns)
- Handling API errors and timeouts

### Mini-Project
API client that fetches and deserializes data from a public API (e.g., GitHub, weather, or similar). Handles errors, retries, and types the responses properly.

### Mastery Signals
- [ ] Can serialize/deserialize Kotlin data classes to/from JSON
- [ ] Comfortable making HTTP requests with proper error handling
- [ ] Know how to configure serialization for real-world APIs
- [ ] Can handle API errors gracefully (not just happy path)
- [ ] Mini-project complete and reviewed

---

## Module 13: REST API Design

**Directory:** `modules/rest-api-design/`

### Key Topics
- Ktor server setup (or Spring Boot — your choice)
- Routing and path parameters
- Request/response handling with serialization
- Middleware: logging, authentication, error handling
- CRUD operations with proper HTTP methods/status codes
- Input validation
- Dependency injection basics

### Mini-Project
Build a CRUD REST API for a resource (e.g., bookmarks, notes, or tasks). Includes proper routing, validation, error responses, and middleware.

### Mastery Signals
- [ ] Can set up a Kotlin REST API from scratch
- [ ] Proper HTTP method and status code usage
- [ ] Input validation with meaningful error responses
- [ ] Clean separation of concerns (routing, logic, data)
- [ ] Mini-project complete and reviewed

---

## Module 14: Testing

**Directory:** `modules/testing/`

### Key Topics
- JUnit 5 with Kotlin — test syntax, assertions
- MockK — Kotlin-native mocking
- Kotest matchers — expressive assertions
- Testing coroutines: `runTest`, `TestDispatcher`
- Test fixtures and setup/teardown
- Testing REST APIs (integration tests)
- Test organization and naming conventions

### Mini-Project
Full test suite for the REST API from Module 13. Unit tests for business logic, integration tests for endpoints, mocked dependencies where appropriate.

### Mastery Signals
- [ ] Can write clean, readable tests in Kotlin
- [ ] Comfortable with MockK for mocking
- [ ] Can test coroutine-based code properly
- [ ] Can write integration tests for REST endpoints
- [ ] Mini-project complete and reviewed
