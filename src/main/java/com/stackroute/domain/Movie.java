package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie
{
    private String movieName;
    private String director;
    private Actor actor1;

    public Movie() { }
    @Autowired
    public Movie(String movieName, String director, Actor actor1) {
        this.movieName = movieName;
        this.director = director;
        this.actor1 = actor1;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", actor=" + actor1 +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor) {
        this.actor1 = actor;
    }
}
