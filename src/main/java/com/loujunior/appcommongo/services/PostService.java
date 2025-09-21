package com.loujunior.appcommongo.services;

import com.loujunior.appcommongo.domain.Post;
import com.loujunior.appcommongo.domain.User;
import com.loujunior.appcommongo.dto.AuthorDTO;
import com.loujunior.appcommongo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PostService {

    @Autowired
    private PostRepository repository;

}
