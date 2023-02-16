package io.github.nilsonsasaki.domain.entity;

public class OrderItem {

    private Integer id;
    private ClientOrder orderId;
    private Product productId;
    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClientOrder getOrderId() {
        return orderId;
    }

    public void setOrderId(ClientOrder orderId) {
        this.orderId = orderId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
