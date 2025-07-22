package vn.edu.ptit.duongvct.practice1.socialmedia.user_service.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(value = "users")
@Getter
@Setter
public class User {
    @Id
    private String id;

    private String keyCloakId;
    private String name;
    private LocalDate dob;
    private String email;
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}
