package com.telefonica.schemas.event.data.userIdentifier;

import com.fasterxml.jackson.annotation.JsonAlias;

import com.telefonica.schemas.common.Identifier;

public class UserIdentifierCreatedEventV1 {

    public static final String TYPE = "telefonica.event.user-identifier.created.v1";

    @JsonAlias(value = "userId")
    String userId;

    @JsonAlias(value = "identifier")
    Identifier identifier;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Identifier getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }
  
}
