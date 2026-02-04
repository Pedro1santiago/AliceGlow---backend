package aliceGlow.example.aliceGlow.dto.sale;

import aliceGlow.example.aliceGlow.domain.Sale;
import aliceGlow.example.aliceGlow.dto.saleItem.SaleItemDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record SaleDTO(
        Long id,
        LocalDateTime createdAt,
        String client,
        BigDecimal total,
        List<SaleItemDTO>
        saleItems) {

    public static SaleDTO toDTO(Sale sale){
        return new SaleDTO(sale.getId(), sale.getCreatedAt(), sale.getClient(), sale.getTotal(), sale.getItems().stream().map(SaleItemDTO::toDTO).toList());
    }
}
