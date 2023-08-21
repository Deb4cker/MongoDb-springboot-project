package com.br.mongodblrng_application.service;

import com.br.mongodblrng_application.domain.User;
import com.br.mongodblrng_application.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository repository;
    public List<User> findAll() {
        return repository.findAll();
    }
}
