package client;

import dto.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Fetch a user profile by ID
    public Mono<Customer> getUserProfile(int id) {
        return userRepository.findById(id)
                .switchIfEmpty(Mono.error(new RuntimeException("Customer not found")));
    }

    // Save or update a customer
    public Mono<Customer> updateProfile(Customer customer) {
        return userRepository.save(customer);
    }
}
