package aliceGlow.example.aliceGlow.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDateTime date;

    @NotBlank
    private String client;

    @NotNull
    @Min(0)
    private Double total;

    @NotNull
    @NotBlank
    private List<SaleItem> items;

    public Long getId() {return id;}
    public void setId(Long id){this.id = id;}

    public LocalDateTime getDate(){return date;}
    public void setDate(LocalDateTime date){this.date = date;}

    public String getClient(){return client;}
    public void setClient(String client){this.client = client;}

    public Double getTotal(){return total;}
    public void setTotal(Double total){this.total = total;}

    public List<SaleItem> getItems(){return items;}
    public void setItems(List<SaleItem> items){this.items = items;}
}