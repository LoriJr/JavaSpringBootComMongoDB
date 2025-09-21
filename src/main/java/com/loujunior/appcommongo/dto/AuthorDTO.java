package com.loujunior.appcommongo.dto;

import com.loujunior.appcommongo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AuthorDTO {

    private String id;
    private String name;

    public AuthorDTO(User obj){
        id = obj.getId();
        name = obj.getName();
    }
    public AuthorDTO(){
    }
}
