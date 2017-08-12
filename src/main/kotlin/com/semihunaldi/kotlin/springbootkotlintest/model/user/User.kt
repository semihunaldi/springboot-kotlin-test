package com.semihunaldi.kotlin.springbootkotlintest.model.user

import com.semihunaldi.kotlin.springbootkotlintest.model.AbstractEntity
import lombok.Data
import lombok.EqualsAndHashCode
import org.hibernate.annotations.DynamicUpdate
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Data
@Table(name = "T_USER", uniqueConstraints = arrayOf(UniqueConstraint(name = "T_USER_USER_NAME_UNIQUE", columnNames = arrayOf("userName")),
                                                    UniqueConstraint(name = "T_USER_EMAIL_UNIQUE", columnNames = arrayOf("email"))))
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@Where(clause = "DELETED = '0'")
class User : AbstractEntity() {
    var userName: String? = null
    var email: String? = null
}
