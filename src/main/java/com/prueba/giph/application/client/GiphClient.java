package com.prueba.giph.application.client;

import com.prueba.giph.domain.GiphResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://api.giphy.com/v1/gifs", name = "giphClient")

public interface GiphClient {
    @GetMapping(
            "/search?q={q}&api_key=ndhR89yDwZeuhiHBP9tYiftp5LrXOBve&limit=1"
    )
    GiphResponse getGiph(@PathVariable String q);
}