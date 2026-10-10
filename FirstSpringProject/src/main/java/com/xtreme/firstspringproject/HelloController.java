package com.xtreme.firstspringproject;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("Hello World! It's my first SpringBoot App.");
    }

    @GetMapping("/hello/{name}")
    public HelloResponse helloYash(@PathVariable String name) {
        return new HelloResponse("Hello " + name + "!");
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/bank/home")
    public HelloResponse bankHome() {
        return new HelloResponse("Welcome to the Banking Home page.");
    }

    @PostMapping("bank/home/{name}")
    public String bankPost(@PathVariable @RequestBody String name) {
        return "Hello, " + name + "! Welcome to Banking Home page.";
    }



}