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
}
