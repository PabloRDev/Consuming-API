package com.prueba.giph.application;

import java.util.List;

public class JoinFirstThreeWords {
    public static String execute(List<String> response) {
        return String.join("+", response);
    }
}
