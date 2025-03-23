package com.example.Spring.Security;

import com.example.Spring.Services.MyUserDetailService;
import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

public class Security implements SecurityFilterChain {
    @Autowired
    private MyUserDetailService myUserDetailService;

    public void Configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService);
    }

    @Override
    public boolean matches(HttpServletRequest request) {
        return false;
    }

    @Override
    public List<Filter> getFilters() {
        return List.of();
    }
}
