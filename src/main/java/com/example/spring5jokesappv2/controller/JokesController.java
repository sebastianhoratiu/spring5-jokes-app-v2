package com.example.spring5jokesappv2.controller;

import com.example.spring5jokesappv2.model.Joke;
import com.example.spring5jokesappv2.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {

        this.jokesService = jokesService;
    }

    @RequestMapping(path = "/")
    public String showJoke(Model model) {
        Joke joke = jokesService.getJoke();
         model.addAttribute("joke", joke);
        return "index";
    }
}
