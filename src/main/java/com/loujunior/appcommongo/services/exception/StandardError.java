package com.loujunior.appcommongo.services.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.Instant;


@AllArgsConstructor
@Data
public class StandardError {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
