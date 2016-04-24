package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex on 24.04.16.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello, World!";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String helloName(@PathVariable String name) {
        return "Hello, " + name;
    }

}
