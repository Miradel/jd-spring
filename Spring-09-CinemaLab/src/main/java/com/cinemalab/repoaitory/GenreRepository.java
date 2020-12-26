package com.cinemalab.repoaitory;

import com.cinemalab.entity.Genre;
import com.cinemalab.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {
}
