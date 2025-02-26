package com._2p1team.cmapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain secureRequests(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests(httpRequests -> {
                httpRequests.requestMatchers("/swagger-ui/**", "/swagger-resources/**", "/v3/api-docs/**").permitAll();
                httpRequests.anyRequest().permitAll();
            })
            .formLogin(Customizer.withDefaults())
            .build();
    }

}