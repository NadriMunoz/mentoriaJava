package com.imagemaker.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class User {

    @GetMapping("/")
    public String init(){
        return "HOLA MUNDO";
    }

    @PostMapping("/")
    public Object post(@RequestBody Object ejemplo){
        return ejemplo;
    }

    @PutMapping("/")
    public String put(){
        return "";
    }
    //ut
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        return id.toString();}
}
