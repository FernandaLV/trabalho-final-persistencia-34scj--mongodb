package br.com.fiap.spring.data.mongodb.dto.customer;

public class PhoneDTO {
    public PhoneDTO() {
    }

    public PhoneDTO(String number) {
        this.number = number;
    }

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
