package com.prueba.giph.domain;

import lombok.Data;

@Data
public class GiphResponse {
    private String query;
    private Object data;
    private Object meta;
    private Object pagination;
}
