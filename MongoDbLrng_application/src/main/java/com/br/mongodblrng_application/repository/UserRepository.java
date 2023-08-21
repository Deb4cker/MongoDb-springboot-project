package com.br.mongodblrng_application.repository;

import com.br.mongodblrng_application.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface UserRepository extends MongoRepository<User, Serializable> {
}
