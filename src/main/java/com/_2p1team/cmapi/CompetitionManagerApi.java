package com._2p1team.cmapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "CompetitionManager API"))
public class CompetitionManagerApi {

    public static void main(String[] args) {
        SpringApplication.run(CompetitionManagerApi.class, args);
    }

}