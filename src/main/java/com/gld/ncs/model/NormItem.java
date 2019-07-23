/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *定额条目
 */

package com.gld.ncs.model;

import java.math.BigDecimal;

public class NormItem {

    private int normitemId;
    private int sectionId;
    private String normitemCode;
    private String normitemName;
    private String normitemUnit;
    private BigDecimal normitemPriceNotTax;
    private BigDecimal normitemPriceLabor;
    private BigDecimal normitemPNTMaterial;
    private BigDecimal normitemPNTMachine;

    public int getNormitemId() {
        return normitemId;
    }

    public void setNormitemId(int normitemId) {
        this.normitemId = normitemId;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getNormitemCode() {
        return normitemCode;
    }

    public void setNormitemCode(String normitemCode) {
        this.normitemCode = normitemCode;
    }

    public String getNormitemName() {
        return normitemName;
    }

    public void setNormitemName(String normitemName) {
        this.normitemName = normitemName;
    }

    public String getNormitemUnit() {
        return normitemUnit;
    }

    public void setNormitemUnit(String normitemUnit) {
        this.normitemUnit = normitemUnit;
    }

    public BigDecimal getNormitemPriceNotTax() {
        return normitemPriceNotTax;
    }

    public void setNormitemPriceNotTax(BigDecimal normitemPriceNotTax) {
        this.normitemPriceNotTax = normitemPriceNotTax;
    }

    public BigDecimal getNormitemPriceLabor() {
        return normitemPriceLabor;
    }

    public void setNormitemPriceLabor(BigDecimal normitemPriceLabor) {
        this.normitemPriceLabor = normitemPriceLabor;
    }

    public BigDecimal getNormitemPNTMaterial() {
        return normitemPNTMaterial;
    }

    public void setNormitemPNTMaterial(BigDecimal normitemPNTMaterial) {
        this.normitemPNTMaterial = normitemPNTMaterial;
    }

    public BigDecimal getNormitemPNTMachine() {
        return normitemPNTMachine;
    }

    public void setNormitemPNTMachine(BigDecimal normitemPNTMachine) {
        this.normitemPNTMachine = normitemPNTMachine;
    }
}
