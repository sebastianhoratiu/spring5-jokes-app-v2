package com.example.spring5jokesappv2.service;

import com.example.spring5jokesappv2.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public Joke getRandomJoke() {
        return new Joke(chuckNorrisQuotes.getRandomQuote());
    }
}
