package br.com.fiap.spring.data.mongodb.dto.inventory;

import javax.validation.constraints.NotNull;

public class InventoryUpdateRequest {
    @NotNull
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
