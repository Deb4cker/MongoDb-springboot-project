package com.br.mongodblrng_application.service;
import com.br.mongodblrng_application.Exception.UserNotFoundException;
import com.br.mongodblrng_application.domain.User;
import com.br.mongodblrng_application.dto.UserDTO;
import com.br.mongodblrng_application.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository repository;

    public List<UserDTO> findAll() {
        var users = repository.findAll();
        return users.stream().map(UserDTO::new).toList();
    }

    public UserDTO findById(String id){
        var obj = repository.findById(id).orElseThrow(UserNotFoundException::new);
        return new UserDTO(obj);
    }

    public void create(UserDTO request){
        repository.save(new User(request.getId(), request.getName(), request.getName()));
    }

    public void update(String id, UserDTO request){
        var obj = repository.findById(id).orElseThrow(UserNotFoundException::new);

        obj.setName(request.getName());
        obj.setEmail(request.getEmail());
    }

    public void delete(String id){
            repository.deleteById(id);
    }
}
