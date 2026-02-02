package aliceGlow.example.aliceGlow.repository;

import aliceGlow.example.aliceGlow.domain.Perfil;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {

    Optional<Perfil> findByName(String name);
}
