package com.example.spring5jokesappv2.controller;

import com.example.spring5jokesappv2.model.Joke;
import com.example.spring5jokesappv2.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping(path="/randomJoke")
    public String getJoke(Model model) {
        Joke joke = jokesService.getRandomJoke();
         model.addAttribute("joke", joke);
        return "index";
    }
}
