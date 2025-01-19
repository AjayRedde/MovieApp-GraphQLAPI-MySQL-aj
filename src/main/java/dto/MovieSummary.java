package dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MovieSummary extends Movie {
    public MovieSummary(int id, String title, int releaseYear, int rating, Genre genre) {
        super(id, title, releaseYear, rating, genre);
    }
}
