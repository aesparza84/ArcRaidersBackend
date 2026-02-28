package com.ARC.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "weapon_mod_stats_table")
public class WeaponModStats {

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "range")
    private Double range;

    @Column(name = "stability")
    private Double stability;

    @Column(name = "damage_mult")
    private Double damageMult;

    @Column(name = "augment_slots")
    private Integer augmentSlots;

    @Column(name = "magazine_size")
    private Integer magazineSize;

    @Column(name = "reduced_noise")
    private Integer reducedNoise;

    @Column(name = "damage_per_second")
    private Integer damagePerSecond;

    @Column(name = "reduced_equip_time")
    private Integer reducedEquipTime;

    @Column(name = "compatible_weapons")
    private String compatibleWeapons;

    @Column(name = "increased_unequip_time")
    private Integer increasedUnequipTime;

    @Column(name = "reduced_vertical_recoil")
    private Integer reducedVerticalRecoil;

    @Column(name = "increased_bullet_velocity")
    private Integer increasedBulletVelocity;

    @Column(name = "increased_vertical_recoil")
    private Integer increasedVerticalRecoil;

    @Column(name = "reduced_max_shot_dispersion")
    private Integer reducedMaxShotDispersion;

    @Column(name = "reduced_per_shot_dispersion")
    private Integer reducedPerShotDispersion;

    @Column(name = "reduced_durability_burn_rate")
    private Integer reducedDurabilityBurnRate;

    @Column(name = "reduced_recoil_recovery_time")
    private Integer reducedRecoilRecoveryTime;

    @Column(name = "increased_recoil_recovery_time")
    private Integer increasedRecoilRecoveryTime;

    @Column(name = "reduced_dispersion_recovery_time")
    private Double reducedDispersionRecoveryTime;

    @OneToOne
    @JoinColumn(name = "item_id")
    private ItemBase baseItem;

    public WeaponModStats(){}

    public WeaponModStats(Builder b) {
        this.itemId = b.itemId;
        this.range = b.range;
        this.stability = b.stability;
        this.damageMult = b.damageMult;
        this.augmentSlots = b.augmentSlots;
        this.magazineSize = b.magazineSize;
        this.reducedNoise = b.reducedNoise;
        this.damagePerSecond = b.damagePerSecond;
        this.reducedEquipTime = b.reducedEquipTime;
        this.compatibleWeapons = b.compatibleWeapons;
        this.increasedUnequipTime = b.increasedUnequipTime;
        this.reducedVerticalRecoil = b.reducedVerticalRecoil;
        this.increasedBulletVelocity = b.increasedBulletVelocity;
        this.increasedVerticalRecoil = b.increasedVerticalRecoil;
        this.reducedMaxShotDispersion = b.reducedMaxShotDispersion;
        this.reducedPerShotDispersion = b.reducedPerShotDispersion;
        this.reducedDurabilityBurnRate = b.reducedDurabilityBurnRate;
        this.reducedRecoilRecoveryTime = b.reducedRecoilRecoveryTime;
        this.increasedRecoilRecoveryTime = b.increasedRecoilRecoveryTime;
        this.reducedDispersionRecoveryTime = b.reducedDispersionRecoveryTime;

    }

    public WeaponModStats(String item_id, Double range, Double stability, Double damageMult, Integer augmentSlots, Integer magazineSize, Integer reducedNoise, Integer damagePerSecond, Integer reducedEquipTime, String compatibleWeapons, Integer increasedUnequipTime, Integer reducedVerticalRecoil, Integer increasedBulletVelocity, Integer increasedVerticalRecoil, Integer reducedMaxShotDispersion, Integer reducedPerShotDispersion, Integer reducedDurabilityBurnRate, Integer reducedRecoilRecoveryTime, Integer increasedRecoilRecoveryTime, Double reducedDispersionRecoveryTime) {
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

    public Double getDamageMult() {
        return damageMult;
    }

    public void setDamageMult(Double damageMult) {
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

    public ItemBase getBaseItem() {
        return baseItem;
    }

    public void setBaseItem(ItemBase baseItem) {
        this.baseItem = baseItem;
    }

    public static class Builder{
        private String itemId;
        private Double range;
        private Double stability;
        private Double damageMult;
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

        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder range(Double range) {
            this.range = range;
            return this;
        }

        public Builder stability(Double stability) {
            this.stability = stability;
            return this;
        }

        public Builder damageMult(Double damageMult) {
            this.damageMult = damageMult;
            return this;
        }

        public Builder augmentSlots(Integer augmentSlots) {
            this.augmentSlots = augmentSlots;
            return this;
        }

        public Builder magazineSize(Integer magazineSize) {
            this.magazineSize = magazineSize;
            return this;
        }

        public Builder reducedNoise(Integer reducedNoise) {
            this.reducedNoise = reducedNoise;
            return this;
        }

        public Builder damagePerSecond(Integer damagePerSecond) {
            this.damagePerSecond = damagePerSecond;
            return this;
        }

        public Builder reducedEquipTime(Integer reducedEquipTime) {
            this.reducedEquipTime = reducedEquipTime;
            return this;
        }

        public Builder compatibleWeapons(String compatibleWeapons) {
            this.compatibleWeapons = compatibleWeapons;
            return this;
        }

        public Builder increasedUnequipTime(Integer increasedUnequipTime) {
            this.increasedUnequipTime = increasedUnequipTime;
            return this;
        }

        public Builder reducedVerticalRecoil(Integer reducedVerticalRecoil) {
            this.reducedVerticalRecoil = reducedVerticalRecoil;
            return this;
        }

        public Builder increasedBulletVelocity(Integer increasedBulletVelocity) {
            this.increasedBulletVelocity = increasedBulletVelocity;
            return this;
        }

        public Builder increasedVerticalRecoil(Integer increasedVerticalRecoil) {
            this.increasedVerticalRecoil = increasedVerticalRecoil;
            return this;
        }

        public Builder reducedMaxShotDispersion(Integer reducedMaxShotDispersion) {
            this.reducedMaxShotDispersion = reducedMaxShotDispersion;
            return this;
        }

        public Builder reducedPerShotDispersion(Integer reducedPerShotDispersion) {
            this.reducedPerShotDispersion = reducedPerShotDispersion;
            return this;
        }

        public Builder reducedDurabilityBurnRate(Integer reducedDurabilityBurnRate) {
            this.reducedDurabilityBurnRate = reducedDurabilityBurnRate;
            return this;
        }

        public Builder reducedRecoilRecoveryTime(Integer reducedRecoilRecoveryTime) {
            this.reducedRecoilRecoveryTime = reducedRecoilRecoveryTime;
            return this;
        }

        public Builder increasedRecoilRecoveryTime(Integer increasedRecoilRecoveryTime) {
            this.increasedRecoilRecoveryTime = increasedRecoilRecoveryTime;
            return this;
        }

        public Builder reducedDispersionRecoveryTime(Double reducedDispersionRecoveryTime) {
            this.reducedDispersionRecoveryTime = reducedDispersionRecoveryTime;
            return this;
        }

        public WeaponModStats build() {
            return new WeaponModStats(this);
        }
    }
}
