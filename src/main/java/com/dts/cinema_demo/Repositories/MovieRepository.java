package com.dts.cinema_demo.Repositories;

import com.dts.cinema_demo.Domain.Request.MoviesMapMoviesTheater;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import java.util.List;

@Repository
public class MovieRepository extends BaseReponsitory {
    public List<MoviesMapMoviesTheater> find(){
        List<MoviesMapMoviesTheater> movie= null;
        String sql = "select * from team2_movies inner join team2_screening on team2_movies.id_movie=team2_screening.id_movie";
        Query query = entityManager.createNativeQuery(sql, "MoviesMapMoviesTheater");
        movie = query.getResultList();
        return movie;
    }
}
