package com.ARC.app.DTO.Items;

import com.ARC.app.DTO.ARC.EnemyDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemDropByDTO {

    @JsonProperty("arc_id")
    private String arcId;

    private EnemyDTO arc;

    public ItemDropByDTO(){}

    public ItemDropByDTO(String arcId, EnemyDTO arc) {
        this.arcId = arcId;
        this.arc = arc;
    }

    public String getArcId() {
        return arcId;
    }

    public void setArcId(String arcId) {
        this.arcId = arcId;
    }

    public EnemyDTO getArc() {
        return arc;
    }

    public void setArc(EnemyDTO arc) {
        this.arc = arc;
    }
}
