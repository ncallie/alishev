package ru.ncallie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component("musicPlayer")

public class MusicPlayer {
    RockMusic rockMusic;
    ClassicalMusic classicalMusic;
    PopMusic popMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired()
    public MusicPlayer(@Qualifier("rockMusic")RockMusic rockMusic,
                       @Qualifier("classicalMusic")ClassicalMusic classicalMusic,
                       @Qualifier("popMusic")PopMusic popMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
    }

    public void playMusic(Genre type) {
        switch (type) {
            case POP:
                System.out.println(popMusic.getSong());
                break;
            case ROCK:
                System.out.println(rockMusic.getSong());
                break;
            case CLASSICAL:
                System.out.println(classicalMusic.getSong());
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    public enum Genre {
        ROCK,
        CLASSICAL,
        POP
    }
}
