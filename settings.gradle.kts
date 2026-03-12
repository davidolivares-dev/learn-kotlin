rootProject.name = "learn-kotlin"

val modulesDir = file("modules")
modulesDir.listFiles()
    ?.filter { it.isDirectory && it.name != "_template" }
    ?.sorted()
    ?.forEach { moduleDir ->
        val moduleName = moduleDir.name

        val exercisesDir = File(moduleDir, "exercises")
        if (exercisesDir.isDirectory) {
            include(":modules:$moduleName:exercises")
            project(":modules:$moduleName:exercises").projectDir = exercisesDir
        }

        val projectDir = File(moduleDir, "project")
        if (projectDir.isDirectory) {
            include(":modules:$moduleName:project")
            project(":modules:$moduleName:project").projectDir = projectDir
        }
    }
