    # Null Safety & Types

## Core Concepts

Every type in Kotlin has two variants: nullable (`String?`) and non-nullable (`String`). This is enforced at compile time — the compiler won't let you call methods on a nullable type without handling the null case first. This eliminates `NullPointerException` as a class of runtime bugs.

## Syntax Quick Reference

```kotlin
// Nullable vs non-nullable
val name: String = "Alice"      // guaranteed non-null
val nickname: String? = null    // explicitly nullable

// Safe call operator
nickname?.length                // returns Int? — null if nickname is null

// Safe call chaining (short-circuits on first null)
city?.uppercase()?.take(3)

// Elvis operator — default value when null
val display = name ?: "Anonymous"

// Elvis with return — early exit
val user = getUser() ?: return null

// Elvis with throw
val user = findUser(id) ?: throw UserNotFoundException("id: $id")

// requireNotNull — stdlib alternative to ?: throw
val user = requireNotNull(findUser(id)) { "id: $id" }

// Safe call + let — non-null block
name?.let { println(it.length) }

// return@let — bail out of let block mid-way
val result = nullable?.let { value ->
    val parsed = parse(value) ?: return@let null
    transform(parsed)
} ?: default

// Not-null assertion (avoid in production code)
val len = name!!.length         // NPE if null

// Smart cast — compiler narrows type after null check
if (name != null) {
    name.length                 // no ?. needed, smart cast to String
}

// toIntOrNull — safe parsing
"abc".toIntOrNull()             // null (no exception)
"123".toIntOrNull()             // 123
```

## When to Use What

| Scenario | Tool |
|----------|------|
| Value might be null, need to call a method | `?.` safe call |
| Need a default when null | `?:` Elvis |
| Required value — bail out of function if null | `?: return null` or `?: throw` |
| Nullable class property, need to use safely | `?.let { }` |
| Local `val`, simple null check | `if (x != null)` + smart cast |
| Parsing strings to numbers | `toIntOrNull() ?: default` |

## Common Mistakes

- **`?: null` is a no-op** — `x?.foo ?: null` is identical to `x?.foo`. The `?.` already returns null.
- **`!!` hides bugs** — use `?:`, `?.let`, or `requireNotNull()` instead. `!!` gives a generic NPE with no context.
- **Empty string is not null** — `"" ?: "default"` returns `""`. Use `takeIf { it.isNotEmpty() }` if you need to treat empty as absent.
- **Smart casts don't work on mutable class properties** — the compiler can't guarantee another thread didn't set it to null between the check and usage. Capture in a local `val` first, or use `?.let`.
- **Using `var` + `if/else` instead of `val` + expression** — prefer `val email = x?.let { "($it)" } ?: ""` over a mutable variable with branching assignment.
- **Using `?.` after an early-return null guard** — after `user ?: return null`, the compiler smart-casts `user` to non-null. Use `user.name`, not `user?.name`.

## Kotlin vs Java

| Java | Kotlin |
|------|--------|
| Every reference is implicitly nullable | Nullability is part of the type system |
| `@Nullable`/`@NonNull` annotations (not enforced) | Compiler-enforced `String` vs `String?` |
| `if (x != null) x.getName() else "default"` | `x?.name ?: "default"` |
| `Objects.requireNonNull(x, "msg")` | `requireNotNull(x) { "msg" }` |
| `Optional<T>` wrapper (heap allocation, verbose) | `T?` built into the type system (zero overhead) |
| `(String) x` explicit cast after `instanceof` | Smart cast: `if (x is String) x.length` |
| No equivalent | `?: return` / `?: throw` for early exits |

## Exercises Completed

- **exercise-1-safe-data-extraction.kt** — Build a display string from nested nullable data (`UserProfile?` with nullable `Address`). Key takeaway: `?.let` with `return@let null` for bailing out mid-block; trust smart casts after early `?: return` guards instead of continuing to use `?.`.
- **exercise-2-config-parser.kt** — Build a `DatabaseConfig` from nullable env vars with required/optional fields. Key takeaway: `?: return null` for required values, `?.toIntOrNull() ?: default` for optional numeric parsing — handles both "missing" and "invalid" in one expression.

## Project Summary

Not started yet.

## Personal Notes

- After `user ?: return "No user"`, the compiler smart-casts `user` to non-null — no need for `?.` on subsequent calls. This was a key correction from exercise 1.
- `return@let null` is a labeled return from a `let` lambda — useful for bailing out partway through when a nested value is null, letting the outer `?: ""` provide the fallback.
- Smart casts work on local `var`s (compiler can prove no other thread has access) but NOT on mutable class properties. This is a real concern in backend services with shared state.
- No `new` keyword in Kotlin — just call the constructor directly: `DatabaseConfig("localhost", 5432, "myapp", 10)`.
