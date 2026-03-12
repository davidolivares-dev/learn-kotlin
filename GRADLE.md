# Gradle Setup — How & Why

## What Is Gradle?

Gradle is a **build tool** for JVM projects (Kotlin, Java, etc.). It handles:

- **Compiling** your `.kt` files into runnable bytecode
- **Managing dependencies** (downloading libraries you need)
- **Running** your programs and tests
- **IDE integration** — IntelliJ, VS Code, etc. read `build.gradle.kts` to understand your project structure, enabling code completion, error highlighting, and navigation

Think of it like `npm` for Node.js or `cargo` for Rust — it's the standard way Kotlin/JVM projects are built.

## Why We Need It

Without Gradle, your IDE treats `.kt` files as standalone scripts with no context. It doesn't know:
- Which Kotlin version to use
- Where to find source files
- What libraries are available
- How to compile and run your code

The `build.gradle.kts` files give your IDE (and the compiler) all of this information.

## How This Project Uses Gradle

### Multi-Module Setup

Instead of a separate Gradle project per module, we use a single **multi-module** setup at the repo root. This means:

- One shared Kotlin configuration for everything
- Every module's `exercises/` and `project/` directories are automatically discovered as subprojects
- Adding a new module "just works" — no extra Gradle config needed

### Key Files

| File | Purpose |
|------|---------|
| `settings.gradle.kts` | Defines the project name and auto-discovers all module subprojects |
| `build.gradle.kts` | Applies the Kotlin JVM plugin and configures source directories for all subprojects |
| `modules/<name>/project/build.gradle.kts` | Only needed for projects with a `main()` function — adds the `application` plugin |
| `gradlew` / `gradlew.bat` | The **Gradle wrapper** — a script that downloads and runs the exact Gradle version this project needs, so you don't need Gradle installed globally |
| `gradle/wrapper/` | Config files for the wrapper (which Gradle version to use, where to download it) |

### Custom Source Directory

Standard Gradle expects code in `src/main/kotlin/`. We override this so `.kt` files can live directly in `exercises/` and `project/` directories — keeping the repo structure flat and simple for a learning project.

This is configured in the root `build.gradle.kts`:
```kotlin
the<KotlinJvmProjectExtension>().sourceSets["main"].kotlin {
    srcDirs(".")  // use the subproject directory itself as the source root
}
```

## Common Commands

```bash
# Compile a specific module's exercises
./gradlew :modules:null-safety-and-types:exercises:compileKotlin

# Run a project with a main() function
./gradlew :modules:null-safety-and-types:project:run

# Compile everything
./gradlew compileKotlin

# List all subprojects
./gradlew projects
```

## The Gradle Wrapper (`gradlew`)

The wrapper is committed to the repo so that:
- You don't need Gradle installed on your machine
- Everyone gets the exact same Gradle version
- CI/CD systems can build without pre-installing Gradle

Just use `./gradlew` instead of `gradle` for all commands.
