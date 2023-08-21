package com.br.mongodblrng_application.config;

import com.br.mongodblrng_application.domain.User;
import com.br.mongodblrng_application.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@AllArgsConstructor
@Configuration
public class Instantiation implements CommandLineRunner {

    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        repository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
