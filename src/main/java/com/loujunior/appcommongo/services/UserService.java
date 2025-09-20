package com.loujunior.appcommongo.services;

import com.loujunior.appcommongo.domain.User;
import com.loujunior.appcommongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> find(){
        return repository.findAll();
    }

    public User insert(User obj){
        return repository.insert(obj);
    }
}
