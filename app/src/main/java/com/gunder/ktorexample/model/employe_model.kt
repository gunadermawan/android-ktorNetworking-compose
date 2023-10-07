package com.gunder.ktorexample.model


import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class Response(
    val status: String,
    val data: List<Data>,
    val message: String
)

@Serializable
data class Data(
    val id: Int,

    @SerialName("employee_name")
    val employeeName: String,

    @SerialName("employee_salary")
    val employeeSalary: Int,

    @SerialName("employee_age")
    val employeeAge: Int,

    @SerialName("profile_image")
    val profileImage: String
)
