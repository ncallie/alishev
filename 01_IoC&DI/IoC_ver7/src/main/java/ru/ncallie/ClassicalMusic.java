package ru.ncallie;

import org.springframework.stereotype.Component;

import java.util.*;

@Component("classicalMusic")
public class ClassicalMusic implements Music{
    private Random random = new Random();
    private List<String> songs = Arrays.asList("ClassicalSong1", "ClassicalSong2", "ClassicalSong3");

    @Override
    public String getSong() {
        return songs.get(random.nextInt(3));
    }

}
