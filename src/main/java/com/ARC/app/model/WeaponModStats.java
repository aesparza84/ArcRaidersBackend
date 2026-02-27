package com.ARC.app.model;

public class WeaponModStats {
    private String itemId;
    private Double range;
    private Double stability;
    private Integer damageMult;
    private Integer augmentSlots;
    private Integer magazineSize;
    private Integer reducedNoise;
    private Integer damagePerSecond;
    private Integer reducedEquipTime;

    private String compatibleWeapons;

    private Integer increasedUnequipTime;
    private Integer reducedVerticalRecoil;
    private Integer increasedBulletVelocity;
    private Integer increasedVerticalRecoil;
    private Integer reducedMaxShotDispersion;
    private Integer reducedPerShotDispersion;
    private Integer reducedDurabilityBurnRate;
    private Integer reducedRecoilRecoveryTime;
    private Integer increasedRecoilRecoveryTime;
    private Double reducedDispersionRecoveryTime;

    public WeaponModStats(String item_id, Double range, Double stability, Integer damageMult, Integer augmentSlots, Integer magazineSize, Integer reducedNoise, Integer damagePerSecond, Integer reducedEquipTime, String compatibleWeapons, Integer increasedUnequipTime, Integer reducedVerticalRecoil, Integer increasedBulletVelocity, Integer increasedVerticalRecoil, Integer reducedMaxShotDispersion, Integer reducedPerShotDispersion, Integer reducedDurabilityBurnRate, Integer reducedRecoilRecoveryTime, Integer increasedRecoilRecoveryTime, Double reducedDispersionRecoveryTime) {
        this.itemId = item_id;
        this.range = range;
        this.stability = stability;
        this.damageMult = damageMult;
        this.augmentSlots = augmentSlots;
        this.magazineSize = magazineSize;
        this.reducedNoise = reducedNoise;
        this.damagePerSecond = damagePerSecond;
        this.reducedEquipTime = reducedEquipTime;
        this.compatibleWeapons = compatibleWeapons;
        this.increasedUnequipTime = increasedUnequipTime;
        this.reducedVerticalRecoil = reducedVerticalRecoil;
        this.increasedBulletVelocity = increasedBulletVelocity;
        this.increasedVerticalRecoil = increasedVerticalRecoil;
        this.reducedMaxShotDispersion = reducedMaxShotDispersion;
        this.reducedPerShotDispersion = reducedPerShotDispersion;
        this.reducedDurabilityBurnRate = reducedDurabilityBurnRate;
        this.reducedRecoilRecoveryTime = reducedRecoilRecoveryTime;
        this.increasedRecoilRecoveryTime = increasedRecoilRecoveryTime;
        this.reducedDispersionRecoveryTime = reducedDispersionRecoveryTime;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Double getRange() {
        return range;
    }

    public void setRange(Double range) {
        this.range = range;
    }

    public Double getStability() {
        return stability;
    }

    public void setStability(Double stability) {
        this.stability = stability;
    }

    public Integer getDamageMult() {
        return damageMult;
    }

    public void setDamageMult(Integer damageMult) {
        this.damageMult = damageMult;
    }

    public Integer getAugmentSlots() {
        return augmentSlots;
    }

    public void setAugmentSlots(Integer augmentSlots) {
        this.augmentSlots = augmentSlots;
    }

    public Integer getMagazineSize() {
        return magazineSize;
    }

    public void setMagazineSize(Integer magazineSize) {
        this.magazineSize = magazineSize;
    }

    public Integer getReducedNoise() {
        return reducedNoise;
    }

    public void setReducedNoise(Integer reducedNoise) {
        this.reducedNoise = reducedNoise;
    }

    public Integer getDamagePerSecond() {
        return damagePerSecond;
    }

    public void setDamagePerSecond(Integer damagePerSecond) {
        this.damagePerSecond = damagePerSecond;
    }

    public Integer getReducedEquipTime() {
        return reducedEquipTime;
    }

    public void setReducedEquipTime(Integer reducedEquipTime) {
        this.reducedEquipTime = reducedEquipTime;
    }

    public String getCompatibleWeapons() {
        return compatibleWeapons;
    }

    public void setCompatibleWeapons(String compatibleWeapons) {
        this.compatibleWeapons = compatibleWeapons;
    }

    public Integer getIncreasedUnequipTime() {
        return increasedUnequipTime;
    }

    public void setIncreasedUnequipTime(Integer increasedUnequipTime) {
        this.increasedUnequipTime = increasedUnequipTime;
    }

    public Integer getReducedVerticalRecoil() {
        return reducedVerticalRecoil;
    }

    public void setReducedVerticalRecoil(Integer reducedVerticalRecoil) {
        this.reducedVerticalRecoil = reducedVerticalRecoil;
    }

    public Integer getIncreasedBulletVelocity() {
        return increasedBulletVelocity;
    }

    public void setIncreasedBulletVelocity(Integer increasedBulletVelocity) {
        this.increasedBulletVelocity = increasedBulletVelocity;
    }

    public Integer getIncreasedVerticalRecoil() {
        return increasedVerticalRecoil;
    }

    public void setIncreasedVerticalRecoil(Integer increasedVerticalRecoil) {
        this.increasedVerticalRecoil = increasedVerticalRecoil;
    }

    public Integer getReducedMaxShotDispersion() {
        return reducedMaxShotDispersion;
    }

    public void setReducedMaxShotDispersion(Integer reducedMaxShotDispersion) {
        this.reducedMaxShotDispersion = reducedMaxShotDispersion;
    }

    public Integer getReducedPerShotDispersion() {
        return reducedPerShotDispersion;
    }

    public void setReducedPerShotDispersion(Integer reducedPerShotDispersion) {
        this.reducedPerShotDispersion = reducedPerShotDispersion;
    }

    public Integer getReducedDurabilityBurnRate() {
        return reducedDurabilityBurnRate;
    }

    public void setReducedDurabilityBurnRate(Integer reducedDurabilityBurnRate) {
        this.reducedDurabilityBurnRate = reducedDurabilityBurnRate;
    }

    public Integer getReducedRecoilRecoveryTime() {
        return reducedRecoilRecoveryTime;
    }

    public void setReducedRecoilRecoveryTime(Integer reducedRecoilRecoveryTime) {
        this.reducedRecoilRecoveryTime = reducedRecoilRecoveryTime;
    }

    public Integer getIncreasedRecoilRecoveryTime() {
        return increasedRecoilRecoveryTime;
    }

    public void setIncreasedRecoilRecoveryTime(Integer increasedRecoilRecoveryTime) {
        this.increasedRecoilRecoveryTime = increasedRecoilRecoveryTime;
    }

    public Double getReducedDispersionRecoveryTime() {
        return reducedDispersionRecoveryTime;
    }

    public void setReducedDispersionRecoveryTime(Double reducedDispersionRecoveryTime) {
        this.reducedDispersionRecoveryTime = reducedDispersionRecoveryTime;
    }
}
