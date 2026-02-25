package com.ARC.app.DTO;

import java.util.List;

public class EnemyDTO {
    private String name;
    private String description;
    private String icon;
    private String image;
    private List<EnemyItemResponseDTO> loot;

    public EnemyDTO(){}
    public EnemyDTO(String name, String description, String icon, String image, List<EnemyItemResponseDTO> loot) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.image = image;
        this.loot = loot;
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

    public List<EnemyItemResponseDTO> getLoot() {
        return loot;
    }

    public void setLoot(List<EnemyItemResponseDTO> loot) {
        this.loot = loot;
    }
}
