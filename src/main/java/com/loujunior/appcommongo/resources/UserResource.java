package com.loujunior.appcommongo.resources;

import com.loujunior.appcommongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User user1 = new User("123", "Junior", "junior@gmail.com");
        User user2 = new User("456", "Lais", "lais@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(user1, user2));

        return ResponseEntity.ok().body(list);
    }
}
