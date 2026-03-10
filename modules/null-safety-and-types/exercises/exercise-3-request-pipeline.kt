data class HttpRequest(
    val headers: Map<String, String>?,
    val queryParams: Map<String, String>?,
    val body: String?
)

data class ValidatedRequest(
    val userId: String,
    val action: String,
    val payload: String
)

fun validateRequest(request: HttpRequest?): ValidatedRequest? {
    // Rules:
    //   - If request is null, return null
    //   - userId comes from headers["X-User-Id"] — required
    //   - action comes from queryParams["action"] — required
    //   - payload comes from body — if null or blank, default to "{}"
    //   - Remember: the maps themselves can be null, not just the values
    request ?: return null
    val userId = request.headers?.get("X-User-Id") ?: return null
    val action = request.queryParams?.get("action") ?: return null
    val payload = request.body.takeUnless { it.isNullOrBlank() } ?: "{}"
    return ValidatedRequest(userId, action, payload)
}