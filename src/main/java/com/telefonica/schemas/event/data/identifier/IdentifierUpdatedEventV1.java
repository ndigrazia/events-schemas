package com.telefonica.schemas.event.data.identifier;

import com.fasterxml.jackson.annotation.JsonAlias;

import com.telefonica.schemas.common.Identifier;

public class IdentifierUpdatedEventV1 {

    public static final String TYPE = "telefonica.event.identifier.updated.v1";

    @JsonAlias(value = "userId")
    String userId;

    @JsonAlias(value = "newIdentifier")
    Identifier newIdentifier;
    
    @JsonAlias(value = "oldIdentifier")
    Identifier oldIdentifier;
  
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Identifier getNewIdentifier() {
        return newIdentifier;
    }
    public void setNewIdentifier(Identifier newIdentifier) {
        this.newIdentifier = newIdentifier;
    }

    public Identifier getOldIdentifier() {
        return oldIdentifier;
    }
    public void setOldIdentifier(Identifier oldIdentifier) {
        this.oldIdentifier = oldIdentifier;
    }

}
