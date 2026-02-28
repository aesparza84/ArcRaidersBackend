package com.ARC.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "weapon_stats_table")
public class WeaponStats {

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "damage")
    private Integer damage;

    @Column(name = "stealth")
    private Integer stealth;

    @Column(name = "magazine_size")
    private Integer magazineSize;

    @Column(name = "increased_fire_rate")
    private Integer increasedFireRate;

    @Column(name = "range")
    private Double range;

    @Column(name = "agility")
    private Double agility;

    @Column(name = "fire_rate")
    private Double fireRate;

    @Column(name = "stability")
    private Double stability;

    @Column(name = "reduced_dispersion_recovery_time")
    private Double reducedDispersionRecoveryTime;

    @OneToOne
    @JoinColumn(name = "item_id")
    private ItemBase baseItem;

    public WeaponStats(){}

    public WeaponStats(Builder b) {
        this.itemId = b.itemId;
        this.damage = b.damage;
        this.stealth = b.stealth;
        this.magazineSize = b.magazineSize;
        this.increasedFireRate = b.increasedFireRate;
        this.fireRate = b.fireRate;
        this.range = b.range;
        this.agility = b.agility;
        this.stability = b.stability;
        this.reducedDispersionRecoveryTime = b.reducedDispersionRecoveryTime;
    }

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

    public ItemBase getBaseItem() {
        return baseItem;
    }

    public void setBaseItem(ItemBase baseItem) {
        this.baseItem = baseItem;
    }

    public static class Builder {
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

        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder damage(Integer damage) {
            this.damage = damage;
            return this;
        }

        public Builder stealth(Integer stealth) {
            this.stealth = stealth;
            return this;
        }

        public Builder magazineSize(Integer magazineSize) {
            this.magazineSize = magazineSize;
            return this;
        }

        public Builder increasedFireRate(Integer increasedFireRate) {
            this.increasedFireRate = increasedFireRate;
            return this;
        }

        public Builder range(Double range) {
            this.range = range;
            return this;
        }

        public Builder agility(Double agility) {
            this.agility = agility;
            return this;
        }

        public Builder fireRate(Double fireRate) {
            this.fireRate = fireRate;
            return this;
        }

        public Builder stability(Double stability) {
            this.stability = stability;
            return this;
        }

        public Builder reducedDispersionRecoveryTime(Double reducedDispersionRecoveryTime) {
            this.reducedDispersionRecoveryTime = reducedDispersionRecoveryTime;
            return this;
        }

        public WeaponStats build(){
            return new WeaponStats(this);
        }
    }
}
