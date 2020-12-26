package com.cinemalab.repoaitory;

import com.cinemalab.entity.Movie;
import com.cinemalab.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCinemaRepository extends JpaRepository<MovieCinema,Long> {
}
