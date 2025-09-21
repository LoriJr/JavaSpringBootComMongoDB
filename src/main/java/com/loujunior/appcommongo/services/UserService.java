package com.loujunior.appcommongo.services;

import com.loujunior.appcommongo.domain.Post;
import com.loujunior.appcommongo.domain.User;
import com.loujunior.appcommongo.dto.UserDTO;
import com.loujunior.appcommongo.repository.UserRepository;
import com.loujunior.appcommongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> find(){
        return repository.findAll();
    }

    public User save(User obj){
        return repository.insert(obj);
    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(),objDTO.getEmail());
    }

    public User findById(String id){
        Optional<User> user = repository.findById(id);
           return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User update(User obj){
        User newObj = repository.findById(obj.getId())
                        .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(User newObj, User obj){
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public List<Post> findPostsByUserId(String userId) {
        User user = findById(userId);
        // A linha abaixo FORÇA o carregamento da lista de posts
        // enquanto a sessão com o banco ainda está ativa.
        user.getPosts().size(); // Ou qualquer outra operação na lista
        return user.getPosts();
    }
}
