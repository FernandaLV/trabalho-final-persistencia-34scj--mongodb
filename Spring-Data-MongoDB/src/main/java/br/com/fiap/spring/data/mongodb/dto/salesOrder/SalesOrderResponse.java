package br.com.fiap.spring.data.mongodb.dto.salesOrder;

import java.util.List;

public class SalesOrderResponse {
    private String id;
    private String customerId;
    private String status;
    private List<ProductDTO> itens;

    public SalesOrderResponse(String id, String customerId, String status, List<ProductDTO> itens) {
        this.id = id;
        this.customerId = customerId;
        this.status = status;
        this.itens = itens;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ProductDTO> getItens() {
        return itens;
    }

    public void setItens(List<ProductDTO> itens) {
        this.itens = itens;
    }
}
