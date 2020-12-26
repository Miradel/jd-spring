package com.cinemalab.repoaitory;

import com.cinemalab.entity.Movie;
import com.cinemalab.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
