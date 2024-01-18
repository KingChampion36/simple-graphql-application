package com.kingchampion36.simple.graphql.application.dto

data class Student(
  val id: Int,
  val name: String,
  val year: String,
  val branch: String,
  val subjectsTaken: List<String>,
  val address: Address
)

data class Address(
  val firstLine: String,
  val secondLine: String? = null,
  val landmark: String? = null,
  val pinCode: Int,
  val state: String,
  val country: String
)
