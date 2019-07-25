/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *工料机明细
 */

package com.gld.ncs.entity;

import java.math.BigDecimal;

public class LMMDetail {

    private int id;
    private int normitemId;
    private String kind;
    private String code;
    private String name;
    private String type;
    private String unit;
    private BigDecimal NTBudget;
    private BigDecimal budget;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNormitemId() {
        return normitemId;
    }

    public void setNormitemId(int normitemId) {
        this.normitemId = normitemId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getNTBudget() {
        return NTBudget;
    }

    public void setNTBudget(BigDecimal NTBudget) {
        this.NTBudget = NTBudget;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
}
