package aliceGlow.example.aliceGlow.service;

import aliceGlow.example.aliceGlow.domain.Product;
import aliceGlow.example.aliceGlow.dto.product.CreateProductDTO;
import aliceGlow.example.aliceGlow.dto.product.ProductDTO;
import aliceGlow.example.aliceGlow.dto.product.UpdateProductDTO;
import aliceGlow.example.aliceGlow.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> listProducts(){
        return productRepository.findAll()
                .stream()
                .map(ProductDTO::toDTO)
                .toList();
    }

    public ProductDTO createProduct(CreateProductDTO createProductDTO){
        Product product = new Product();
        product.setName(createProductDTO.name());
        product.setPrice(createProductDTO.price());
        product.setStock(createProductDTO.stock());

        Product savedProduct = productRepository.save(product);

        return ProductDTO.toDTO(savedProduct);
    }

    public ProductDTO updateProduct(Long id, UpdateProductDTO updateProductDTO) {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (updateProductDTO.name() != null) {
            product.setName(updateProductDTO.name());
        }

        if (updateProductDTO.price() != null) {
            product.setPrice(updateProductDTO.price());
        }

        if (updateProductDTO.stock() != null) {
            if (updateProductDTO.stock() < 0) {
                throw new IllegalArgumentException("Stock cannot be negative");
            }
            product.setStock(updateProductDTO.stock());
        }

        Product updatedProduct = productRepository.save(product);

        return ProductDTO.toDTO(updatedProduct);
    }

    public void deleteProduct(Long id){
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        productRepository.delete(product);
    }
}
