package ru.ncallie;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("popMusic")
public class PopMusic implements Music {
    private Random random = new Random();
    private List<String> songs = Arrays.asList("PopMusic1", "PopMusic2", "PopMusic3");
    @Override
    public String getSong() {
        return songs.get(random.nextInt(3));
    }
}
