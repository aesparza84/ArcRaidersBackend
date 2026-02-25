package com.ARC.app.DTO.ARC;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnemyItemContentsDTO {
    private String name;
    private String rarity;

    @JsonProperty("item_type")
    private String itemType;
    private String icon;

    @JsonProperty("id")
    private String itemId;

    public EnemyItemContentsDTO(){}
    public EnemyItemContentsDTO(String name, String rarity, String item_type, String icon, String itemId) {
        this.name = name;
        this.rarity = rarity;
        this.itemType = item_type;
        this.icon = icon;
        this.itemId = itemId;
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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
