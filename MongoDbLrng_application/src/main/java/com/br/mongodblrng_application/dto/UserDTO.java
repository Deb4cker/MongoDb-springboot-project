package com.br.mongodblrng_application.dto;

import com.br.mongodblrng_application.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String name;
    private String email;

    public UserDTO (User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }
}
