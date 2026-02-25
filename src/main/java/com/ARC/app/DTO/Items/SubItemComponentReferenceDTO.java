package com.ARC.app.DTO.Items;

public class SubItemComponentReferenceDTO {
    private Integer quantity;
    private SubItemBaseDTO component;

    public SubItemComponentReferenceDTO(){}
    public SubItemComponentReferenceDTO(Integer quantity, SubItemBaseDTO component) {
        this.quantity = quantity;
        this.component = component;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public SubItemBaseDTO getComponent() {
        return component;
    }

    public void setComponent(SubItemBaseDTO component) {
        this.component = component;
    }
}
