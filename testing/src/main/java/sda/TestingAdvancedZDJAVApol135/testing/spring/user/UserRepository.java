package sda.TestingAdvancedZDJAVApol135.testing.spring.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final IUserRepository iUserRepository;

    public List<User> findAllUsers() {
        return iUserRepository.findAll();
    }

    public void addUser(User user){
        iUserRepository.save(user);
    }
}
