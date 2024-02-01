package com.college.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {
  
}
