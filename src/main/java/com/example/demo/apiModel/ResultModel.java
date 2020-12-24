package com.example.demo.apiModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultModel<T> {
    private Integer code;
    private String message;
    private T data;
}
