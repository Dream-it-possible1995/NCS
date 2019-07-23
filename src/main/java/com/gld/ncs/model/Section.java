/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *章节列表
 */

package com.gld.ncs.model;

public class Section {

    private int sectionId;
    private int sectionPid;
    private int sectionSid;
    private int normdbId;
    private String sectionName;

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public int getSectionPid() {
        return sectionPid;
    }

    public void setSectionPid(int sectionPid) {
        this.sectionPid = sectionPid;
    }

    public int getSectionSid() {
        return sectionSid;
    }

    public void setSectionSid(int sectionSid) {
        this.sectionSid = sectionSid;
    }

    public int getNormdbId() {
        return normdbId;
    }

    public void setNormdbId(int normdbId) {
        this.normdbId = normdbId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
