package com.example.demoopenidcclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public String getOrders(Principal principal) {
        return "orders for " + principal;
    }
}
