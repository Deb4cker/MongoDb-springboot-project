package com.br.mongodblrng_application.controller;

import com.br.mongodblrng_application.dto.UserDTO;
import com.br.mongodblrng_application.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private UserService service;
    @GetMapping
    public ResponseEntity<List<UserDTO>> getAll(){
        var list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable String id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<String> create(@RequestBody UserDTO objDto){
        var obj = service.fromDTO(objDto);
        service.create(obj);

        return new ResponseEntity<>(obj.getId(), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Void> update(@PathVariable String id, @RequestBody UserDTO objDto){
        service.update(id, objDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
