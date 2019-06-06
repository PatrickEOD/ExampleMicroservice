package com.exampleMicroservice.crazyCucumberAPI.model.enumTypes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Morale {
    HATE("hate"),
    LOW("low"),
    AVERAGE("average"),
    HIGH("high"),
    BERSERKER("berserker");

    private String value;

    Morale(String value) { this.value = value;}


    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Morale fromValue (String text) {
        for (Morale m : Morale.values()) {
            if (String.valueOf(m.value).equals(text)) {
                return m;
            }
        }
        return null;
    }
}
