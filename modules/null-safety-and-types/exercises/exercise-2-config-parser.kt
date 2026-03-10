data class DatabaseConfig(
    val host: String,
    val port: Int,
    val name: String,
    val maxConnections: Int
)

// Simulates reading env vars — some may be missing
fun getEnv(key: String): String? {
    return mapOf(
        "DB_HOST" to "localhost",
        "DB_NAME" to "myapp"
    )[key]
}

fun buildDatabaseConfig(): DatabaseConfig? {
    // Rules:
    //   - DB_HOST is required — if missing, return null
    //   - DB_PORT is optional, default to 5432
    //   - DB_NAME is required — if missing, return null
    //   - DB_MAX_CONNECTIONS is optional, default to 10
    //   - DB_PORT and DB_MAX_CONNECTIONS come as strings, need to parse to Int
    //   - If a numeric value is present but not a valid integer, use the default
    val host = getEnv("DB_HOST") ?: return null
    val port = getEnv("DB_PORT")?.toIntOrNull() ?: 5432
    val name = getEnv("DB_NAME") ?: return null
    val maxConnections = getEnv("DB_MAX_CONNECTIONS")?.toIntOrNull() ?: 10

    return DatabaseConfig(host, port, name, maxConnections)
}