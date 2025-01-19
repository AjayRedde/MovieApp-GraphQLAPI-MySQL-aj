package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.graphql.data.federation.EntityMapping;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
/*
@EntityMapping
*/
@Table("Customers")
public class Customer {
    @Id
    private int id;
    private String name;
    private Genre favGenre;
    private List<MovieSummary> watchList;
    private List<MovieSummary> recomanded;
}
