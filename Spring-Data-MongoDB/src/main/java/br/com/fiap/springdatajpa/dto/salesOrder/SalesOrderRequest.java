package br.com.fiap.springdatajpa.dto.salesOrder;

import javax.validation.constraints.NotNull;
import java.util.List;

public class SalesOrderRequest {
    @NotNull
    private String customerId;

    @NotNull
    private List<ProductDTO> itens;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<ProductDTO> getItens() {
        return itens;
    }

    public void setItens(List<ProductDTO> itens) {
        this.itens = itens;
    }
}