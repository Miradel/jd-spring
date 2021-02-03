package com.cybertek.repoaitory;

import com.cybertek.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that return all genres

    @Query("SELECT g from Genre g")
    List<Genre> getAllGeneres();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns genres by containing name
    @Query(value = "SELECT * from Genre where name ILIKE concat ('%',?1, '%' )",nativeQuery = true )
    List<Genre> getGenreByNameContaining(String pattern);


    @Query(value = "SELECT count(*) from genre g JOIN movie_genre_rel mgr on g.id = mgr.genre_id WHERE g.id = ?1", nativeQuery = true)
    Integer countGenresNativeQuery(Long id);

}
