package com.example.demo.model;

public class AmOrg {
    private String orgId;

    private String orgParentId;

    private String orgCode;

    private String orgName;

    private Byte orgTypeId;

    private Byte orgStateId;

    private String areaId;

    private String orgAddress;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(String orgParentId) {
        this.orgParentId = orgParentId == null ? null : orgParentId.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Byte getOrgTypeId() {
        return orgTypeId;
    }

    public void setOrgTypeId(Byte orgTypeId) {
        this.orgTypeId = orgTypeId;
    }

    public Byte getOrgStateId() {
        return orgStateId;
    }

    public void setOrgStateId(Byte orgStateId) {
        this.orgStateId = orgStateId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }
}