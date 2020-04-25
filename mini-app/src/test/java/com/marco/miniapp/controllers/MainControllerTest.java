package com.marco.miniapp.controllers;

import org.junit.Test;

import java.net.UnknownHostException;

import static org.junit.Assert.*;

public class MainControllerTest {

    @Test
    public void sayHello() throws UnknownHostException {
        MainController mainController = new MainController();

        final String result = mainController.sayHello();

        assertTrue(result.startsWith("Hello from"));
    }
}