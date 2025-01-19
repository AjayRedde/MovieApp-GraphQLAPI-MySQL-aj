package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Review {
    private int id;
    private int movieId;
    private String username;
    private int rating;
    private String comment;
}
