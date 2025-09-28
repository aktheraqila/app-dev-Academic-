package com.aas.selfpromoapp

import java.io.Serializable

data class Message (
    val contactName: String,
    val contactNumber: String,
    val displayName: String,
    val includeJunior: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String
) : Serializable {

    fun getFullJobDescription(): String {
        if (includeJunior) {
           return "a Junior $jobTitle"
        }
        else{
             return "an $jobTitle"
        }
    }

}