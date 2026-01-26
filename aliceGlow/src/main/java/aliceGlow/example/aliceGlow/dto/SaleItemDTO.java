package aliceGlow.example.aliceGlow.dto;

import aliceGlow.example.aliceGlow.domain.Product;
import aliceGlow.example.aliceGlow.domain.SaleItem;

public record SaleItemDTO(Long id, Long saleItem, Product product, Integer quantity, Double unitPrice, Double subtotal) {

    public static SaleItemDTO toDTO(SaleItem saleItem){
        return new SaleItemDTO(saleItem.getSaleId(), saleItem.getSaleId(), saleItem.getProduct(), saleItem.getQuantity(), saleItem.getUnitPrice(), saleItem.getSubtotal());

    }

    public SaleItem fromDTO(){
        SaleItem saleItem = new SaleItem();
        saleItem.setId(this.id);
        saleItem.setSaleId(this.id);
        saleItem.setProduct(this.product);
        saleItem.setQuantity(this.quantity);
        saleItem.setUnitPrice(this.unitPrice);
        saleItem.setSubtotal(this.subtotal);

        return saleItem;
    }
}
