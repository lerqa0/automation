package org.example.enums;

public enum FormInputs {
    FIRST_NAME("Valeria"),
    LAST_NAME("Popova"),
    USER_EMAIL("popovavaleriaw2111@gmail.com"),
    PHONE_NUMBER("076783043"),
    SUBJECT("un subiect");

    private final String value;

    FormInputs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
