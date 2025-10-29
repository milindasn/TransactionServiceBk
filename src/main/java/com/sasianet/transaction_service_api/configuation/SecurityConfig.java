package com.sasianet.transaction_service_api.configuation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @SuppressWarnings("rawtypes")
    protected void configure(final HttpSecurity http) throws Exception {
        ((HttpSecurity) ((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl) ((HttpSecurity)
                http.csrf().disable())
                .authorizeRequests()
                .anyRequest())
                .authenticated()
                .and())
                .httpBasic();
    }

    @Autowired
    public void configureGlobal(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("TransactionAPI_ADMIN")
                .password("{noop}aERGywQs3vrD9xETQzX2")
                .roles(new String[] { "ADMIN" });
    }
}