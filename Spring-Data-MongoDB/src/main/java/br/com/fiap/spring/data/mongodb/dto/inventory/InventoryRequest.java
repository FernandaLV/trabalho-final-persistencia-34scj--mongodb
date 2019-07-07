package br.com.fiap.spring.data.mongodb.dto.inventory;

import javax.validation.constraints.NotNull;

public class InventoryRequest {

    @NotNull
    private String productId;

    @NotNull
    private Integer amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
