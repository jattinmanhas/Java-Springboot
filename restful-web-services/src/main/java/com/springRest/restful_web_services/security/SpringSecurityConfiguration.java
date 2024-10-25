package com.springRest.restful_web_services.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        // all requests should be authenticated
        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        // if req is not authenticated show a page
        http.httpBasic(Customizer.withDefaults());

        // disable csrf for post and put
        http.csrf().disable();

        return http.build();
    }
}
