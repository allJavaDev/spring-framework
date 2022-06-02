package com.alljavadev.bootsrap;

import com.alljavadev.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class DataGenerator implements CommandLineRunner {


    private final AccountRepository accountRepository;
    private final CinemaRepository cinemaRepository;
    private final GenreRepository genreRepository;
    private final MovieCinemaRepository movieCinemaRepository;
    private final MovieRepository movieRepository;
    private final TicketRepository ticketRepository;
    private final UserRepository userRepository;

    public DataGenerator(AccountRepository accountRepository, CinemaRepository cinemaRepository, GenreRepository genreRepository, MovieCinemaRepository movieCinemaRepository, MovieRepository movieRepository, TicketRepository ticketRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.cinemaRepository = cinemaRepository;
        this.genreRepository = genreRepository;
        this.movieCinemaRepository = movieCinemaRepository;
        this.movieRepository = movieRepository;
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //--Genre Repository--
//        genreRepository.findByGenre("Drama").forEach(System.out::println);

//        accountRepository.findByCountryOrState("United States", "Kentucky").forEach(System.out::println);
//        accountRepository.findByAgeIsLessThanEqual(46).forEach(System.out::println);
       // accountRepository.findByRole("USER");
//        accountRepository.findByAgeBetween(26, 37).forEach(System.out::println);
       // accountRepository.findByAddressStartingWith("Log").forEach(System.out::println);
//accountRepository.findOrderByAgeDesc().forEach(System.out::println);

        System.out.println(accountRepository.getAccounts());
    }
}
