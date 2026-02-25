package com.ARC.app.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemDTO {
    private String name;
    private String rarity;

    @JsonProperty("item_type")
    private String itemType;
    private String icon;

    @JsonProperty("item_id")
    private String itemId;

    public ItemDTO(){}
    public ItemDTO(String name, String rarity, String item_type, String icon) {
        this.name = name;
        this.rarity = rarity;
        this.itemType = item_type;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
