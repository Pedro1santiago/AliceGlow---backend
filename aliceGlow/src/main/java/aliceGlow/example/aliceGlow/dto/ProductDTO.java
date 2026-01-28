package aliceGlow.example.aliceGlow.dto;

import aliceGlow.example.aliceGlow.domain.Product;

import java.math.BigDecimal;

public record ProductDTO(Long id, String name, BigDecimal price, Integer stock) {

    public static ProductDTO toDTO(Product product){
        return new ProductDTO(product.getId(), product.getName(), product.getPrice(), product.getStock());
    }

}
