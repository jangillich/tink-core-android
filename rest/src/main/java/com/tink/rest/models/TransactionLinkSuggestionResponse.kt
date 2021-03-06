/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property transactionId The ID of the transaction to find suggestions for.
 * @property limit The maximum amount of suggestions requested to be returned.
 * @property suggestedCounterpartTransactions Suggested counterpart transactions.
 */
@JsonClass(generateAdapter = true)
data class TransactionLinkSuggestionResponse(
    @Json(name = "transactionId") @field:Json(name = "transactionId") var transactionId: String? = null,
    @Json(name = "limit") @field:Json(name = "limit") var limit: Int? = null,
    @Json(name = "suggestedCounterpartTransactions") @field:Json(name = "suggestedCounterpartTransactions") var suggestedCounterpartTransactions: List<Transaction>? = null
)
