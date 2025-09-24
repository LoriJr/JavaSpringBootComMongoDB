package com.loujunior.appcommongo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class CommentDTO {

    private String text;
    private Date date;
    private AuthorDTO authorDTO;
}
