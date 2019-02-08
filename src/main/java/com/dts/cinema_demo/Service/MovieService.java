package com.dts.cinema_demo.Service;

import com.dts.cinema_demo.Domain.Request.MoviesMapMoviesTheater;
import com.dts.cinema_demo.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<MoviesMapMoviesTheater> find(){
        return movieRepository.find();
    }

}
