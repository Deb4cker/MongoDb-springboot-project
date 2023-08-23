package com.br.mongodblrng_application.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandardError {
    private Long timeStamp;
    private Integer status;
    private String message;
    private String path;


}
