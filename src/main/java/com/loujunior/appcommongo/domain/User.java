package com.loujunior.appcommongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class User implements Serializable {

    private String id;
    private String name;
    private String email;
}
