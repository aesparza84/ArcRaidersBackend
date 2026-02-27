package com.ARC.app.model;

import com.ARC.app.DTO.Items.ItemStatBlockDTO;

public class ItemStatBlock {
    private Double range;
    private Integer damage;
    private Integer health;
    private Integer radius;
    private Integer shield;
    private Double weight;
    private Double agility;
    private Double arcStun;
    private Integer healing;
    private Integer stamina;
    private Integer stealth;
    private Double useTime;
    private Integer duration;
    private Double fireRate;
    private Double stability;
    private Integer stackSize;
    private Integer damageMult;
    private Double raiderStun;
    private Integer weightLimit;
    private Integer augmentSlots;
    private Integer healingSlots;
    private Integer magazineSize;
    private Integer reducedNoise;
    private Double shieldCharge;
    private Integer backpackSlots;
    private Integer quickUseSlots;
    private Integer damagePerSecond;
    private Integer movementPenalty;
    private Integer safePocketSlots;
    private Integer damageMitigation;
    private Integer healingPerSecond;
    private Integer reducedEquipTime;
    private Integer staminaPerSecond;
    private Integer increasedADSSpeed;
    private Integer increasedFireRate;
    private Integer reducedReloadTime;
    private Integer illuminationRadius;
    private Integer increasedEquipTime;
    private Integer reducedUnequipTime;

    private String shieldCompatibility;
    private String firingMode;
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

    public ItemStatBlock(){}

    public Double getRange() {
        return range;
    }

    public String getCompatibleWeapons() {
        return compatibleWeapons;
    }

    public void setCompatibleWeapons(String compatibleWeapons) {
        this.compatibleWeapons = compatibleWeapons;
    }

