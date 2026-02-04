package aliceGlow.example.aliceGlow.dto.sale;

import aliceGlow.example.aliceGlow.dto.saleItem.SaleItemDTO;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record CreateSaleDTO(

        @NotBlank
        String client,

        @NotNull
        List<SaleItemDTO> saleItems
) {}
