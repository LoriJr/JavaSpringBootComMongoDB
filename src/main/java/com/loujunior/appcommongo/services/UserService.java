package com.loujunior.appcommongo.services;

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
    //TO-DO
    public User update(User obj){
        User newObj = new User();
        repository.findById(obj.getId());
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(User newObj, User obj){
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }
}
