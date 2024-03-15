package com.example.spring5jokesappv2.service;

import com.example.spring5jokesappv2.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public Joke getRandomJoke() {
        return new Joke(chuckNorrisQuotes.getRandomQuote());
    }
}
