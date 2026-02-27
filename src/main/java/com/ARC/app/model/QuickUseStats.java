package com.ARC.app.model;

public class QuickUseStats {
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
}
