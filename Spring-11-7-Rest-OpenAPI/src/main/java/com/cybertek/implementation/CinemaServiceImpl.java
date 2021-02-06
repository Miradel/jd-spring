package com.cybertek.implementation;

import com.cybertek.entity.Cinema;
import com.cybertek.repoaitory.CinemaRepository;
import com.cybertek.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;


    @Override
    public List<Cinema> createCinema(Cinema cinema) {
        cinemaRepository.save(cinema);
        return cinemaRepository.findAll();
    }

    @Override
    public Cinema getCinema(Long id) {
        return cinemaRepository.findById(id).get();
    }

    @Override
    public List<Cinema> getAllCinema() {
        return cinemaRepository.findAll();
    }

    @Override
    public List<Cinema> delete(Long id) throws Exception {

        Integer countGenres = cinemaRepository.countCinemaNativeQuery(id);
        if (countGenres > 0) {
            throw new Exception("Genre can't be deleted, is linked by a movie");
        }
        cinemaRepository.deleteById(id);
        return cinemaRepository.findAll();
    }

    @Override
    public List<Cinema> updateCinema(Long id, Cinema cinema) {

        Cinema obj = cinemaRepository.findById(id).get();
        obj.setName(cinema.getName());
        cinemaRepository.save(obj);

        return cinemaRepository.findAll();
    }
}
