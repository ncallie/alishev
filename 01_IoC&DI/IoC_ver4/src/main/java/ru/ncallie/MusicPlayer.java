package ru.ncallie;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public void PlayAllMusic() {
        for (Music song : musicList) {
            System.out.println("Playing: " + song.getSong());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void turnOn() {
        System.out.println("The player starts...");
    }
    public void turnOff() {
        System.out.println("Player turns off...");
    }
}
