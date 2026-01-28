package aliceGlow.example.aliceGlow.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;


@Entity
@Table(name = "sale_item")
public class SaleItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id")
    private Product product;

    @NotNull
    @Min(0)
    private Integer quantity;

    @NotNull
    @DecimalMin("0.00")
    private BigDecimal unitPrice;

    @NotNull
    @DecimalMin("0.00")
    private BigDecimal subtotal;

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public Sale getSale(){return sale;}
    public void setSale(Sale sale){this.sale = sale;}

    public Product getProduct(){return product;}
    public void setProduct(Product product){this.product = product;}

    public Integer getQuantity(){return quantity;}
    public void setQuantity(Integer quantity){this.quantity = quantity;}

    public BigDecimal getUnitPrice(){return unitPrice;}
    public void setUnitPrice(BigDecimal unitPrice){this.unitPrice = unitPrice;}

    public BigDecimal getSubtotal(){return subtotal;}
    public void setSubtotal(BigDecimal subtotal){this.subtotal = subtotal;}
}
