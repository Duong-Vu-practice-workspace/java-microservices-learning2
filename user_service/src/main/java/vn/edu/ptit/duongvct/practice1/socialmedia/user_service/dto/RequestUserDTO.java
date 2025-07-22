package vn.edu.ptit.duongvct.practice1.socialmedia.user_service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RequestUserDTO {
    private String name;
    private LocalDate dob;
    private String email;
}
