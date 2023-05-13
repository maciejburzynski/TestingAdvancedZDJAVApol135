package sda.TestingAdvancedZDJAVApol135.testing.spring.user;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping(path = "/api/users")
    List<User> findAllUsers(){
        return userService.findAllUsers();
    }

}
