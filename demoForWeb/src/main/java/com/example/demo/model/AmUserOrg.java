package com.example.demo.model;

public class AmUserOrg extends AmUserOrgKey {
    private Byte userStateId;

    private Byte userInsuredId;

    private String userCreateTime;

    public Byte getUserStateId() {
        return userStateId;
    }

    public void setUserStateId(Byte userStateId) {
        this.userStateId = userStateId;
    }

    public Byte getUserInsuredId() {
        return userInsuredId;
    }

    public void setUserInsuredId(Byte userInsuredId) {
        this.userInsuredId = userInsuredId;
    }

    public String getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(String userCreateTime) {
        this.userCreateTime = userCreateTime == null ? null : userCreateTime.trim();
    }
}