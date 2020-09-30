/**
* BlaBlaCar APIs
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* Contact: squad-edge@blablacar.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Step

import com.squareup.moshi.Json
/**
 * 
 * @param steps 
 * @param flowId This flow identifier is generated by the client application and embedded in the first request to Edge. It will be then added in each subsequent requests and responses of the booking flow.
 */

data class BookingResponse (
    @Json(name = "steps")
    val steps: kotlin.Array<Step>? = null,
    /* This flow identifier is generated by the client application and embedded in the first request to Edge. It will be then added in each subsequent requests and responses of the booking flow. */
    @Json(name = "flow_id")
    val flowId: java.util.UUID? = null
)

