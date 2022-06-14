package com.ahmad;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author Bashir Ahmad
 */

class Movie{
    String name;
    String hero;
    String heroine;

    public Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }
}

public class MovieInformationShow {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        populate(list);
        
        Consumer<Movie> c= m->{ 
            System.out.println("Movie Name:"+m.name);
            System.out.println("Movie Hero:"+m.hero);
            System.out.println("Movie Heroine:"+m.heroine);
            System.out.println();
        };
        for(Movie m : list){
            c.accept(m);
        }
    }

    private static void populate(ArrayList<Movie> list) {
        list.add(new Movie("Bahubali","Prabhas","Anushka"));
        list.add(new Movie("Rayees","Sharukh","Sunny")); 
        list.add(new Movie("Dangal","Ameer","Ritu")); 
        list.add(new Movie("Sultan","Salman","Anushka"));
    }
}
