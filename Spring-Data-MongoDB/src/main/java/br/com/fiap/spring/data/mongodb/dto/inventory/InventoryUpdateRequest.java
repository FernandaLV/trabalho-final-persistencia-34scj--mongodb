package br.com.fiap.spring.data.mongodb.dto.inventory;

public class InventoryUpdateRequest {

    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
