package com.prueba.fact.application.client;

import com.prueba.fact.domain.FactResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://catfact.ninja", name = "factClient")
public interface FactClient {
    @GetMapping("/fact")
    FactResponse getRandomFact();
}
