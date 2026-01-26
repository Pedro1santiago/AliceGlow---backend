package aliceGlow.example.aliceGlow.repository;

import aliceGlow.example.aliceGlow.domain.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleItemRepository extends JpaRepository<SaleItem, Long> {
}
