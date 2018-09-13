package com.softeam.helloworld.resources;

import com.softeam.helloworld.dao.MessageDAO;
import com.softeam.helloworld.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@RestController
public class HelloResource {

    private final MessageDAO messageDAO;

    @Autowired
    public HelloResource(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    @GetMapping(path = "/hello")
    Collection<MessageDTO> findAll() {
        return Arrays.asList(new MessageDTO(1, "coucou"));
    }
}
