package com.ARC.app.model;

public class ItemBase {
    private String id;
    private String name;
    private String description;
    private String itemType;
    private String icon;
    private String rarity;
    private String flavorText;
    private Integer weight;
    private Integer stackSize;

    private String QuickUseFK; //FK
    private String WeaponStatsFK; //FK
    private String WeaponModStatsFK; //FK

    public ItemBase(String id, String name, String description, String itemType, String icon, String rarity, String flavorText, Integer weight, Integer stackSize, String quickUseFK, String weaponStatsFK, String weaponModStatsFK) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.itemType = itemType;
        this.icon = icon;
        this.rarity = rarity;
        this.flavorText = flavorText;
        this.weight = weight;
        this.stackSize = stackSize;
        QuickUseFK = quickUseFK;
        WeaponStatsFK = weaponStatsFK;
        WeaponModStatsFK = weaponModStatsFK;
    }

    public String getQuickUseFK() {
        return QuickUseFK;
    }

    public void setQuickUseFK(String quickUseFK) {
        QuickUseFK = quickUseFK;
    }

    public String getWeaponStatsFK() {
        return WeaponStatsFK;
    }

    public void setWeaponStatsFK(String weaponStatsFK) {
        WeaponStatsFK = weaponStatsFK;
    }

    public String getWeaponModStatsFK() {
        return WeaponModStatsFK;
    }

    public void setWeaponModStatsFK(String weaponModStatsFK) {
        WeaponModStatsFK = weaponModStatsFK;
    }

    public Integer getStackSize() {
        return stackSize;
    }

    public void setStackSize(Integer stackSize) {
        this.stackSize = stackSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
