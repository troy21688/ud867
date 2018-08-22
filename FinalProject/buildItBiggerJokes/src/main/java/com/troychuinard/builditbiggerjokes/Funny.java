package com.troychuinard.builditbiggerjokes;

import java.util.ArrayList;
import java.util.Random;

public class Funny {

    ArrayList<String> jokes;
    private Random random;

    //TODO: Please note implementation from StackOverflow post:
    //TODO: https://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist
    public Funny(){
        random = new Random();
        jokes = new ArrayList<String>(){{
            add("Test Joke 1");
            add("Test Joke 2");
            add("Test Joke 3");
        }};
    }

    public String getTestJoke(){
        return "HAHAHA";
    }

    public String getRandomJoke(){
        int index = random.nextInt(jokes.size());
        String x = jokes.get(index);
        return x;
    }
}
