package sda.TestingAdvancedZDJAVApol135.testing.spring.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }

    public void addUser(User user){
        userRepository.addUser(user);
    }
}
