package com.ARC.app.DTO.ARC;

import java.util.List;

public class EnemyDTO {
    private String id;
    private String name;
    private String description;
    private String icon;
    private String image;
    private List<EnemyItemContainerDTO> loot;

    public EnemyDTO(){}
    public EnemyDTO(String id,String name, String description, String icon, String image, List<EnemyItemContainerDTO> loot) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.image = image;
        this.loot = loot;
    }

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<EnemyItemContainerDTO> getLoot() {
        return loot;
    }

    public void setLoot(List<EnemyItemContainerDTO> loot) {
        this.loot = loot;
    }
}
