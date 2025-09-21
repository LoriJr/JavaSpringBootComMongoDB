package com.loujunior.appcommongo.resources;

import com.loujunior.appcommongo.domain.Post;
import com.loujunior.appcommongo.domain.User;
import com.loujunior.appcommongo.dto.UserDTO;
import com.loujunior.appcommongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Post>> find(){
        List<Post> list = service.find();
        return ResponseEntity.ok().body(list);
    }
}
