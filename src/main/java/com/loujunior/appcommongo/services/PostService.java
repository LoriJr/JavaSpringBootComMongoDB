package com.loujunior.appcommongo.services;

import com.loujunior.appcommongo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PostService {

    @Autowired
    private PostRepository repository;
}
