package io.github.nilsonsasaki.domain.entity;

import java.math.BigDecimal;

public class Product {

    private Integer id;
    private String description;
    private BigDecimal productValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getProductValue() {
        return productValue;
    }

    public void setProductValue(BigDecimal productValue) {
        this.productValue = productValue;
    }
}
