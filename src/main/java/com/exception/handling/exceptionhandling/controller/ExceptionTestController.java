package com.exception.handling.exceptionhandling.controller;

import com.exception.handling.exceptionhandling.service.ExceptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionTestController {

    private final ExceptionService exceptionService ;

    public ExceptionTestController(ExceptionService exceptionService) {
        this.exceptionService = exceptionService;
    }

    @GetMapping("/items/{index}")
    public ResponseEntity<String> getItem(@PathVariable int index) {
        String item = exceptionService.getItem(index);
        return ResponseEntity.ok(item);
    }

}
