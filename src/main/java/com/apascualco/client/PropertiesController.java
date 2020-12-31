package com.apascualco.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${client.environment}")
    private String environment;

    @Value("${client.extra.name}")
    private String extraProperty;

    @GetMapping(value = "/env", produces = MediaType.TEXT_PLAIN_VALUE)
    public String properties() {
        return environment;
    }

    @GetMapping(value = "/extra", produces = MediaType.TEXT_PLAIN_VALUE)
    public String extra() {
        return extraProperty;
    }

}