    public void setRange(Double range) {
        this.range = range;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Integer getShield() {
        return shield;
    }

    public void setShield(Integer shield) {
        this.shield = shield;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getAgility() {
        return agility;
    }

    public void setAgility(Double agility) {
        this.agility = agility;
    }

    public Double getArcStun() {
        return arcStun;
    }

    public void setArcStun(Double arcStun) {
        this.arcStun = arcStun;
    }

    public Integer getHealing() {
        return healing;
    }

    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public Double getUseTime() {
        return useTime;
    }

    public void setUseTime(Double useTime) {
        this.useTime = useTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getFireRate() {
        return fireRate;
    }

    public void setFireRate(Double fireRate) {
        this.fireRate = fireRate;
    }

    public Double getStability() {
        return stability;
    }

    public void setStability(Double stability) {
        this.stability = stability;
    }

    public Integer getStackSize() {
        return stackSize;
    }

    public void setStackSize(Integer stackSize) {
        this.stackSize = stackSize;
    }

    public Integer getDamageMult() {
        return damageMult;
    }

    public void setDamageMult(Integer damageMult) {
        this.damageMult = damageMult;
    }

    public Double getRaiderStun() {
        return raiderStun;
    }

    public void setRaiderStun(Double raiderStun) {
        this.raiderStun = raiderStun;
    }

    public Integer getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(Integer weightLimit) {
        this.weightLimit = weightLimit;
    }

    public Integer getAugmentSlots() {
        return augmentSlots;
    }

    public void setAugmentSlots(Integer augmentSlots) {
        this.augmentSlots = augmentSlots;
    }

    public Integer getHealingSlots() {
        return healingSlots;
    }

    public void setHealingSlots(Integer healingSlots) {
        this.healingSlots = healingSlots;
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

    public Double getShieldCharge() {
        return shieldCharge;
    }

    public void setShieldCharge(Double shieldCharge) {
        this.shieldCharge = shieldCharge;
    }

    public Integer getBackpackSlots() {
        return backpackSlots;
    }

    public void setBackpackSlots(Integer backpackSlots) {
        this.backpackSlots = backpackSlots;
    }

    public Integer getQuickUseSlots() {
        return quickUseSlots;
    }

    public void setQuickUseSlots(Integer quickUseSlots) {
        this.quickUseSlots = quickUseSlots;
    }

    public Integer getDamagePerSecond() {
        return damagePerSecond;
    }

    public void setDamagePerSecond(Integer damagePerSecond) {
        this.damagePerSecond = damagePerSecond;
    }

    public Integer getMovementPenalty() {
        return movementPenalty;
    }

    public void setMovementPenalty(Integer movementPenalty) {
        this.movementPenalty = movementPenalty;
    }

    public Integer getSafePocketSlots() {
        return safePocketSlots;
    }

    public void setSafePocketSlots(Integer safePocketSlots) {
        this.safePocketSlots = safePocketSlots;
    }

    public Integer getDamageMitigation() {
        return damageMitigation;
    }

    public void setDamageMitigation(Integer damageMitigation) {
        this.damageMitigation = damageMitigation;
    }

    public Integer getHealingPerSecond() {
        return healingPerSecond;
    }

    public void setHealingPerSecond(Integer healingPerSecond) {
        this.healingPerSecond = healingPerSecond;
    }

    public Integer getReducedEquipTime() {
        return reducedEquipTime;
    }

    public void setReducedEquipTime(Integer reducedEquipTime) {
        this.reducedEquipTime = reducedEquipTime;
    }

    public Integer getStaminaPerSecond() {
        return staminaPerSecond;
    }

    public void setStaminaPerSecond(Integer staminaPerSecond) {
        this.staminaPerSecond = staminaPerSecond;
    }

    public Integer getIncreasedADSSpeed() {
        return increasedADSSpeed;
    }

    public void setIncreasedADSSpeed(Integer increasedADSSpeed) {
        this.increasedADSSpeed = increasedADSSpeed;
    }

    public Integer getIncreasedFireRate() {
        return increasedFireRate;
    }

    public void setIncreasedFireRate(Integer increasedFireRate) {
        this.increasedFireRate = increasedFireRate;
    }

    public Integer getReducedReloadTime() {
        return reducedReloadTime;
    }

    public void setReducedReloadTime(Integer reducedReloadTime) {
        this.reducedReloadTime = reducedReloadTime;
    }

    public Integer getIlluminationRadius() {
        return illuminationRadius;
    }

    public void setIlluminationRadius(Integer illuminationRadius) {
        this.illuminationRadius = illuminationRadius;
    }

    public Integer getIncreasedEquipTime() {
        return increasedEquipTime;
    }

    public void setIncreasedEquipTime(Integer increasedEquipTime) {
        this.increasedEquipTime = increasedEquipTime;
    }

    public Integer getReducedUnequipTime() {
        return reducedUnequipTime;
    }

    public void setReducedUnequipTime(Integer reducedUnequipTime) {
        this.reducedUnequipTime = reducedUnequipTime;
    }

    public String getShieldCompatibility() {
        return shieldCompatibility;
    }

    public void setShieldCompatibility(String shieldCompatibility) {
        this.shieldCompatibility = shieldCompatibility;
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

    public String getFiringMode() {
        return firingMode;
    }

    public void setFiringMode(String firingMode) {
        this.firingMode = firingMode;
    }

    public ItemStatBlockDTO toDTO()
    {
        return new ItemStatBlockDTO(
            this.firingMode,
            this.range,
            this.damage,
            this.health,
            this.radius,
            this.shield,
            this.weight,
            this.agility,
            this.arcStun,
            this.healing,
            this.stamina,
            this.stealth,
            this.useTime,
            this.duration,
            this.fireRate,
            this.stability,
            this.stackSize,
            this.damageMult,
            this.raiderStun,
            this.weightLimit ,
            this.augmentSlots ,
            this.healingSlots,
            this.magazineSize,
            this.reducedNoise ,
            this.shieldCharge ,
            this.backpackSlots,
            this.quickUseSlots,
            this.damagePerSecond,
            this.movementPenalty ,
            this.safePocketSlots ,
            this.damageMitigation ,
            this.healingPerSecond ,
            this.reducedEquipTime ,
            this.staminaPerSecond ,
            this.increasedADSSpeed ,
            this.increasedFireRate ,
            this.reducedReloadTime ,
            this.illuminationRadius ,
            this.increasedEquipTime ,
            this.reducedUnequipTime ,
            this.shieldCompatibility ,
            this.compatibleWeapons,
            this.increasedUnequipTime ,
            this.reducedVerticalRecoil,
            this.increasedBulletVelocity,
            this.increasedVerticalRecoil ,
            this.reducedMaxShotDispersion ,
            this.reducedPerShotDispersion ,
            this.reducedDurabilityBurnRate,
            this.reducedRecoilRecoveryTime,
            this.increasedRecoilRecoveryTime ,
            this.reducedDispersionRecoveryTime);
    }
}
