package sda.TestingAdvancedZDJAVApol135.testing.spring.user;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class UserDataInitializer {

    private final UserService userService;

    @PostConstruct
    public void addUsers() {
        User user = new User("Maciej", 29);
//        User user1 = new User("Andrzej", 35);
//
//        userService.addUser(user);
    }
}
