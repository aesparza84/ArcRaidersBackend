package com.ARC.app.model;

import com.ARC.app.DTO.Items.FullItemStatBlockDTO;
import java.util.List;
import com.ARC.app.DTO.GuideLinksDTO;

public class ItemFull {
    private String id;
    private String name;
    private String description;
    private String itemType;
    private String icon;
    private String rarity;
    private String workbench;
    private String flavorText;
    private String subcategory;
    private String shieldType;
    private String lootArea;
    private String ammoType;
    private Integer value;
    private FullItemStatBlockDTO statBlock;

    private List<String> loadoutSlots;
    private List<String> sources;
    private List<String> locations;
    private List<GuideLinksDTO> guideLinks;

    public ItemFull() {}

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

    public List<String> getLoadoutSlots() {
        return loadoutSlots;
    }

    public void setLoadoutSlots(List<String> loadoutSlots) {
        this.loadoutSlots = loadoutSlots;
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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getWorkbench() {
        return workbench;
    }

    public void setWorkbench(String workbench) {
        this.workbench = workbench;
    }

    public FullItemStatBlockDTO getStatBlock() {
        return statBlock;
    }

    public void setStatBlock(FullItemStatBlockDTO statBlock) {
        this.statBlock = statBlock;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getShieldType() {
        return shieldType;
    }

    public void setShieldType(String shieldType) {
        this.shieldType = shieldType;
    }

    public String getLootArea() {
        return lootArea;
    }

    public void setLootArea(String lootArea) {
        this.lootArea = lootArea;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public List<GuideLinksDTO> getGuideLinks() {
        return guideLinks;
    }

    public void setGuideLinks(List<GuideLinksDTO> guideLinks) {
        this.guideLinks = guideLinks;
    }

}
