package br.com.fiap.springdatajpa.dto.category;

public class CategoryDTO {
    private String id;

    public CategoryDTO() {
    }

    public CategoryDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
