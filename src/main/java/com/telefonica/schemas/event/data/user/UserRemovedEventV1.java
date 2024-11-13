package com.telefonica.schemas.event.data.user;

import com.fasterxml.jackson.annotation.JsonAlias;

public class UserRemovedEventV1 {

    public static final String TYPE = "telefonica.event.user.removed.v1";

    @JsonAlias(value = "userId")
    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}
