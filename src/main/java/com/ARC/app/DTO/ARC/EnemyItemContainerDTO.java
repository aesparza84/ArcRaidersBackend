package com.ARC.app.DTO.ARC;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnemyItemContainerDTO {
    @JsonProperty("item_id")
    private String itemId;

    private EnemyItemContentsDTO item;

    public EnemyItemContainerDTO(){}
    public EnemyItemContainerDTO(EnemyItemContentsDTO item, String itemId) {
        this.item = item;
        this.itemId = itemId;
    }

    public EnemyItemContentsDTO getItem() {
        return item;
    }

    public void setItem(EnemyItemContentsDTO item) {
        this.item = item;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
