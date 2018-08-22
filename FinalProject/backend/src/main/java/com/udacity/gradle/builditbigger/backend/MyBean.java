package com.udacity.gradle.builditbigger.backend;

import com.troychuinard.builditbiggerjokes.Funny;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    public String myData;

    public String getData() {
        myData = new Funny().getRandomJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}