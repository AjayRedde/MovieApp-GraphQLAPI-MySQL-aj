package dto;

import lombok.Data;

@Data
public class WatchListInput {
    private int customerId;
    private int movieId;
}
