package com.harry.winser.spring.boot.java.biscuit.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class BiscuitDto {

    private final String guid;
    private final String name;
    private final String description;

    @JsonCreator
    public BiscuitDto(@JsonProperty("guid") String guid,
                      @JsonProperty("name") String name,
                      @JsonProperty("description") String description) {
        this.guid = guid;
        this.name = name;
        this.description = description;
    }

    public String getGuid() {
        return guid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiscuitDto that = (BiscuitDto) o;
        return Objects.equals(guid, that.guid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(guid, name, description);
    }

    @Override
    public String toString() {
        return "BiscuitDto{" +
                "guid='" + guid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
