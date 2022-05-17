package ru.ncallie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Name player: " + musicPlayer.getName());
        System.out.println("Volume player: " + musicPlayer.getVolume());
        musicPlayer.playMusic(MusicPlayer.Genre.POP);
        context.close();
    }
}
