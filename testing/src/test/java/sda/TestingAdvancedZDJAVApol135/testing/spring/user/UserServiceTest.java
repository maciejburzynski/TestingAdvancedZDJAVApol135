package sda.TestingAdvancedZDJAVApol135.testing.spring.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @Test
    void WhenUserRepositoryReturnListOfTwoUsersThenUserServiceReturnsTheSameList(){
//        given
        User user1 = new User("Maciej", 29);
        User user2 = new User("Andrzej", 59);

//     when -----Mocking below------
        Mockito.when(userRepository.findAllUsers())
                .thenReturn(List.of(user1, user2));
        List<User> testedUsers = userService.findAllUsers();

//        then
        Assertions.assertEquals(List.of(user1, user2), testedUsers);
    }

}