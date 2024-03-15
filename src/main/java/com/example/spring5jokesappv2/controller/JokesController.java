package com.example.spring5jokesappv2.controller;

import com.example.spring5jokesappv2.model.Joke;
import com.example.spring5jokesappv2.service.JokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {
    private final JokesServiceImpl jokesServiceImpl;

    public JokesController(JokesServiceImpl jokesServiceImpl) {
        this.jokesServiceImpl = jokesServiceImpl;
    }

    @GetMapping(path="/randomJoke")
    public String getJoke(Model model) {
        Joke joke = jokesServiceImpl.getRandomJoke();
         model.addAttribute("joke", joke);
        return "index";
    }
}
