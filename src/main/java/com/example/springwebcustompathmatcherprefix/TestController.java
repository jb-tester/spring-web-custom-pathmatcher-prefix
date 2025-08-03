package com.example.springwebcustompathmatcherprefix;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public  class TestController {

    @GetMapping("/test1")
    public ResponseEntity<String> test1() {
        return ResponseEntity.ok("test1");
    }
}
