/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *
 */

package com.gld.ncs.model;

import java.math.BigDecimal;

public class User {

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    private int id;
    private String name;
    private String password;

    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(0.125);
        System.out.println("s"+a);
    }
}
