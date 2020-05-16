package com.gladitorio.game.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class GameController {
    @RequestMapping(value = "/", method = GET)
    public String gameView() {
        return "game-view";
    }
}
