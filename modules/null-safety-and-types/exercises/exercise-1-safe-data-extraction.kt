data class Address(val city: String?, val country: String?)
data class UserProfile(val name: String?, val email: String?, val address: Address?)

fun getDisplayInfo(user: UserProfile?): String {
    // Return: "Name (email) - City, Country"
    // Rules:
    //   - If name is null, use "Anonymous"
    //   - If email is null, omit the parentheses entirely
    //   - If address, city, or country is null, omit the " - City, Country" part
    //   - Example: "Alice (alice@test.com) - London, UK"
    //   - Example: "Anonymous - London, UK"
    //   - Example: "Alice"
    //   - If user itself is null, return "No user"
    user ?: return "No user"

    val name = user.name ?: "Anonymous"
    val email = user.email?.let { " ($it)" } ?: ""
    val address = user.address?.let { addr ->
        val city = addr.city ?: return@let null
        val country = addr.country ?: return@let null
        " - $city, $country"
    } ?: ""

    return "$name$email$address"
}