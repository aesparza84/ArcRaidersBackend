package com.ARC.app.DTO.Items;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubItemBaseDTO {
    private String id;
    private String icon;
    private String name;
    private String rarity;
    private String description;

    @JsonProperty("item_type")
    private String itemType;

    public SubItemBaseDTO(){}

    public SubItemBaseDTO(String id, String icon, String name, String rarity, String description, String itemType) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.rarity = rarity;
        this.description = description;
        this.itemType = itemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
