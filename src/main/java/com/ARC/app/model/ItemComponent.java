package com.ARC.app.model;

import com.ARC.app.model.CompositeKeys.ItemComponentCompositeKey;
import jakarta.persistence.*;

@Entity
@Table(name = "item_components_table")
public class ItemComponent {

    @EmbeddedId
    private ItemComponentCompositeKey id;

    @ManyToOne
    @MapsId("baseItemId")
    @JoinColumn(name = "base_item_id")
    private ItemBase baseItem;

    @ManyToOne
    @MapsId("childItemId")
    @JoinColumn(name = "child_item_id")
    private ItemBase childItem;

    @Column(name = "quantity")
    private Integer quantity;

    public ItemComponent(){}

    public ItemComponent(ItemComponentCompositeKey id, ItemBase baseItem, ItemBase childItem, Integer quantity) {
        this.id = id;
        this.baseItem = baseItem;
        this.childItem = childItem;
        this.quantity = quantity;
    }

    public ItemComponentCompositeKey getId() {
        return id;
    }

    public void setId(ItemComponentCompositeKey id) {
        this.id = id;
    }

    public ItemBase getBaseItem() {
        return baseItem;
    }

    public void setBaseItem(ItemBase baseItem) {
        this.baseItem = baseItem;
    }

    public ItemBase getChildItem() {
        return childItem;
    }

    public void setChildItem(ItemBase child_item_id) {
        this.childItem = child_item_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
