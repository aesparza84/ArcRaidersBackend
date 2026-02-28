package com.ARC.app.model.CompositeKeys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ItemComponentCompositeKey implements Serializable {

    @Column(name = "base_item_id")
    private String baseItemId;

    @Column(name = "child_item_id")
    private String childItemId;

    public ItemComponentCompositeKey(){}
    public ItemComponentCompositeKey(String baseItemId, String childItemId) {
        this.baseItemId = baseItemId;
        this.childItemId = childItemId;
    }

    public String getBaseItemId() {
        return baseItemId;
    }

    public void setBaseItemId(String baseItemId) {
        this.baseItemId = baseItemId;
    }

    public String getChildItemId() {
        return childItemId;
    }

    public void setChildItemId(String childItemId) {
        this.childItemId = childItemId;
    }

    @Override
    public boolean equals(Object obj) {
        ItemComponentCompositeKey c = (ItemComponentCompositeKey) obj;
        if (c == this)
            return true;

        return c.baseItemId.equals(this.baseItemId) &&
                c.childItemId.equals(this.childItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseItemId, childItemId);
    }
}
