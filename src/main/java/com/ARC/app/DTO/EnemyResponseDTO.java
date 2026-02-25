package com.ARC.app.DTO;

import java.util.List;

public class EnemyResponseDTO {
    private List<EnemyDTO> data;
    private PageDataDTO pagination;

    public EnemyResponseDTO(){}
    public EnemyResponseDTO(List<EnemyDTO> data, PageDataDTO pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public List<EnemyDTO> getData() {
        return data;
    }

    public void setData(List<EnemyDTO> data) {
        this.data = data;
    }

    public PageDataDTO getPagination() {
        return pagination;
    }

    public void setPagination(PageDataDTO pagination) {
        this.pagination = pagination;
    }
}
