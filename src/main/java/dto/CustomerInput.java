package dto;

import lombok.Data;

@Data
public class CustomerInput {
    private int id;
    private String name;
    private Genre favGenre;
}
