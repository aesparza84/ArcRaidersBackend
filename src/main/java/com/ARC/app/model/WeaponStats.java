package com.ARC.app.model;

public class WeaponStats {
    private String itemId;
    private Integer damage;
    private Integer stealth;
    private Integer magazineSize;
    private Integer increasedFireRate;
    private Double range;
    private Double agility;
    private Double fireRate;
    private Double stability;
    private Double reducedDispersionRecoveryTime;

    public WeaponStats(String item_id, Integer damage, Integer stealth, Integer magazineSize, Integer increasedFireRatee, Double range, Double agility, Double fireRate, Double stability, Double reducedDispersionRecoveryTime) {
        this.itemId = item_id;
        this.damage = damage;
        this.stealth = stealth;
        this.magazineSize = magazineSize;
        this.increasedFireRate = increasedFireRatee;
        this.range = range;
        this.agility = agility;
        this.fireRate = fireRate;
        this.stability = stability;
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

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Double getAgility() {
        return agility;
    }

    public void setAgility(Double agility) {
        this.agility = agility;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
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

    public Integer getMagazineSize() {
        return magazineSize;
    }

    public void setMagazineSize(Integer magazineSize) {
        this.magazineSize = magazineSize;
    }

    public Integer getIncreasedFireRate() {
        return increasedFireRate;
    }

    public void setIncreasedFireRate(Integer increasedFireRate) {
        this.increasedFireRate = increasedFireRate;
    }

    public Double getReducedDispersionRecoveryTime() {
        return reducedDispersionRecoveryTime;
    }

    public void setReducedDispersionRecoveryTime(Double reducedDispersionRecoveryTime) {
        this.reducedDispersionRecoveryTime = reducedDispersionRecoveryTime;
    }
}
