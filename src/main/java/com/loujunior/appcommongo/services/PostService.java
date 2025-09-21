package com.loujunior.appcommongo.services;

import com.loujunior.appcommongo.domain.Post;
import com.loujunior.appcommongo.domain.User;
import com.loujunior.appcommongo.repository.PostRepository;
import com.loujunior.appcommongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> find(){
        return repository.findAll();
    }
}
