package com.kingchampion36.simple.graphql.application.service

import com.kingchampion36.simple.graphql.application.dto.Address
import com.kingchampion36.simple.graphql.application.dto.Student
import org.springframework.stereotype.Service

@Service
class StudentService {
  private val students = listOf(
    Student(
      id = 1,
      name = "Rahul",
      year = "Second",
      branch = "ECE",
      subjectsTaken = listOf("DSA", "CN", "OS"),
      address = Address(
        firstLine = "New Delhi",
        pinCode = 110074,
        state = "Delhi",
        country = "India"
      )
    )
  )

  fun getStudents(name: String?, year: String?, branch: String?): List<Student> {
    val filteredStudentsByName = if (name != null) students.filter { it.name == name } else students
    val filteredStudentsByYear = if (year != null) filteredStudentsByName.filter { it.year == year } else filteredStudentsByName
    val filteredStudentsByBranch = if (year != null) filteredStudentsByYear.filter { it.year == year } else filteredStudentsByYear
    return filteredStudentsByBranch
  }
}
