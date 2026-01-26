package aliceGlow.example.aliceGlow.repository;

import aliceGlow.example.aliceGlow.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
