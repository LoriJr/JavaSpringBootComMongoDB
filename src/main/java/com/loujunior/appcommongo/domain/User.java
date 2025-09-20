package com.loujunior.appcommongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Document(collection="user")
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;
}
