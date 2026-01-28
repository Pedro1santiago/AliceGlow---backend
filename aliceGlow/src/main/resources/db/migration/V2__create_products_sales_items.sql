CREATE TABLE products (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(120) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    stock INTEGER NOT NULL
);

CREATE TABLE sales (
    id BIGSERIAL PRIMARY KEY,
    created_at TIMESTAMP NOT NULL,
    client VARCHAR(120),
    total DECIMAL(10,2) NOT NULL
);

CREATE TABLE sale_items (
    id BIGSERIAL PRIMARY KEY,
    sale_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    quantity INTEGER NOT NULL,
    unit_price DECIMAL(10,2) NOT NULL,
    subtotal DECIMAL(10,2) NOT NULL,

    CONSTRAINT fk_sale_items_sale
        FOREIGN KEY (sale_id)
        REFERENCES sales(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_sale_items_product
        FOREIGN KEY (product_id)
        REFERENCES products(id)
        ON DELETE RESTRICT
);
