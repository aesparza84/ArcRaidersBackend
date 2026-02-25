package com.ARC.app.model;

public class ItemPreview {
    private String icon;
    private String name;
    private String rarity;
    private String itemType;
    private String itemId;

    public ItemPreview(){}
    public ItemPreview(String name, String rarity, String item_type, String icon, String itemId) {
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
