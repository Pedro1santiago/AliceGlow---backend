package aliceGlow.example.aliceGlow.repository;

import aliceGlow.example.aliceGlow.domain.Perfil;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
