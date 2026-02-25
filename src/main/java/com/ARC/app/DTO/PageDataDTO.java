package com.ARC.app.DTO;

public class PageDataDTO {
    private Integer page;
    private Integer limit;
    private Integer total;
    private Integer totalPages;
    private Boolean hasNextPage;
    private Boolean hasPrevPage;

    public PageDataDTO(){}
    public PageDataDTO(Integer page, Integer limit, Integer total, Integer totalPages, Boolean hasNextPage, Boolean hasPrevPage) {
        this.page = page;
        this.limit = limit;
        this.total = total;
        this.totalPages = totalPages;
        this.hasNextPage = hasNextPage;
        this.hasPrevPage = hasPrevPage;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Boolean getHasPrevPage() {
        return hasPrevPage;
    }

    public void setHasPrevPage(Boolean hasPrevPage) {
        this.hasPrevPage = hasPrevPage;
    }
}
