# Learn Kotlin

A structured, hands-on Kotlin learning path powered by Claude Code. Built for experienced programmers who learn by doing, not watching tutorials.

## Quick Start

1. Open this repo in your terminal with Claude Code
2. Run `/plan-roadmap` to see where you are
3. Start with `/learn null-safety-and-types`
4. Follow the workflow below for each module

## How It Works

**14 modules** across **4 phases**, each with:
- An interactive lesson (taught by Claude Code)
- Focused coding exercises
- A mini-project to cement understanding
- A mastery assessment before moving on

## Workflow Per Module

```
/learn <module>          → Interactive lesson (~30-45 min)
  ↓
Complete exercises       → 2-3 focused tasks (~30 min)
  ↓
/build <module>          → Guided mini-project (~45-60 min)
  ↓
/review <file>           → Code review for idiomatic Kotlin
  ↓
/assess <module>         → Pass before moving on
```

## Example Workflow

Here's what a real session looks like for the **Null Safety & Types** module:

**Session 1 (~1 hour): Learn & Practice**
```
> /learn null-safety-and-types

Claude teaches you about val/var, nullable types, safe calls (?.), the
elvis operator (?:), and smart casts — with inline examples where you
predict the output before seeing the answer.

> /exercise null-safety

Claude gives you a focused exercise: "Rewrite this Java-style null-checking
function using Kotlin's null safety features." You write the code, Claude
reviews it and suggests more idiomatic alternatives.
```

**Session 2 (~1 hour): Build & Review**
```
> /build null-safety-and-types

Claude guides you through building a CLI tool that parses user input with
robust null handling. It gives you requirements and hints, but doesn't
hand you the code — you write it yourself.

> /review modules/null-safety-and-types/project/Main.kt

Claude reviews your project code: "Line 12 — you're using `!!` here, but
you could use `?.let { ... } ?: defaultValue` instead. Here's why..."
```

**Before Moving On:**
```
> /assess null-safety-and-types

Claude asks 5 questions to check your understanding:
  1. What's the difference between `?.` and `!!`?
  2. When would you use `?:` vs a full `if` check?
  3. [predict output of a code snippet]
  ...

Result: 5/5 — Ready to move on to Functions & Lambdas!
```

## Phases

| Phase | Focus | Modules |
|-------|-------|---------|
| 1. Foundations | Core Kotlin for Java/Xtend developers | 4 |
| 2. Idiomatic Kotlin | What makes Kotlin clean and natural | 4 |
| 3. Concurrency | Coroutines, flows, structured concurrency | 3 |
| 4. Backend | REST APIs, serialization, testing | 3 |

See `roadmap/` for the full breakdown with progress tracking.

## Commands

| Command | Purpose |
|---------|---------|
| `/learn <module>` | Interactive lesson with examples and predictions |
| `/exercise <topic>` | Focused coding exercise with review |
| `/build <module>` | Guided mini-project (no spoilers) |
| `/review <file-path>` | Idiomatic Kotlin code review |
| `/assess <module>` | 5-question mastery check |
| `/plan-roadmap` | Progress overview and next steps |

## Structure

```
modules/<name>/
├── notes.md          # Reference sheet (filled in as you learn)
├── exercises/        # Small focused coding tasks (.kt files)
└── project/          # Mini-project directory
```

## Philosophy

- **Learn by doing** — every concept gets practiced immediately
- **Progressive mastery** — don't move on until it clicks
- **Idiomatic from day one** — learn the Kotlin way, not Java-in-Kotlin
- **Real-world relevant** — culminates in backend development skills you use at work
