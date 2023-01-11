package com.alibou.security.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

<<<<<<< HEAD
    private final JwtService jwtService;

=======
>>>>>>> 889d814f5949cec7fd7dca79028c79beb35c181f
    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain
    ) throws ServletException, IOException {
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
<<<<<<< HEAD
        final String userEmail;
=======
>>>>>>> 889d814f5949cec7fd7dca79028c79beb35c181f
        if (authHeader == null ||!authHeader.startsWith("bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        jwt = authHeader.substring(7);
<<<<<<< HEAD
        userEmail = jwtService.extractUsername(jwt); // todo extract the userEmail from JWT Token;
=======
>>>>>>> 889d814f5949cec7fd7dca79028c79beb35c181f
    }
}
