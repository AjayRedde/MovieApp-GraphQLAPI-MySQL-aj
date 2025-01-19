package client;

import dto.MovieDetails;
import dto.Review;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final ReviewRepository reviewRepository;

    public MovieService(MovieRepository movieRepository, ReviewRepository reviewRepository) {
        this.movieRepository = movieRepository;
        this.reviewRepository = reviewRepository;
    }

    public Mono<MovieDetails> getMovieDetails(int id) {
        return movieRepository.findById(id)
                .flatMap(movie -> reviewRepository.findByMovieId(id)
                        .collectList()
                        .map(reviews -> new MovieDetails(
                                movie.getId(),
                                movie.getTitle(),
                                movie.getReleaseYear(),
                                movie.getRating(),
                                movie.getGenre(),
                                reviews
                        ))
                );
    }
}
