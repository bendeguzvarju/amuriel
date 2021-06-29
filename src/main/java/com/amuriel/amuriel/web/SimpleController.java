package com.amuriel.amuriel.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amuriel.amuriel.model.Player;
import com.amuriel.amuriel.model.user.User;

@RestController
@RequestMapping("/")
public class SimpleController {

    @GetMapping("/simple")
    public User asd() {
        User player = Player.builder()
                .userName("laci")
                .id(2)
                .build();

        return player;
    }


}
