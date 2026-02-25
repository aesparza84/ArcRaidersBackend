package com.ARC.app.apiParameters;

public class ApiArcParameters {
    private Boolean includeLoot;
    private ApiPageableRequest pageable;

    public ApiArcParameters(){}
    public ApiArcParameters(Boolean includeLoot, ApiPageableRequest pageable) {
        this.includeLoot = includeLoot;
        this.pageable = pageable;
    }

    public Boolean getIncludeLoot() {
        return includeLoot;
    }

    public void setIncludeLoot(Boolean includeLoot) {
        this.includeLoot = includeLoot;
    }

    public ApiPageableRequest getPageable() {
        return pageable;
    }

    public void setPageable(ApiPageableRequest pageable) {
        this.pageable = pageable;
    }
}
