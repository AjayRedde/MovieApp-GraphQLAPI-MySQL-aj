package a_controller;

import client.UserService;
import dto.Customer;
import dto.CustomerInput;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class GraphQLController {

    private final UserService userService;

    public GraphQLController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    public Mono<Customer> userProfile(int id) {
        return userService.getUserProfile(id);
    }

    @MutationMapping
    public Mono<Customer> updateProfile(CustomerInput input) {
        Customer customer = new Customer();
        customer.setId(input.getId());
        customer.setName(input.getName());
        customer.setFavGenre(input.getFavGenre());
        return userService.updateProfile(customer);
    }
}
