package aliceGlow.example.aliceGlow.dto;

import aliceGlow.example.aliceGlow.domain.Product;

public record ProductDTO(Long id, String name, Double price, Long stock) {

    public static ProductDTO toDTO(Product product){
        return new ProductDTO(product.getId(), product.getName(), product.getPrice(), product.getStock());
    }

    public Product fromDTO(){
        Product produto = new Product();
        produto.setId(this.id);
        produto.setName(this.name);
        produto.setPrice(this.price);
        produto.setStock(this.stock);
        return produto;
    }
}
