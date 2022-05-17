package ru.ncallie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Name player: " + musicPlayer.getName());
        System.out.println("Volume player: " + musicPlayer.getVolume());
        musicPlayer.playMusic(MusicPlayer.Genre.POP);
        context.close();
    }
}
