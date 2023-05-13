package sda.TestingAdvancedZDJAVApol135.testing.spring.user;


import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
