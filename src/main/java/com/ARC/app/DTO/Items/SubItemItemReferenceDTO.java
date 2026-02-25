package com.ARC.app.DTO.Items;

public class SubItemItemReferenceDTO {
    private Integer quantity;
    private SubItemBaseDTO item;

    public SubItemItemReferenceDTO() {}
    public SubItemItemReferenceDTO(Integer quantity, SubItemBaseDTO item) {
        this.quantity = quantity;
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public SubItemBaseDTO getItem() {
        return item;
    }

    public void setItem(SubItemBaseDTO item) {
        this.item = item;
    }
}
