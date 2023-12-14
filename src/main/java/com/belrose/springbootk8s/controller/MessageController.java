package com.belrose.springbootk8s.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @GetMapping("/message")
    public ResponseEntity<String> displayMessage(){
        return ResponseEntity.ok("Congratulation you successfully deployed your application to kubernetes !!");
    }
}
