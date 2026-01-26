package aliceGlow.example.aliceGlow.repository;

import aliceGlow.example.aliceGlow.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
