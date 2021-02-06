package com.cybertek.service;

import com.cybertek.entity.Cinema;

import java.util.List;

public interface CinemaService {

    List<Cinema> createCinema(Cinema cinema);
    Cinema getCinema(Long id);
    List<Cinema> getAllCinema();
    List<Cinema> delete(Long id) throws Exception;
    List<Cinema> updateCinema(Long id, Cinema cinema);

}
