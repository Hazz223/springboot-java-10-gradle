package com.harry.winser.spring.boot.java.biscuit.dao;

import java.util.Objects;

public class Biscuit {

    private String guid;
    private String name;
    private String description;

    public Biscuit(String guid, String name, String description) {
        this.guid = guid;
        this.name = name;
        this.description = description;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biscuit biscuit = (Biscuit) o;
        return Objects.equals(guid, biscuit.guid) &&
                Objects.equals(name, biscuit.name) &&
                Objects.equals(description, biscuit.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(guid, name, description);
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "guid='" + guid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
