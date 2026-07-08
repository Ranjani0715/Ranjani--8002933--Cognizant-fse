
package com.cognizant.jwt.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String authenticate(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader) {

        String username = getUser(authorizationHeader);

        String token = jwtUtil.generateToken(username);

        return "{\"token\":\"" + token + "\"}";
    }

    private String getUser(String authorizationHeader) {

        String encoded = authorizationHeader.substring(6);

        byte[] decoded = Base64.getDecoder().decode(encoded);

        String credentials = new String(decoded, StandardCharsets.UTF_8);

        return credentials.split(":")[0];
    }
}