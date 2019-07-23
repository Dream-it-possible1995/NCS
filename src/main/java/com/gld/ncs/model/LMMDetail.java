/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *工料机明细
 */

package com.gld.ncs.model;

import java.math.BigDecimal;

public class LMMDetail {

    private int lmmdetailId;
    private int normitemId;
    private String lmmdetailCode;
    private String lmmdetailName;
    private String lmmdetailType;
    private String lmmdetailUnit;
    private BigDecimal lmmdetailNTBudget;
    private BigDecimal lmmdetailBudget;

    public int getLmmdetailId() {
        return lmmdetailId;
    }

    public void setLmmdetailId(int lmmdetailId) {
        this.lmmdetailId = lmmdetailId;
    }

    public int getNormitemId() {
        return normitemId;
    }

    public void setNormitemId(int normitemId) {
        this.normitemId = normitemId;
    }

    public String getLmmdetailCode() {
        return lmmdetailCode;
    }

    public void setLmmdetailCode(String lmmdetailCode) {
        this.lmmdetailCode = lmmdetailCode;
    }

    public String getLmmdetailName() {
        return lmmdetailName;
    }

    public void setLmmdetailName(String lmmdetailName) {
        this.lmmdetailName = lmmdetailName;
    }

    public String getLmmdetailType() {
        return lmmdetailType;
    }

    public void setLmmdetailType(String lmmdetailType) {
        this.lmmdetailType = lmmdetailType;
    }

    public String getLmmdetailUnit() {
        return lmmdetailUnit;
    }

    public void setLmmdetailUnit(String lmmdetailUnit) {
        this.lmmdetailUnit = lmmdetailUnit;
    }

    public BigDecimal getLmmdetailNTBudget() {
        return lmmdetailNTBudget;
    }

    public void setLmmdetailNTBudget(BigDecimal lmmdetailNTBudget) {
        this.lmmdetailNTBudget = lmmdetailNTBudget;
    }

    public BigDecimal getLmmdetailBudget() {
        return lmmdetailBudget;
    }

    public void setLmmdetailBudget(BigDecimal lmmdetailBudget) {
        this.lmmdetailBudget = lmmdetailBudget;
    }
}
