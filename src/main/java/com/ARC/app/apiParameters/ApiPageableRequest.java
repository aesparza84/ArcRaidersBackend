package com.ARC.app.apiParameters;


public class ApiPageableRequest {
    private String id;
    private Integer page;
    private Integer limit;
    private String search;
    private String sortOrder;

    public ApiPageableRequest(Builder b){
        this.id = b.id;
        this.page = b.page;
        this.limit = b.limit;
        this.search = b.search;
        this.sortOrder = b.sortOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public static class Builder {
        private String id;
        private Integer page;
        private Integer limit;
        private String search;
        private String sortOrder;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder search(String search) {
            this.search = search;
            return this;
        }

        public Builder sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        public ApiPageableRequest build(){
            return new ApiPageableRequest(this);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null)
                return false;
            if (this == obj)
                return true;

            ApiPageableRequest o = (ApiPageableRequest) obj;

            return this.page == o.page &&
                    this.limit == o.limit &&
                    this.search == o.search &&
                    this.sortOrder == o.sortOrder &&
                    this.id == o.id;

        }
    }
}
