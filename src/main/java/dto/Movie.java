package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Movie {
        private int id;
        private String title;
        private int releaseYear;
        private int rating;
        private Genre genre;
}
