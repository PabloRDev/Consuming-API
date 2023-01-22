package com.prueba.fact.infrastructure;

import com.prueba.fact.application.GetFirstThree;
import com.prueba.fact.domain.FactResponse;
import com.prueba.fact.application.client.FactClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fact")
public class FactController {
    @Autowired
    private FactClient factClient;

    @GetMapping
    public FactResponse getFact() {
        return factClient.getRandomFact();
    }

    @GetMapping("/firstThree")
    public List<String> getFirstThreeWords() {
        return GetFirstThree.execute(factClient.getRandomFact().getFact());
    }
}
