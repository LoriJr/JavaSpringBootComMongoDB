package com.loujunior.appcommongo.config;

import com.loujunior.appcommongo.domain.Post;
import com.loujunior.appcommongo.domain.User;
import com.loujunior.appcommongo.dto.AuthorDTO;
import com.loujunior.appcommongo.repository.PostRepository;
import com.loujunior.appcommongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.insert(Arrays.asList(maria, alex, bob));

        Post p1 = new Post(null, sdf.parse("21/03/2018"), "Indo de viagem", "Estou saindo para viajar hoje", new AuthorDTO(maria));
        Post p2 = new Post(null, sdf.parse("10/08/2018"), "Bom dia", "Acordei feliz hoje", new AuthorDTO(maria));


        postRepository.insert(Arrays.asList(p1, p2));

    }
}
