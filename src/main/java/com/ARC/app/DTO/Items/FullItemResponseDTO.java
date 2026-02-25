package com.ARC.app.DTO.Items;

import com.ARC.app.DTO.PageDataDTO;

import java.util.List;

public class FullItemResponseDTO {
    private List<FullItemDTO> data;
    private PageDataDTO pagination;

    public FullItemResponseDTO(){}

    public List<FullItemDTO> getData() {
        return data;
    }

    public void setData(List<FullItemDTO> data) {
        this.data = data;
    }

    public PageDataDTO getPagination() {
        return pagination;
    }

    public void setPagination(PageDataDTO pagination) {
        this.pagination = pagination;
    }
}
