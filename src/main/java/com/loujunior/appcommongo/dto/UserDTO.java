package com.loujunior.appcommongo.dto;


import com.loujunior.appcommongo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    private String id;
    private String name;
    private String email;

    public UserDTO(User obj){
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();
    }

}
