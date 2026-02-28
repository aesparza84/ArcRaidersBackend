package com.ARC.app.DTO.Items;

public class ItemStatBlockDTO {
    private Double range;
    private Integer damage;
    private Integer health;
    private Double radius;
    private Integer shield;
    private Double weight;
    private Double agility;
    private Double arcStun;
    private Integer healing;
    private Integer stamina;
    private Integer stealth;
    private Double useTime;
    private Double duration;
    private Double fireRate;
    private Double stability;
    private Integer stackSize;
    private Double damageMult;
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
    private Double healingPerSecond;
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

    public ItemStatBlockDTO(){}

    public ItemStatBlockDTO(String firingMode, Double range, Integer damage, Integer health, Double radius, Integer shield, Double weight, Double agility, Double arcStun, Integer healing, Integer stamina, Integer stealth, Double useTime, Double duration, Double fireRate, Double stability, Integer stackSize, Double damageMult, Double raiderStun, Integer weightLimit, Integer augmentSlots, Integer healingSlots, Integer magazineSize, Integer reducedNoise, Double shieldCharge, Integer backpackSlots, Integer quickUseSlots, Integer damagePerSecond, Integer movementPenalty, Integer safePocketSlots, Integer damageMitigation, Double healingPerSecond, Integer reducedEquipTime, Integer staminaPerSecond, Integer increasedADSSpeed, Integer increasedFireRate, Integer reducedReloadTime, Integer illuminationRadius, Integer increasedEquipTime, Integer reducedUnequipTime, String shieldCompatibility, String compatibleWeapons, Integer increasedUnequipTime, Integer reducedVerticalRecoil, Integer increasedBulletVelocity, Integer increasedVerticalRecoil, Integer reducedMaxShotDispersion, Integer reducedPerShotDispersion, Integer reducedDurabilityBurnRate, Integer reducedRecoilRecoveryTime, Integer increasedRecoilRecoveryTime, Double reducedDispersionRecoveryTime) {
        this.range = range;
        this.damage = damage;
        this.health = health;
        this.radius = radius;
        this.shield = shield;
        this.weight = weight;
        this.agility = agility;
        this.arcStun = arcStun;
        this.healing = healing;
        this.stamina = stamina;
        this.stealth = stealth;
        this.useTime = useTime;
        this.duration = duration;
        this.fireRate = fireRate;
        this.stability = stability;
        this.stackSize = stackSize;
        this.damageMult = damageMult;
        this.raiderStun = raiderStun;
        this.weightLimit = weightLimit;
        this.augmentSlots = augmentSlots;
        this.healingSlots = healingSlots;
        this.magazineSize = magazineSize;
        this.reducedNoise = reducedNoise;
        this.shieldCharge = shieldCharge;
        this.backpackSlots = backpackSlots;
        this.quickUseSlots = quickUseSlots;
        this.damagePerSecond = damagePerSecond;
        this.movementPenalty = movementPenalty;
        this.safePocketSlots = safePocketSlots;
        this.damageMitigation = damageMitigation;
        this.healingPerSecond = healingPerSecond;
        this.reducedEquipTime = reducedEquipTime;
        this.staminaPerSecond = staminaPerSecond;
        this.increasedADSSpeed = increasedADSSpeed;
        this.increasedFireRate = increasedFireRate;
        this.reducedReloadTime = reducedReloadTime;
        this.illuminationRadius = illuminationRadius;
        this.increasedEquipTime = increasedEquipTime;
        this.reducedUnequipTime = reducedUnequipTime;
        this.shieldCompatibility = shieldCompatibility;
        this.firingMode = firingMode;
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

    public String getCompatibleWeapons() {
        return compatibleWeapons;
    }

    public void setCompatibleWeapons(String compatibleWeapons) {
        this.compatibleWeapons = compatibleWeapons;
    }

    public Double getRange() {
        return range;
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

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
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

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
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

    public Double getDamageMult() {
        return damageMult;
    }

    public void setDamageMult(Double damageMult) {
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

    public Double getHealingPerSecond() {
        return healingPerSecond;
    }

    public void setHealingPerSecond(Double healingPerSecond) {
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
}
