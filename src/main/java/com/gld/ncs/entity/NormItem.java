/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *定额条目
 */

package com.gld.ncs.entity;

import java.math.BigDecimal;

public class NormItem {

    private int id;
    private int sectionId;
    private String code;
    private String name;
    private String unit;
    private BigDecimal priceNotTax;
    private BigDecimal priceLabor;
    private BigDecimal PNTMaterial;
    private BigDecimal PNTMachine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPriceNotTax() {
        return priceNotTax;
    }

    public void setPriceNotTax(BigDecimal priceNotTax) {
        this.priceNotTax = priceNotTax;
    }

    public BigDecimal getPriceLabor() {
        return priceLabor;
    }

    public void setPriceLabor(BigDecimal priceLabor) {
        this.priceLabor = priceLabor;
    }

    public BigDecimal getPNTMaterial() {
        return PNTMaterial;
    }

    public void setPNTMaterial(BigDecimal PNTMaterial) {
        this.PNTMaterial = PNTMaterial;
    }

    public BigDecimal getPNTMachine() {
        return PNTMachine;
    }

    public void setPNTMachine(BigDecimal PNTMachine) {
        this.PNTMachine = PNTMachine;
    }
}
