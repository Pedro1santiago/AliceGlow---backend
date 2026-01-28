package aliceGlow.example.aliceGlow.dto;

import aliceGlow.example.aliceGlow.domain.Product;
import aliceGlow.example.aliceGlow.domain.SaleItem;

import java.math.BigDecimal;

public record SaleItemDTO(Long id, Long saleId, Long productId, Integer quantity, BigDecimal unitPrice, BigDecimal subtotal) {

    public static SaleItemDTO toDTO(SaleItem saleItem) {
        return new SaleItemDTO(
                saleItem.getId(),
                saleItem.getSale().getId(),
                saleItem.getProduct().getId(),
                saleItem.getQuantity(),
                saleItem.getUnitPrice(),
                saleItem.getSubtotal()
        );
    }
}
