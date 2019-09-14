package com.marco.miniapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class MainController {

    @GetMapping("/")
    public String sayHello() throws UnknownHostException {
        return "Hello from " + InetAddress.getLocalHost();
    }
}
