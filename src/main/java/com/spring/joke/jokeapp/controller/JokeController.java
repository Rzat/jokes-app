package com.spring.joke.jokeapp.controller;

import com.spring.joke.jokeapp.services.Jokeservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private Jokeservice jokeservice;

    public JokeController(Jokeservice jokeservice) {
        this.jokeservice = jokeservice;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeservice.getJoke());
        return "chucknorris";
    }
}
