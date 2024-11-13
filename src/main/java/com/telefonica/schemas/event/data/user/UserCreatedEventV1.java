package com.telefonica.schemas.event.data.user;

import com.fasterxml.jackson.annotation.JsonAlias;

public class UserCreatedEventV1 {

    public static final String TYPE = "telefonica.event.user.created.v1";

    @JsonAlias(value = "userId")
    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}
