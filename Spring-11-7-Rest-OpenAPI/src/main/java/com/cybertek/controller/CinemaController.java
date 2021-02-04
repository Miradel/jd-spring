package com.cybertek.controller;

import com.cybertek.entity.Cinema;
import com.cybertek.repoaitory.CinemaRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cinema")
@Tag(name = "Cinema",description = "Cinema API")
public class CinemaController {

    @Autowired
    private CinemaRepository cinemaRepository;

    @GetMapping
    @Operation(summary = "Read all Cinemas")
    public List<Cinema> readAllCinema(){

        return cinemaRepository.findAll();
    }
}
