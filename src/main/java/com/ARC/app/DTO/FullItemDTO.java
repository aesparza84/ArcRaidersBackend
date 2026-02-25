package com.ARC.app.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FullItemDTO {

    private String id;
    private String name;
    private String description;

    @JsonProperty("item_type")
    private String itemType;

    @JsonProperty("loadout_slots")
    private List<String> loadoutSlots;

    private String icon;
    private String rarity;
    private Integer value;
    private String workbench;

    @JsonProperty("stat_block")
    private FullItemStatBlockDTO statBlock;

    @JsonProperty("flavor_text")
    private String flavorText;

    private String subcategory;

    @JsonProperty("shield_type")
    private String shieldType;

    @JsonProperty("loot_area")
    private String lootArea;

    private List<String> sources;

    @JsonProperty("ammo_type")
    private String ammoType;

    private List<String> locations;

    @JsonProperty("guide_links")
    private List<GuideLinksDTO> guideLinks;

    public FullItemDTO() {}

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

    public static class GuideLinksDTO{
        private String url;
        private String label;

        public GuideLinksDTO(){}

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }
}

