package com.mike.hobbs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Entity entity = restTemplate.getForObject("https://dog.ceo/api/breed/terrier/list", Entity.class);
        log.info(entity.toString());
    }

}
