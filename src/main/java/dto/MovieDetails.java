package dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class MovieDetails extends Movie {
    private List<Review> reviews;

    public MovieDetails(int id, String title, int releaseYear, int rating, Genre genre, List<Review> reviews) {
        super(id, title, releaseYear, rating, genre);
        this.reviews = reviews;
    }
}
