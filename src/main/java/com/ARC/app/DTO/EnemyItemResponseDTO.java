package com.ARC.app.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnemyItemResponseDTO {
    private ItemDTO item;

    @JsonProperty("item_id")
    private String itemId;

    public EnemyItemResponseDTO(){}
    public EnemyItemResponseDTO(ItemDTO item, String itemId) {
        this.item = item;
        this.itemId = itemId;
    }

    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
