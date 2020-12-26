package com.cinemalab.repoaitory;

import com.cinemalab.entity.Cinema;
import com.cinemalab.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
