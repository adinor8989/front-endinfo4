package com.exemplo.itens.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorizeRequests ->
                authorizeRequests
                    .anyRequest().permitAll() // Permite todas as requisições
            )
            .csrf(csrf -> csrf.disable()) // Desativa CSRF para APIs REST
            .headers(headers -> headers.frameOptions().disable()); // Desativa a proteção contra clickjacking

        return http.build();
    }
}





