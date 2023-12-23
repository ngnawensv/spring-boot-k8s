package com.belrose.springbootk8s.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class MessageController {

    @GetMapping("/message")
    public ResponseEntity<String> displayMessage(){
        log.info("log for checking deployment to docker hub...");
        return ResponseEntity.ok("Congratulation you successfully deployed your application to kubernetes !!");
    }
}
