package com.ARC.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quick_use_table")
public class QuickUseStats {

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "damage")
    private Integer damage;

    @Column(name = "radius")
    private Double radius;

    @Column(name = "damage_mult")
    private Double damageMult;

    @Column(name = "duration")
    private Double duration;

    @Column(name = "healing_per_second")
    private Double healingPerSecond;

    @Column(name = "shield_charge")
    private Double shieldCharge;

    @Column(name = "use_time")
    private Double useTime;

    @Column(name = "arc_stun")
    private Double arcStun;

    @Column(name = "raider_stun")
    private Double raiderStun;

    @OneToOne
    @JoinColumn(name = "item_id")
    private ItemBase baseItem;

    public QuickUseStats(){}

    public QuickUseStats(Builder b) {
        this.itemId = b.itemId;
        this.arcStun = b.arcStun;
        this.damage = b.damage;
        this.radius = b.radius;
        this.damageMult = b.damageMult;
        this.duration = b.duration;
        this.healingPerSecond = b.healingPerSecond;
        this.shieldCharge = b.shieldCharge;
        this.useTime = b.useTime;
        this.raiderStun = b.raiderStun;
    }

    public QuickUseStats(String item_id, Integer damage, Double radius, Double damageMult, Double duration, Double healingPerSecond, Double shieldCharge, Double useTime, Double arcStun, Double raiderStun) {
        this.itemId = item_id;
        this.damage = damage;
        this.radius = radius;
        this.damageMult = damageMult;
        this.duration = duration;
        this.healingPerSecond = healingPerSecond;
        this.shieldCharge = shieldCharge;
        this.useTime = useTime;
        this.arcStun = arcStun;
        this.raiderStun = raiderStun;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getDamageMult() {
        return damageMult;
    }

    public void setDamageMult(Double damageMult) {
        this.damageMult = damageMult;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getHealingPerSecond() {
        return healingPerSecond;
    }

    public void setHealingPerSecond(Double healingPerSecond) {
        this.healingPerSecond = healingPerSecond;
    }

    public Double getShieldCharge() {
        return shieldCharge;
    }

    public void setShieldCharge(Double shieldCharge) {
        this.shieldCharge = shieldCharge;
    }

    public Double getUseTime() {
        return useTime;
    }

    public void setUseTime(Double useTime) {
        this.useTime = useTime;
    }

    public Double getArcStun() {
        return arcStun;
    }

    public void setArcStun(Double arcStun) {
        this.arcStun = arcStun;
    }

    public Double getRaiderStun() {
        return raiderStun;
    }

    public void setRaiderStun(Double raiderStun) {
        this.raiderStun = raiderStun;
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
        private Double radius;
        private Double damageMult;
        private Double duration;
        private Double healingPerSecond;
        private Double shieldCharge;
        private Double useTime;
        private Double arcStun;
        private Double raiderStun;

        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder damage(Integer damage) {
            this.damage = damage;
            return this;
        }

        public Builder radius(Double radius) {
            this.radius = radius;
            return this;
        }

        public Builder damageMult(Double damageMult) {
            this.damageMult = damageMult;
            return this;
        }

        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        public Builder healingPerSecond(Double healingPerSecond) {
            this.healingPerSecond = healingPerSecond;
            return this;
        }

        public Builder shieldCharge(Double shieldCharge) {
            this.shieldCharge = shieldCharge;
            return this;
        }

        public Builder useTime(Double useTime) {
            this.useTime = useTime;
            return this;
        }

        public Builder arcStun(Double arcStun) {
            this.arcStun = arcStun;
            return this;
        }

        public Builder raiderStun(Double raiderStun) {
            this.raiderStun = raiderStun;
            return this;
        }


        public QuickUseStats build() {
            return new QuickUseStats(this);
        }
    }
}
