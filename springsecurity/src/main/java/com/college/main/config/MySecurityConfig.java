package com.college.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {
  @Bean
    UserDetailsService userDetailsService() {
		UserDetails user=User.builder().username("Subhajit").password(passwordEncoder().encode("Subhajit@123")).roles("ADMIN").build();
		UserDetails user1=User.builder().username("Sayan").password(passwordEncoder().encode("Sayan@123")).roles("NORMAL").build();
		return new InMemoryUserDetailsManager(user,user1);
	}
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
  
}
