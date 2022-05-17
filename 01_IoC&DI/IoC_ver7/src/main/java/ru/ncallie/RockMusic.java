package ru.ncallie;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    private Random random = new Random();
    private List<String> songs = Arrays.asList("RockMusic1", "RockMusic2", "RockMusic3");
    @Override
    public String getSong() {
        return songs.get(random.nextInt(3));
    }
}
