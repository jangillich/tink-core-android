/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The user model represents a unique Tink end-user and includes properties that defines the user, user profile information and user-modifiable settings. The user information can primarily be used whenever a Tink user signs up for a 3rd party service using her Tink account, or when user-modifiable settings, such as locale or currency, are needed in order to display or calculate the correct data in the 3rd party service.
 * @property created The date when the user was created.
 * @property flags The user-specific feature flags assigned to the user.
 * @property id The internal identifier of the user.
 * @property profile The configurable profile of the user.
 * @property username The username (usually email) of the user.
 * @property nationalId Detected national identification number of the end-user.
 */
@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "created") @field:Json(name = "created") var created: Long,
    @Json(name = "id") @field:Json(name = "id") var id: String,
    @Json(name = "profile") @field:Json(name = "profile") var profile: UserProfile,
    @Json(name = "flags") @field:Json(name = "flags") var flags: List<String>? = null,
    @Json(name = "username") @field:Json(name = "username") var username: String? = null,
    @Json(name = "nationalId") @field:Json(name = "nationalId") var nationalId: String? = null
)
