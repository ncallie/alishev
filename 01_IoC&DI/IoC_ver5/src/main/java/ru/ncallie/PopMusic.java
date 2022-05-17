package ru.ncallie;

public class PopMusic implements Music {
    private PopMusic() {
    }

    @Override
    public String getSong() {
        return "Taylor Swift - \"Shake it Off\"";
    }

    public static Music getPopMusic() {
        return new PopMusic();
    }
}
