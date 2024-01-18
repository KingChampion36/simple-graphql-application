package com.kingchampion36.simple.graphql.application.controller

import com.kingchampion36.simple.graphql.application.service.StudentService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller


@Controller
class GetController(private val studentService: StudentService) {

  @QueryMapping
  fun students(@Argument name: String?, @Argument year: String?, @Argument branch: String?) = studentService.getStudents(name, year, branch)
}
