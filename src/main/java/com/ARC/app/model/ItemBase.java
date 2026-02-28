package com.ARC.app.model;

import com.ARC.app.DTO.Items.ItemDropByDTO;
import com.ARC.app.DTO.Items.SubItemModReferenceDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "item_table")
public class ItemBase {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "item_type")
    private String itemType;

    @Column(name = "icon")
    private String icon;

    @Column(name = "rarity")
    private String rarity;

    @Column(name = "flavor_text")
    private String flavorText;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "stack_size")
    private Integer stackSize;

    @OneToOne(mappedBy = "baseItem") //java field name
    private QuickUseStats quickUseStats; //FK

    @OneToOne(mappedBy = "baseItem")
    private WeaponStats weaponStats; //FK

    @OneToOne(mappedBy = "baseItem")
    private WeaponModStats weaponModStats; //FK

    @OneToMany(mappedBy = "childItem")
    private List<ItemComponent> components;

//    private List<ItemBase> recycleComponents;

//    private List<ItemBase> usedIn;
//
//    private List<ItemBase> recycleFrom;
//
//    private List<SubItemModReferenceDTO> mods;
//
//    private List<ItemDropByDTO> droppedBy;

    public ItemBase(){}

    public ItemBase(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.description = b.description;
        this.itemType = b.itemType;
        this.icon = b.icon;
        this.rarity = b.rarity;
        this.flavorText = b.flavorText;
        this.weight = b.weight;
        this.stackSize = b.stackSize;
    }

    public ItemBase(String id, String name, String description, String itemType, String icon, String rarity, String flavorText, Double weight, Integer stackSize) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.itemType = itemType;
        this.icon = icon;
        this.rarity = rarity;
        this.flavorText = flavorText;
        this.weight = weight;
        this.stackSize = stackSize;
    }

    public QuickUseStats getQuickUseStats() {
        return quickUseStats;
    }

    public void setQuickUseStats(QuickUseStats quickUseStats) {
        this.quickUseStats = quickUseStats;
    }

    public WeaponStats getWeaponStats() {
        return weaponStats;
    }

    public void setWeaponStats(WeaponStats weaponStats) {
        this.weaponStats = weaponStats;
    }

    public WeaponModStats getWeaponModStats() {
        return weaponModStats;
    }

    public void setWeaponModStats(WeaponModStats weaponModStats) {
        this.weaponModStats = weaponModStats;
    }

    public List<ItemComponent> getComponents() {
        return components;
    }

    public void setComponents(List<ItemComponent> components) {
        this.components = components;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public static class Builder {
        private String id;
        private String name;
        private String description;
        private String itemType;
        private String icon;
        private String rarity;
        private String flavorText;
        private Double weight;
        private Integer stackSize;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
        }

        public Builder setRarity(String rarity) {
            this.rarity = rarity;
            return this;
        }

        public Builder setFlavorText(String flavorText) {
            this.flavorText = flavorText;
            return this;
        }

        public Builder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setStackSize(Integer stackSize) {
            this.stackSize = stackSize;
            return this;
        }

        public ItemBase build() {
            return new ItemBase(this);
        }
    }
}
