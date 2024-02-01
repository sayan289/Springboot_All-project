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
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailsService()
    {
        UserDetails normaluser=User.withUsername("sayan").password(passwordEncoder().encode("abc")).roles("NORMAL").build();
        UserDetails adminuser=User.withUsername("subhajit").password(passwordEncoder().encode("abc")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(normaluser,adminuser);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpsecurity) throws Exception {
        httpsecurity.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/home/public").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();
        return httpsecurity.build();

    }
}
