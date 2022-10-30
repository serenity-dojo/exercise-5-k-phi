package com.serenitydojo;

public class Hamster extends Pet {
    private final String favoriteGame;
    public Hamster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }
}
