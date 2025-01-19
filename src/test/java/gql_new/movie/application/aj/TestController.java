package gql_new.movie.application.aj;

import dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/customer")
    public Mono<Customer> getCustomer() {
        return Mono.just(new Customer());
    }
}
