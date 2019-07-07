package br.com.fiap.spring.data.mongodb.dto.inventory;

public class InventoryResponse {

    private String productId;
    private Integer amount;

    public InventoryResponse(String productId, Integer amount) {
        this.productId = productId;
        this.amount = amount;
    }

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
