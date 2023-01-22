package com.prueba.giph.infrastructure;

import com.prueba.fact.infrastructure.FactController;
import com.prueba.giph.application.JoinFirstThreeWords;
import com.prueba.giph.domain.GiphResponse;
import com.prueba.giph.application.client.GiphClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/giph")
public class GiphController {
    @Autowired
    GiphClient giphClient;
    @Autowired
    FactController factController;

    @GetMapping("/catFact")
    public GiphResponse getGiph() {
        String query = JoinFirstThreeWords.execute(factController.getFirstThreeWords());
        GiphResponse response = giphClient.getGiph(query);
        response.setQuery(query);

        return response;
    }
}
