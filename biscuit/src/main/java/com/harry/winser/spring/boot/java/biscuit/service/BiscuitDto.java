package com.harry.winser.spring.boot.java.biscuit.service;

import java.util.Objects;

public class BiscuitDto {

    private final String guid;
    private final String name;
    private final String description;

    public BiscuitDto(String guid, String name, String description) {
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

    public static BiscuitDtoBuilder builder(){
        return new BiscuitDtoBuilder();
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

    public static final class BiscuitDtoBuilder {
        private String guid;
        private String name;
        private String description;

        private BiscuitDtoBuilder() {
        }

        public BiscuitDtoBuilder withGuid(String guid) {
            this.guid = guid;
            return this;
        }

        public BiscuitDtoBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BiscuitDtoBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public BiscuitDto build() {
            return new BiscuitDto(guid, name, description);
        }
    }
}
