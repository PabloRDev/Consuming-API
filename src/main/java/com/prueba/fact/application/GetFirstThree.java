package com.prueba.fact.application;

import java.util.Arrays;
import java.util.List;

public class GetFirstThree {
    public static List<String> execute(String fact) {
        return fact.split(" ").length > 3
                ?
                Arrays.asList(fact.split(" ")[0], fact.split(" ")[1], fact.split(" ")[2])
                :
                Arrays.asList(fact.split(" "));
    }
}
