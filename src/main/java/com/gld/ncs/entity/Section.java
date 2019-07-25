/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *章节列表
 */

package com.gld.ncs.entity;

public class Section {

    private int id;
    private int pid;
    private int sid;
    private int normdbId;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getNormdbId() {
        return normdbId;
    }

    public void setNormdbId(int normdbId) {
        this.normdbId = normdbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
