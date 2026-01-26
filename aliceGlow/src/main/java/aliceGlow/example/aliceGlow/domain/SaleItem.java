package aliceGlow.example.aliceGlow.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "sale_item")
public class SaleItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "sale_id")
    private Long saleId;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id")
    private Product product;

    @NotNull
    @Min(0)
    private Integer quantity;

    @NotNull
    @DecimalMin("0.00")
    private Double unitPrice;

    @NotNull
    @DecimalMin("0.00")
    private Double subtotal;

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public Long getSaleId(){return saleId;}
    public void setSaleId(Long saleId){this.saleId = saleId;}

    public Product getProduct(){return product;}
    public void setProduct(Product product){this.product = product;}

    public Integer getQuantity(){return quantity;}
    public void setQuantity(Integer quantity){this.quantity = quantity;}

    public Double getUnitPrice(){return unitPrice;}
    public void setUnitPrice(Double unitPrice){this.unitPrice = unitPrice;}

    public Double getSubtotal(){return subtotal;}
    public void setSubtotal(Double subtotal){this.subtotal = subtotal;}
}
