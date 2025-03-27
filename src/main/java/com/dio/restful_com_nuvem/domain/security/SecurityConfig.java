//package com.dio.restful_com_nuvem.domain.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers(
//                                "/h2-console/**",
//                                "/v3/api-docs/**",
//                                "/swagger-ui/**",
//                                "/swagger-ui.html"
//                        ).permitAll() // Permite acesso sem autenticação
//                        .anyRequest().authenticated() // Protege as demais rotas
//                )
//                .csrf(AbstractHttpConfigurer::disable) // Necessário para evitar bloqueios do H2 Console e Swagger
//                .headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable)); // Libera iframes do H2 Console
//
//        return http.build();
//    }
//}
//
////{
////        "name": "caio",
////        "account": {
////        "number": "00000-00",
////        "agency": "000",
////        "balance": 10000.00,
////        "limit": 10000.00
////        },
////        "features": [
////        {
////        "icon": "URL",
////        "description": "Description of Features"
////        }
////        ],
////        "card": {
////        "number": "xxxx xxxx xxxx 0000",
////        "limit": 10000.00
////        },
////        "news": [
////        {
////        "icon": "URL",
////        "description": "Description of News"
////        }
////        ]
////        }

// tratamento de Exceções em APIs REST