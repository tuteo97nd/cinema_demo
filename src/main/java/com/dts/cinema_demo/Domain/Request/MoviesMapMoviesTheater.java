package com.dts.cinema_demo.Domain.Request;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class MoviesMapMoviesTheater {
    private String id_movie;
    private String name_movie;
    private String description_movie;
    private String trailer;
    private String id_actor;
    private String id_director;
    private String id_category;
    private String age_watch;
    private Timestamp date_start;
    private int duration;
    private String language;
    private String id_screen;
    private String id_room;
    private Timestamp screening_start;

    public MoviesMapMoviesTheater() {
    }

    public MoviesMapMoviesTheater(String id_movie, String name_movie, String description_movie, String trailer, String id_actor, String id_director, String id_category, String age_watch, Timestamp date_start, int duration, String language, String id_screen, String id_room, Timestamp screening_start) {
        this.id_movie = id_movie;
        this.name_movie = name_movie;
        this.description_movie = description_movie;
        this.trailer = trailer;
        this.id_actor = id_actor;
        this.id_director = id_director;
        this.id_category = id_category;
        this.age_watch = age_watch;
        this.date_start = date_start;
        this.duration = duration;
        this.language = language;
        this.id_screen = id_screen;
        this.id_room = id_room;
        this.screening_start = screening_start;
    }

    public String getId_movie() {
        return id_movie;
    }

    public void setId_movie(String id_movie) {
        this.id_movie = id_movie;
    }

    public String getName_movie() {
        return name_movie;
    }

    public void setName_movie(String name_movie) {
        this.name_movie = name_movie;
    }

    public String getDescription_movie() {
        return description_movie;
    }

    public void setDescription_movie(String description_movie) {
        this.description_movie = description_movie;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getId_actor() {
        return id_actor;
    }

    public void setId_actor(String id_actor) {
        this.id_actor = id_actor;
    }

    public String getId_director() {
        return id_director;
    }

    public void setId_director(String id_director) {
        this.id_director = id_director;
    }

    public String getId_category() {
        return id_category;
    }

    public void setId_category(String id_category) {
        this.id_category = id_category;
    }

    public String getAge_watch() {
        return age_watch;
    }

    public void setAge_watch(String age_watch) {
        this.age_watch = age_watch;
    }

    public Timestamp getDate_start() {
        return date_start;
    }

    public void setDate_start(Timestamp date_start) {
        this.date_start = date_start;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getId_screen() {
        return id_screen;
    }

    public void setId_screen(String id_screen) {
        this.id_screen = id_screen;
    }

    public String getId_room() {
        return id_room;
    }

    public void setId_room(String id_room) {
        this.id_room = id_room;
    }

    public Timestamp getScreening_start() {
        return screening_start;
    }

    public void setScreening_start(Timestamp screening_start) {
        this.screening_start = screening_start;
    }

    @Override
    public String toString() {
        return "MoviesMapMoviesTheater{" +
                "id_movie='" + id_movie + '\'' +
                ", name_movie='" + name_movie + '\'' +
                ", description_movie='" + description_movie + '\'' +
                ", trailer='" + trailer + '\'' +
                ", id_actor='" + id_actor + '\'' +
                ", id_director='" + id_director + '\'' +
                ", id_category='" + id_category + '\'' +
                ", age_watch='" + age_watch + '\'' +
                ", date_start=" + date_start +
                ", duration=" + duration +
                ", language='" + language + '\'' +
                ", id_screen='" + id_screen + '\'' +
                ", id_room='" + id_room + '\'' +
                ", screening_start=" + screening_start +
                '}';
    }
}
