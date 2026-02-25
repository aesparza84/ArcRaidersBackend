package com.ARC.app.apiParameters;

import java.util.Objects;

public class ApiItemParameters {
    private String itemType;
    private String rarity;
    private String loadoutSlot;
    private String workbench;
    private String shieldType;
    private Boolean includeComponents;
    private Boolean minimal;
    private ApiPageableRequest pageable;

    public ApiItemParameters(){}
    public ApiItemParameters(String itemType, String rarity, String loadoutSlot, String workbench, String shieldType, Boolean includeComponents, Boolean minimal, ApiPageableRequest pageable) {
        this.itemType = itemType;
        this.rarity = rarity;
        this.loadoutSlot = loadoutSlot;
        this.workbench = workbench;
        this.shieldType = shieldType;
        this.includeComponents = includeComponents;
        this.minimal = minimal;
        this.pageable = pageable;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getLoadoutSlot() {
        return loadoutSlot;
    }

    public void setLoadoutSlot(String loadoutSlot) {
        this.loadoutSlot = loadoutSlot;
    }

    public String getWorkbench() {
        return workbench;
    }

    public void setWorkbench(String workbench) {
        this.workbench = workbench;
    }

    public String getShieldType() {
        return shieldType;
    }

    public void setShieldType(String shieldType) {
        this.shieldType = shieldType;
    }

    public Boolean getIncludeComponents() {
        return includeComponents;
    }

    public void setIncludeComponents(Boolean includeComponents) {
        this.includeComponents = includeComponents;
    }

    public Boolean getMinimal() {
        return minimal;
    }

    public void setMinimal(Boolean minimal) {
        this.minimal = minimal;
    }

    public ApiPageableRequest getPageable() {
        return pageable;
    }

    public void setPageable(ApiPageableRequest pageable) {
        this.pageable = pageable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        ApiItemParameters other = (ApiItemParameters) obj;

        return this.pageable == other.pageable &&
                this.includeComponents == other.includeComponents &&
                this.loadoutSlot == other.loadoutSlot &&
                this.rarity == other.rarity &&
                this.shieldType == other.shieldType &&
                this.itemType == other.itemType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageable, itemType, rarity, shieldType);
    }
}
