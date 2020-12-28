package com.cinemalab;

import com.cinemalab.repoaitory.AccountRepository;
import com.cinemalab.repoaitory.MovieCinemaRepository;
import com.cinemalab.repoaitory.MovieRepository;
import com.cinemalab.repoaitory.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Arrays;

@SpringBootApplication
public class CinemalabApplication {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	MovieCinemaRepository movieCinemaRepository;

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	TicketRepository ticketRepository;
	public static void main(String[] args) {
		SpringApplication.run(CinemalabApplication.class, args);
	}

	@PostConstruct
	public void testAccount(){
		System.out.println(accountRepository.findByOrderByAgeDesc());
		System.out.println("-----------------------------------------");

		System.out.println(movieCinemaRepository.findAllByMovieNameContaining("The"));
		System.out.println(movieCinemaRepository.findAllByCinemaLocationName("AMC Empire 25"));

		System.out.println(movieRepository.fetchAllBetweenPricesRange(BigDecimal.valueOf(25),BigDecimal.valueOf(50)));
		System.out.println(movieRepository.findAllByPriceBetween(BigDecimal.valueOf(25),BigDecimal.valueOf(50)));

		System.out.println(movieRepository.retrieveByDurationInRange(Arrays.asList(150,130)));
		System.out.println(ticketRepository.retrieveAllDistinctMovieNames());
		System.out.println(ticketRepository.retrieveAllBySearchCriteria("it"));

	}

}
