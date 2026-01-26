package aliceGlow.example.aliceGlow.dto;

import aliceGlow.example.aliceGlow.domain.Sale;
import aliceGlow.example.aliceGlow.domain.SaleItem;

import java.time.LocalDateTime;
import java.util.List;

public record SaleDTO(Long id, LocalDateTime date, String client, Double total, List<SaleItem> saleItems) {

    public static SaleDTO toDTO(Sale sale){
        return new SaleDTO(sale.getId(), sale.getDate(), sale.getClient(), sale.getTotal(), sale.getItems());
    }

    public Sale fromDTO(){
        Sale sale = new Sale();
        sale.setId(this.id);
        sale.setDate(this.date);
        sale.setClient(this.client);
        sale.setTotal(this.total);
        sale.setItems(this.saleItems);

        return sale;
    }
}
