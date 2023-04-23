package io.github.protocol.codec.hc.cse;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StatusEnum {
    UP("UP"),
    DOWN("DOWN");

    private String value;

    StatusEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return value;
    }
}
