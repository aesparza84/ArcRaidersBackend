package com.ARC.app.DTO.Items;

import com.ARC.app.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ARC.app.DTO.GuideLinksDTO;

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
    private ItemStatBlockDTO statBlock;

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

    private List<SubItemComponentReferenceDTO> components;

    @JsonProperty("recycle_components")
    private List<SubItemComponentReferenceDTO> recycleComponents;

    @JsonProperty("used_in")
    private List<SubItemItemReferenceDTO> usedIn;

    @JsonProperty("recycle_from")
    private List<SubItemItemReferenceDTO> recycleFrom;

    private List<SubItemModReferenceDTO> mods;

    @JsonProperty("dropped_by")
    private List<ItemDropByDTO> droppedBy;

    @JsonProperty("guide_links")
    private List<GuideLinksDTO> guideLinks;

    public FullItemDTO() {}

    public FullItemDTO(String id, String name, String description, String itemType, List<String> loadoutSlots, String icon, String rarity, Integer value, String workbench, ItemStatBlockDTO statBlock, String flavorText, String subcategory, String shieldType, String lootArea, List<String> sources, String ammoType, List<String> locations, List<SubItemComponentReferenceDTO> components, List<SubItemComponentReferenceDTO> recycleComponents, List<SubItemItemReferenceDTO> usedIn, List<SubItemItemReferenceDTO> recycleFrom, List<SubItemModReferenceDTO> mods, List<ItemDropByDTO> droppedBy, List<GuideLinksDTO> guideLinks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.itemType = itemType;
        this.loadoutSlots = loadoutSlots;
        this.icon = icon;
        this.rarity = rarity;
        this.value = value;
        this.workbench = workbench;
        this.statBlock = statBlock;
        this.flavorText = flavorText;
        this.subcategory = subcategory;
        this.shieldType = shieldType;
        this.lootArea = lootArea;
        this.sources = sources;
        this.ammoType = ammoType;
        this.locations = locations;
        this.components = components;
        this.recycleComponents = recycleComponents;
        this.usedIn = usedIn;
        this.recycleFrom = recycleFrom;
        this.mods = mods;
        this.droppedBy = droppedBy;
        this.guideLinks = guideLinks;
    }

    //region GetterSetter
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

    public ItemStatBlockDTO getStatBlock() {
        return statBlock;
    }

    public void setStatBlock(ItemStatBlockDTO statBlock) {
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

    public List<SubItemComponentReferenceDTO> getComponents() {
        return components;
    }

    public void setComponents(List<SubItemComponentReferenceDTO> components) {
        this.components = components;
    }

    public List<SubItemComponentReferenceDTO> getRecycleComponents() {
        return recycleComponents;
    }

    public void setRecycleComponents(List<SubItemComponentReferenceDTO> recycleComponents) {
        this.recycleComponents = recycleComponents;
    }

    public List<SubItemItemReferenceDTO> getUsedIn() {
        return usedIn;
    }

    public void setUsedIn(List<SubItemItemReferenceDTO> usedIn) {
        this.usedIn = usedIn;
    }

    public List<SubItemItemReferenceDTO> getRecycleFrom() {
        return recycleFrom;
    }

    public void setRecycleFrom(List<SubItemItemReferenceDTO> recycleFrom) {
        this.recycleFrom = recycleFrom;
    }

    public List<SubItemModReferenceDTO> getMods() {
        return mods;
    }

    public void setMods(List<SubItemModReferenceDTO> mods) {
        this.mods = mods;
    }

    public List<ItemDropByDTO> getDroppedBy() {
        return droppedBy;
    }

    public void setDroppedBy(List<ItemDropByDTO> droppedBy) {
        this.droppedBy = droppedBy;
    }
    //endregion

    public ItemBase toItemBase() {
        ItemBase base = new ItemBase(
                this.id,
                this.name,
                this.description,
                this.itemType,
                this.icon,
                this.rarity,
                this.flavorText,
                this.statBlock.getWeight(),
                this.statBlock.getStackSize()
        );

        return base;
    }

    public WeaponStats toWeaponStats(){
        WeaponStats stats = new WeaponStats.Builder()
                .itemId(this.id)
                .damage(this.statBlock.getDamage())
                .stealth(this.statBlock.getStealth())
                .magazineSize(this.statBlock.getMagazineSize())
                .increasedFireRate(this.statBlock.getIncreasedFireRate())
                .range(this.statBlock.getRange())
                .agility(this.statBlock.getAgility())
                .fireRate(this.statBlock.getFireRate())
                .stability(this.statBlock.getStability())
                .reducedDispersionRecoveryTime(this.statBlock.getReducedDispersionRecoveryTime())
                .build();

        //SET ITEM-BASE
        ItemBase base = new ItemBase(
                this.id,
                this.name,
                this.description,
                this.itemType,
                this.icon,
                this.rarity,
                this.flavorText,
                this.statBlock.getWeight(),
                this.statBlock.getStackSize()
        );
        stats.setBaseItem(base);

        return stats;
    }

    public WeaponModStats toWeaponModStats() {
        WeaponModStats stats = new WeaponModStats.Builder()
                .itemId(this.id)
                .range(this.statBlock.getRange())
                .stability(this.statBlock.getStability())
                .damageMult(this.statBlock.getDamageMult())
                .augmentSlots(this.statBlock.getAugmentSlots())
                .magazineSize(this.statBlock.getMagazineSize())
                .reducedNoise(this.statBlock.getReducedNoise())
                .damagePerSecond(this.statBlock.getDamagePerSecond())
                .reducedEquipTime(this.statBlock.getReducedEquipTime())
                .compatibleWeapons(this.statBlock.getCompatibleWeapons())
                .increasedUnequipTime(this.statBlock.getIncreasedUnequipTime())
                .reducedVerticalRecoil(this.statBlock.getReducedVerticalRecoil())
                .increasedBulletVelocity(this.statBlock.getIncreasedBulletVelocity())
                .increasedVerticalRecoil(this.statBlock.getIncreasedVerticalRecoil())
                .reducedMaxShotDispersion(this.statBlock.getReducedMaxShotDispersion())
                .reducedPerShotDispersion(this.statBlock.getReducedPerShotDispersion())
                .reducedDurabilityBurnRate(this.statBlock.getReducedDurabilityBurnRate())
                .increasedRecoilRecoveryTime(this.statBlock.getIncreasedRecoilRecoveryTime())
                .reducedDispersionRecoveryTime(this.statBlock.getReducedDispersionRecoveryTime())
                .build();

        //SET ITEM-BASE
        ItemBase base = new ItemBase(
                this.id,
                this.name,
                this.description,
                this.itemType,
                this.icon,
                this.rarity,
                this.flavorText,
                this.statBlock.getWeight(),
                this.statBlock.getStackSize()
        );
        stats.setBaseItem(base);

        return stats;
    }

    public QuickUseStats toQuickUseStats() {
        QuickUseStats stats = new QuickUseStats.Builder()
                .itemId(this.id)
                .arcStun(this.statBlock.getArcStun())
                .damage(statBlock.getDamage())
                .radius(statBlock.getRadius())
                .damage(statBlock.getDamage())
                .damageMult(statBlock.getDamageMult())
                .duration(statBlock.getDuration())
                .healingPerSecond(statBlock.getHealingPerSecond())
                .shieldCharge(statBlock.getShieldCharge())
                .useTime(statBlock.getUseTime())
                .raiderStun(statBlock.getRaiderStun())
                .build();

        //SET ITEM-BASE
        ItemBase base = new ItemBase(
                this.id,
                this.name,
                this.description,
                this.itemType,
                this.icon,
                this.rarity,
                this.flavorText,
                this.statBlock.getWeight(),
                this.statBlock.getStackSize()
        );
        stats.setBaseItem(base);

        return stats;
    }

    public Enemy toEnemy(){
        return null;
    }

}

