/**
* Onfido API
* The Onfido API is used to submit check requests.
*
* OpenAPI spec version: 2.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Address
import org.openapitools.client.models.IdNumber

/**
 * 
 * @param id The unique identifier for the applicant. Read-only.
 * @param createdAt The date and time when this applicant was created. Read-only.
 * @param deleteAt The date and time when this applicant is scheduled to be deleted. Read-only.
 * @param href The uri of this resource. Read-only.
 * @param sandbox Read-only.
 * @param title The applicant’s title
 * @param firstName The applicant’s first name
 * @param middleName The applicant’s middle name(s) or initial
 * @param lastName The applicant’s surname
 * @param email The applicant’s email address. Required if doing a US check or a standard UK check.
 * @param gender The applicant’s gender. Valid values are male and female.
 * @param dob The applicant’s date of birth
 * @param telephone The applicant’s landline phone number
 * @param mobile The applicant’s mobile phone number
 * @param country The country where this applicant will be checked. This must be a three-letter ISO code e.g. GBR or USA
 * @param nationality The applicant's nationality. This must be a three-letter ISO code e.g. GBR or USA
 * @param mothersMaidenName The applicant’s mothers maiden name
 * @param countryOfBirth The applicant’s country of birth
 * @param townOfBirth The applicant’s town of birth
 * @param previousLastName The applicant’s previous last name
 * @param addresses 
 * @param idNumbers 
 */
data class Applicant (
    /* The unique identifier for the applicant. Read-only. */
    val id: kotlin.String? = null,
    /* The date and time when this applicant was created. Read-only. */
    val createdAt: java.time.LocalDateTime? = null,
    /* The date and time when this applicant is scheduled to be deleted. Read-only. */
    val deleteAt: java.time.LocalDateTime? = null,
    /* The uri of this resource. Read-only. */
    val href: kotlin.String? = null,
    /* Read-only. */
    val sandbox: kotlin.Boolean? = null,
    /* The applicant’s title */
    val title: kotlin.String? = null,
    /* The applicant’s first name */
    val firstName: kotlin.String? = null,
    /* The applicant’s middle name(s) or initial */
    val middleName: kotlin.String? = null,
    /* The applicant’s surname */
    val lastName: kotlin.String? = null,
    /* The applicant’s email address. Required if doing a US check or a standard UK check. */
    val email: kotlin.String? = null,
    /* The applicant’s gender. Valid values are male and female. */
    val gender: kotlin.String? = null,
    /* The applicant’s date of birth */
    val dob: java.time.LocalDateTime? = null,
    /* The applicant’s landline phone number */
    val telephone: kotlin.String? = null,
    /* The applicant’s mobile phone number */
    val mobile: kotlin.String? = null,
    /* The country where this applicant will be checked. This must be a three-letter ISO code e.g. GBR or USA */
    val country: kotlin.String? = null,
    /* The applicant's nationality. This must be a three-letter ISO code e.g. GBR or USA */
    val nationality: kotlin.String? = null,
    /* The applicant’s mothers maiden name */
    val mothersMaidenName: kotlin.String? = null,
    /* The applicant’s country of birth */
    val countryOfBirth: kotlin.String? = null,
    /* The applicant’s town of birth */
    val townOfBirth: kotlin.String? = null,
    /* The applicant’s previous last name */
    val previousLastName: kotlin.String? = null,
    val addresses: kotlin.Array<Address>? = null,
    val idNumbers: kotlin.Array<IdNumber>? = null
) {

}
