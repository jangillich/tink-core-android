/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property code The authorization code. It should be treated as opaque (no defined format).
 */
@JsonClass(generateAdapter = true)
data class OAuth2AuthorizeResponse(
    @Json(name = "code") @field:Json(name = "code") var code: String
)