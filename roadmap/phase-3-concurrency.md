# Phase 3: Concurrency

Essential for backend work. Kotlin's coroutines are a major advantage over Java — learn them deeply.

**Estimated time:** 4-5 sessions (2-3 hours each)

**Prerequisites:** Phase 2 complete

---

## Module 9: Coroutines Basics

**Directory:** `modules/coroutines-basics/`

### Key Topics
- `suspend` functions — what suspension means
- `launch` — fire-and-forget coroutines
- `async`/`await` — concurrent computation with results
- Dispatchers: `Default`, `IO`, `Main`, `Unconfined`
- `delay` vs `Thread.sleep` — non-blocking vs blocking
- `runBlocking` — bridging blocking and suspending worlds
- `withContext` — switching dispatchers
- Coroutine context and `Job`

### Mini-Project
Concurrent data fetcher that retrieves data from multiple sources in parallel using `async`/`await`, with proper dispatcher usage.

### Mastery Signals
- [ ] Can explain what "suspension" means without hand-waving
- [ ] Know which dispatcher to use for which task
- [ ] Comfortable with `launch` vs `async` and when to use each
- [ ] Never block a coroutine with `Thread.sleep`
- [ ] Mini-project complete and reviewed

---

## Module 10: Flows & Channels

**Directory:** `modules/flows-and-channels/`

### Key Topics
- Cold flows: `flow { }`, `emit`, `collect`
- Flow operators: `map`, `filter`, `transform`, `take`
- Terminal operators: `collect`, `toList`, `first`, `reduce`
- `StateFlow` — observable state holder
- `SharedFlow` — event broadcast
- Channels — communication between coroutines
- Backpressure and buffering strategies
- `flowOn` — changing flow context

### Mini-Project
Real-time data pipeline (e.g., log processor) that reads a stream, transforms entries, and outputs results with backpressure handling.

### Mastery Signals
- [ ] Understand cold flows vs hot flows (StateFlow/SharedFlow)
- [ ] Can build a data pipeline with flow operators
- [ ] Know when to use flows vs channels
- [ ] Understand backpressure and buffering
- [ ] Mini-project complete and reviewed

---

## Module 11: Structured Concurrency

**Directory:** `modules/structured-concurrency/`

### Key Topics
- Coroutine scopes: `coroutineScope`, `supervisorScope`
- Cancellation — cooperative cancellation, `isActive`, `ensureActive`
- Exception handling in coroutines
- `CoroutineExceptionHandler`
- Parent-child relationships
- `SupervisorJob` — independent child failure
- Timeouts: `withTimeout`, `withTimeoutOrNull`

### Mini-Project
Resilient job scheduler that runs multiple tasks concurrently with proper cancellation, timeout handling, and error isolation using `supervisorScope`.

### Mastery Signals
- [ ] Can explain structured concurrency and why it matters
- [ ] Handle cancellation cooperatively (check `isActive`, use `ensureActive`)
- [ ] Know when to use `supervisorScope` vs `coroutineScope`
- [ ] Can design coroutine hierarchies with proper error handling
- [ ] Mini-project complete and reviewed
