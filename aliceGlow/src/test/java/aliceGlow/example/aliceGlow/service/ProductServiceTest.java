package aliceGlow.example.aliceGlow.service;

import aliceGlow.example.aliceGlow.domain.Product;
import aliceGlow.example.aliceGlow.dto.product.CreateProductDTO;
import aliceGlow.example.aliceGlow.dto.product.ProductDTO;
import aliceGlow.example.aliceGlow.dto.product.UpdateProductDTO;
import aliceGlow.example.aliceGlow.dto.user.UserDTO;
import aliceGlow.example.aliceGlow.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService  productService;

    @Test
    void shouldCreateProductSuccessfully(){
        CreateProductDTO dto = new CreateProductDTO(
                "Mouser Gamer",
                new BigDecimal("120.00"),
                10);

        Product productSaved = new Product();

        productSaved.setId(1L);
        productSaved.setName("Mouser Gamer");
        productSaved.setCostPrice(new BigDecimal("120.00"));
        productSaved.setStock(10);

        when(productRepository.save(any(Product.class)))
                .thenReturn(productSaved);

        ProductDTO result = productService.createProduct(dto);

        assertNotNull(result);
        assertEquals("Mouser Gamer", result.name());
        assertEquals(new BigDecimal("120.00"), result.costPrice());
        assertEquals(10, result.stock());

        verify(productRepository).save(any(Product.class));

    }

    @Test
    void shouldUpdateProductSuccessfully(){

        Long productId = 1L;

        UpdateProductDTO dto = new UpdateProductDTO(
                "Mouse",
                new BigDecimal("130.00"),
                25
        );

        Product existingProduct = new Product();

        existingProduct.setId(productId);
        existingProduct.setName("Old Mouser Gamer");
        existingProduct.setCostPrice(new BigDecimal("120.00"));
        existingProduct.setStock(10);

        Product updateProduct = new Product();

        updateProduct.setId(productId);
        updateProduct.setName("Mouse");
        updateProduct.setCostPrice(new BigDecimal("130.00"));
        updateProduct.setStock(20);

        when(productRepository.findById(productId))
                .thenReturn(Optional.of(existingProduct));
        when(productRepository.save(any(Product.class)))
                .thenReturn(updateProduct);

        ProductDTO result = productService.updateProduct(productId, dto);

        assertNotNull(result);
        assertEquals("Mouse", result.name());
        assertEquals(new BigDecimal("130.00"), result.costPrice());
        assertEquals(20, result.stock());

        verify(productRepository).findById(productId);
        verify(productRepository).save(any(Product.class));
    }






}