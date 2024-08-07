package com.lxisoft.hungergame;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    CoustomUserDetails userdetails ;
    
	@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(authz -> authz
            .requestMatchers("/").permitAll()
            .requestMatchers("/signup").permitAll()
            .requestMatchers("/admin/**").hasAuthority("admin")
            .requestMatchers("/signup-data").permitAll()
            .requestMatchers("/hungergame/**").hasAnyAuthority("guest", "user", "admin")
            .requestMatchers("/game/**").hasAnyAuthority("guest","user", "admin")
            .anyRequest().authenticated()
        )
        .formLogin(form -> form
            .loginPage("/login").permitAll()
        )
        .logout(logout -> logout
            .permitAll())
        .userDetailsService(userdetails);
        
    return http.build();
}


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
