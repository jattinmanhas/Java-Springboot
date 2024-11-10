package com.security.spring_security.resources;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;

public class StringSecurityPlayResource {

    @GetMapping("csrf-token")
    public CsrfToken retrieveCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
