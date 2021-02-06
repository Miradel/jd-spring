package com.cybertek.controller;

import com.cybertek.entity.Cinema;
import com.cybertek.entity.Genre;
import com.cybertek.repoaitory.CinemaRepository;
import com.cybertek.service.CinemaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinema")
@Tag(name = "Cinema",description = "Cinema API")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    @Operation(summary = "Read all Cinemas")
    public List<Cinema> readAllCinema(){
        return cinemaService.getAllCinema();
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete Cinema by Id")
    public void deleteCinema(@PathVariable("id") Long cinemaId) throws Exception {

        cinemaService.delete(cinemaId);
    }


    @PostMapping("/create")
    @Operation( summary = "Create_Cinema")
    public List<Cinema> createCinema(@RequestBody Cinema cinema){
       return cinemaService.createCinema(cinema);
    }


    @PutMapping("/update/{id}")
    @Operation(summary = "update the cinema")
    public List<Cinema> updateCinema(@PathVariable("id")Long id, Cinema cinema){

        return cinemaService.updateCinema(id,cinema);

    }


}
