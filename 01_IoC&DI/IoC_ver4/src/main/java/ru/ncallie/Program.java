package ru.ncallie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.PlayAllMusic();
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.setVolume(100);
        System.out.println("Player1: " + musicPlayer.getVolume());
        System.out.println("Player1: " + musicPlayer1.getVolume());
        context.close();
    }
}
