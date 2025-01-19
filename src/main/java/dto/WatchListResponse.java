package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class WatchListResponse {
    private Status status;
    private List<MovieSummary> watchList;
}
