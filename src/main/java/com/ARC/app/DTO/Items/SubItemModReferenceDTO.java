package com.ARC.app.DTO.Items;

public class SubItemModReferenceDTO {
    private SubItemBaseDTO mod;

    public SubItemModReferenceDTO(){}
    public SubItemModReferenceDTO(SubItemBaseDTO mod) {
        this.mod = mod;
    }

    public SubItemBaseDTO getMod() {
        return mod;
    }

    public void setMod(SubItemBaseDTO mod) {
        this.mod = mod;
    }
}
