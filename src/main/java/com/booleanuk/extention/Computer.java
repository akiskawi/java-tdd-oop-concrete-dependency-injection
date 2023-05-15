package com.booleanuk.extention;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
        this.psu = psu;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        if (installedGames.contains(game)) {
            return game.start();
        }

        return "Game not installed";
    }
}
