# Phase 2: Idiomatic Kotlin

What separates "Kotlin that works" from "Kotlin that's clean and natural." These modules teach you to think in Kotlin, not translate from Java.

**Estimated time:** 4-6 sessions (2-3 hours each)

**Prerequisites:** Phase 1 complete

---

## Module 5: Scope Functions

**Directory:** `modules/scope-functions/`

### Key Topics
- `let` — transform and null-safe operations
- `run` — compute a result in a scope
- `with` — operate on an object without `it`/`this` ambiguity
- `apply` — configure an object and return it
- `also` — side effects (logging, validation)
- Decision framework: which scope function for which situation
- Chaining scope functions (and when not to)

### Mini-Project
Refactor Phase 1 projects to use scope functions idiomatically. Before/after comparison showing cleaner code.

### Mastery Signals
- [ ] Can choose the right scope function without a cheat sheet
- [ ] Know the difference between `this` vs `it` receivers
- [ ] Don't overuse scope functions — know when plain code is clearer
- [ ] Can explain why you chose one over another
- [ ] Mini-project complete and reviewed

---

## Module 6: Generics & Type System

**Directory:** `modules/generics-and-type-system/`

### Key Topics
- Generic classes and functions
- Variance: `in` (contravariance) and `out` (covariance)
- Star projection (`*`)
- Reified type parameters (with `inline`)
- Type erasure and its implications
- Upper bounds (`T : Comparable<T>`)
- Generic constraints (`where`)

### Mini-Project
Build a type-safe `Result<T, E>` wrapper and a generic repository interface with type-safe CRUD operations.

### Mastery Signals
- [ ] Can write generic functions and classes
- [ ] Understand `in`/`out` variance intuitively
- [ ] Know when to use reified types
- [ ] Can design type-safe APIs with generics
- [ ] Mini-project complete and reviewed

---

## Module 7: Error Handling

**Directory:** `modules/error-handling/`

### Key Topics
- `Result<T>` — wrapping success/failure
- `runCatching` — try-catch as an expression
- `fold`, `getOrElse`, `getOrDefault` on Result
- Sealed class error hierarchies — typed errors
- Exceptions vs return types — when to use which
- `require`, `check`, `error` — precondition functions
- Designing error-resilient APIs

### Mini-Project
Error-resilient file processor that reads, validates, and transforms data with structured error reporting. Errors are collected and reported, not thrown.

### Mastery Signals
- [ ] Default to `Result` or sealed classes over try-catch
- [ ] Can design error hierarchies with sealed classes
- [ ] Know when exceptions are appropriate (truly exceptional cases)
- [ ] Use `require`/`check` for preconditions
- [ ] Mini-project complete and reviewed

---

## Module 8: DSLs & Operators

**Directory:** `modules/dsl-and-operators/`

### Key Topics
- Operator overloading (`plus`, `get`, `invoke`, `compareTo`)
- Infix functions
- Builder pattern with lambdas with receivers
- Type-safe DSL design
- `@DslMarker` — scope control
- Practical DSL examples (HTML builder, config, test assertions)

### Mini-Project
Build a small DSL — either an HTML builder, a configuration DSL, or a test assertion DSL. Must use lambdas with receivers and `@DslMarker`.

### Mastery Signals
- [ ] Can overload operators appropriately (not abusively)
- [ ] Understand lambdas with receivers
- [ ] Can build a type-safe DSL from scratch
- [ ] Know when a DSL improves readability vs overcomplicates
- [ ] Mini-project complete and reviewed
