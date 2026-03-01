# Learn Kotlin — Project Context

## What This Is

A structured Kotlin learning repository using module-based progressive mastery. Designed for use with Claude Code as an interactive learning companion. Aimed at experienced programmers (Java/Xtend background) who learn best by doing.

## Directory Structure

- `roadmap/` — Phased learning plan with progress tracking. Read this first.
- `.claude/commands/` — Slash commands for Claude Code learning sessions.
- `modules/` — One directory per learning module, filled in as you progress.
  - Each module has `notes.md` (reference sheet), `exercises/` (focused coding tasks), and `project/` (mini-project).
- `log/` — Optional learning journal.

## Conventions

- Module directories follow the structure in `modules/_template/`
- Exercise files: `.kt` with comment header (topic, exercise name, key concept)
- Project code: Gradle-based Kotlin projects (one `build.gradle.kts` per project)
- Notes follow template sections defined in `modules/_template/notes.md`
- All filenames use lowercase-kebab-case

## Language

Kotlin. Exercises and projects target JVM Kotlin.

## Workflow Per Module

1. `/learn <module>` — Interactive lesson (~30-45 min)
2. Complete 2-3 exercises in `modules/<module>/exercises/` (~30 min)
3. `/build <module>` — Build the mini-project (~45-60 min)
4. `/review` on your project code
5. `/assess <module>` — Pass before moving on

## Commands

| Command | Purpose |
|---------|---------|
| `/learn <module>` | Interactive lesson — teaches concepts with inline examples, asks you to predict output, explains the "why" |
| `/exercise <topic>` | Gives a focused coding exercise, reviews your solution, suggests improvements |
| `/build <module>` | Guides you through the mini-project step by step without giving away the answer |
| `/review <file-path>` | Reviews your code for idiomatic Kotlin, correctness, and style |
| `/assess <module>` | 5-question assessment to check mastery before moving on |
| `/extract-notes <module>` | Auto-fills `modules/<module>/notes.md` from the current conversation |
| `/plan-roadmap` | Shows progress, recommends what to work on next |

## Module Progression (14 modules, 4 phases)

### Phase 1: Foundations
1. Null Safety & Types
2. Functions & Lambdas
3. Collections
4. Classes & Objects

### Phase 2: Idiomatic Kotlin
5. Scope Functions
6. Generics & Type System
7. Error Handling
8. DSLs & Operators

### Phase 3: Concurrency
9. Coroutines Basics
10. Flows & Channels
11. Structured Concurrency

### Phase 4: Backend
12. HTTP & Serialization
13. REST API Design
14. Testing

## Mastery Rule

Do not move to the next module until:

- You can explain each concept in your own words
- You can write idiomatic code using the concepts without reference
- You understand the "why" — not just the "how"
- You've completed the mini-project and it passes review
- You've passed the `/assess` check

## Quality Checks

When generating or editing content in this repo:

- Keep module counts consistent across all files (roadmap, README, CLAUDE.md) — currently 14
- Verify file paths and cross-references actually exist
- Exercise and project code should compile and run
- Prefer idiomatic Kotlin over Java-style Kotlin in all examples
