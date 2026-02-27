# Phase 1: Foundations

Core Kotlin for someone who already codes. Move quickly through basics, focus on what's different from Java/Xtend.

**Estimated time:** 4-6 sessions (2-3 hours each)

---

## Module 1: Null Safety & Types

**Directory:** `modules/null-safety-and-types/`

### Key Topics
- `val` vs `var` — immutability by default
- Type inference — when to annotate, when not to
- Nullable types (`String?` vs `String`)
- Safe call operator (`?.`)
- Elvis operator (`?:`)
- Not-null assertion (`!!`) — and why to avoid it
- Smart casts (`is` checks)
- `let` with safe calls (`?.let { }`)

### Mini-Project
CLI tool that parses user input with robust null handling. Accepts various formats, handles missing/malformed data gracefully without `!!`.

### Mastery Signals
- [ ] Can explain nullable vs non-nullable types to a teammate
- [ ] Never reach for `!!` as a first instinct
- [ ] Can chain `?.`, `?:`, and `let` fluently
- [ ] Understand smart casts and when they apply
- [ ] Mini-project complete and reviewed

---

## Module 2: Functions & Lambdas

**Directory:** `modules/functions-and-lambdas/`

### Key Topics
- Function syntax (single-expression functions, named/default parameters)
- Extension functions — adding methods to existing types
- Higher-order functions — functions as parameters and return values
- Lambda syntax — `{ }`, `it`, destructuring
- Function types (`(String) -> Int`)
- Inline functions and `crossinline`/`noinline`
- Function references (`::functionName`)

### Mini-Project
Text processing pipeline using function composition. Chain transformations (trim, lowercase, filter, transform) as composable functions.

### Mastery Signals
- [ ] Can write extension functions naturally
- [ ] Comfortable with lambda syntax and `it`
- [ ] Can design APIs using higher-order functions
- [ ] Understand function types and references
- [ ] Mini-project complete and reviewed

---

## Module 3: Collections

**Directory:** `modules/collections/`

### Key Topics
- Immutable vs mutable collections (`List` vs `MutableList`)
- Transformations: `map`, `filter`, `flatMap`
- Aggregation: `fold`, `reduce`, `sumOf`, `count`
- Grouping: `groupBy`, `associateBy`, `partition`
- Sequences — lazy evaluation for large collections
- Collection builders (`buildList`, `buildMap`)
- Destructuring in lambdas

### Mini-Project
Data analyzer that reads CSV-like input and computes statistics (averages, groupings, top-N). Uses collection operations — no manual loops.

### Mastery Signals
- [ ] Default to functional collection operations over loops
- [ ] Know when to use sequences vs eager collections
- [ ] Can chain operations fluently without intermediate variables
- [ ] Comfortable with `groupBy`, `associateBy`, `fold`
- [ ] Mini-project complete and reviewed

---

## Module 4: Classes & Objects

**Directory:** `modules/classes-and-objects/`

### Key Topics
- Data classes — `equals`, `hashCode`, `copy`, destructuring
- Sealed classes and sealed interfaces — exhaustive `when`
- Enums with properties and methods
- `object` declarations — singletons
- Companion objects — static-like members
- Interfaces with default implementations
- Delegation (`by` keyword)
- Visibility modifiers (`internal`, etc.)

### Mini-Project
Model a domain (e.g., task tracker) with sealed class state machine. Tasks have states (Todo, InProgress, Done, Cancelled) with valid transitions enforced by types.

### Mastery Signals
- [ ] Use data classes for value objects by default
- [ ] Reach for sealed classes when modeling fixed variants
- [ ] Understand delegation and when it beats inheritance
- [ ] Can design a type-safe state machine
- [ ] Mini-project complete and reviewed
