package aliceGlow.example.aliceGlow.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime createdAt;

    @NotBlank
    private String client;

    @NotNull
    @Min(0)
    private BigDecimal total;

    @NotNull
    @OneToMany(mappedBy = "sale")
    private List<SaleItem> items;

    public Long getId() {return id;}
    public void setId(Long id){this.id = id;}

    public LocalDateTime getCreatedAt(){return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt){this.createdAt = createdAt;}

    public String getClient(){return client;}
    public void setClient(String client){this.client = client;}

    public BigDecimal getTotal(){return total;}
    public void setTotal(BigDecimal total){this.total = total;}

    public List<SaleItem> getItems(){return items;}
    public void setItems(List<SaleItem> items){this.items = items;}
}