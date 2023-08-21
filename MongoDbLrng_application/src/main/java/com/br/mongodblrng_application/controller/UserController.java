package com.br.mongodblrng_application.controller;

import com.br.mongodblrng_application.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> GetAll(){
        var list = new ArrayList<User>();

        var u1 = new User(UUID.randomUUID(), "Juóun", "john@john");
        var u2 = new User(UUID.randomUUID(), "Juóuna", "johna@johna");
        var u3 = new User(UUID.randomUUID(), "Juóuninia", "johnina@johnina");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        return new ResponseEntity(list, HttpStatus.OK);
    }
}
