package com.tareq.book.email;

import lombok.Getter;

@Getter
public enum EmailTemplateName {

    ACTIVE_ACCOUNT("active_account");

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
