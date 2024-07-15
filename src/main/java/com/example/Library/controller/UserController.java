package com.example.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(&quot;/auth&quot;)
public class UserController {

    @Autowired
    private UserInfoService service;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping(&quot;/welcome&quot;)
    public String welcome() {
        return &quot;Welcome this endpoint is not secure&quot;;
    }

    @PostMapping(&quot;/addNewUser&quot;)
    public String addNewUser(@RequestBody UserInfo userInfo) {
        return service.addUser(userInfo);
    }

    @GetMapping(&quot;/user/userProfile&quot;)
    @PreAuthorize(&quot;hasAuthority('ROLE_USER')&quot;)
    public String userProfile() {
        return &quot;Welcome to User Profile&quot;;
    }

    @GetMapping(&quot;/admin/adminProfile&quot;)
    @PreAuthorize(&quot;hasAuthority('ROLE_ADMIN')&quot;)
    public String adminProfile() {
        return &quot;Welcome to Admin Profile&quot;;
    }

    @PostMapping(&quot;/generateToken&quot;)
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException(&quot;invalid user request !&quot;);
        }
    }

}
