package com.telefonica.schemas.event.jms;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.JsonNode;

public class JmsCloudEvent {

    @JsonAlias(value = "specversion")
    String specVersion;
    @JsonAlias(value = "id")
    String id;
    @JsonAlias(value = "source")
    String source;
    @JsonAlias(value = "type")
    String type;
    @JsonAlias(value = "datacontenttype")
    String dataContentType;
    @JsonAlias(value = "time")
    String time;
    @JsonAlias(value = "data")
    JsonNode data;

    public JmsCloudEvent() {
    }

    public String getSpecVersion() {
        return specVersion;
    }
    public void setSpecVersion(String specVersion) {
        this.specVersion = specVersion;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDataContentType() {
        return dataContentType;
    }
    public void setDataContentType(String dataContentType) {
        this.dataContentType = dataContentType;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public JsonNode getData() {
        return data;
    }
    public void setData(JsonNode data) {
        this.data = data;
    }

}