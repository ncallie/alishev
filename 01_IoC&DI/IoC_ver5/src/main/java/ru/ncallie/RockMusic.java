package ru.ncallie;

public class RockMusic implements Music {
    private RockMusic() {
    }

    @Override
    public String getSong() {
        return "Scorpions - \"Rock You Like a Hurricane\"";
    }

    public static Music getRockMusic() {
        return new RockMusic();
    }
}
