package demo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

// https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
@Table("MESSAGES")
data class Message(@Id val id: String?, val text: String)