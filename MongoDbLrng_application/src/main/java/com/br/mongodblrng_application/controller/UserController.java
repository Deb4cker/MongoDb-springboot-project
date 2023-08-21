package com.br.mongodblrng_application.controller;

import com.br.mongodblrng_application.domain.User;
import com.br.mongodblrng_application.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private UserService service;
    @GetMapping
    public ResponseEntity<List<User>> GetAll(){
        var list = service.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
