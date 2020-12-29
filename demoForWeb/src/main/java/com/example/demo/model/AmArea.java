package com.example.demo.model;

public class AmArea {
    private String areaId;

    private String areaParentId;

    private String areaName;

    private String areaCode;

    private Byte areaLevel;

    private Byte areaSeq;

    private Byte areaLeaf;

    private Byte areaState;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(String areaParentId) {
        this.areaParentId = areaParentId == null ? null : areaParentId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public Byte getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(Byte areaLevel) {
        this.areaLevel = areaLevel;
    }

    public Byte getAreaSeq() {
        return areaSeq;
    }

    public void setAreaSeq(Byte areaSeq) {
        this.areaSeq = areaSeq;
    }

    public Byte getAreaLeaf() {
        return areaLeaf;
    }

    public void setAreaLeaf(Byte areaLeaf) {
        this.areaLeaf = areaLeaf;
    }

    public Byte getAreaState() {
        return areaState;
    }

    public void setAreaState(Byte areaState) {
        this.areaState = areaState;
    }
}