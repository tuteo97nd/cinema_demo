package com.dts.cinema_demo.Controller;

import com.dts.cinema_demo.Domain.Request.MoviesMapMoviesTheater;
import com.dts.cinema_demo.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Movie")
public class Control {
    @Autowired
    private MovieService movieService;
    @GetMapping("/find")
    public List<MoviesMapMoviesTheater> getfile(){
        return movieService.find();
    }
}
