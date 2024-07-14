package com.andyhsu.aweidemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


public class MemberVO implements Serializable {

    Integer memberId;
    @NotNull
    Integer memberLvId = 1;
    Integer staffId;
    @NotNull
    String account;
    @NotNull
    String password;
    @NotNull
    String name;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date birthDt;
    @NotNull
    String phone;
    @NotNull
    String email;
    @NotNull
    Integer cntCode;
    @NotNull
    Integer distCode;
    @NotNull
    String address;
    @NotNull
    Integer accumulate = 0;
    @NotNull
    Integer coinBalance = 0;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date joinDate;
    @NotNull
    Integer noShow = 0;
    String cardHolder;
    String cardNumber;
    Integer cardYY;
    Integer cardMM;
    String cardVerifyCode;
    @NotNull
    Integer status = 1;

    Timestamp blockedTime;
    String blockReason;
    @NotNull
    String createdBy;
    Timestamp dateCreated;
    @NotNull
    String lastUpdatedBy;
    Timestamp lastUpdated;

    public MemberVO() {
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMemberLvId() {
        return memberLvId;
    }

    public void setMemberLvId(Integer memberLvId) {
        this.memberLvId = memberLvId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(Date birthDt) {
        this.birthDt = birthDt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCntCode() {
        return cntCode;
    }

    public void setCntCode(Integer cntCode) {
        this.cntCode = cntCode;
    }

    public Integer getDistCode() {
        return distCode;
    }

    public void setDistCode(Integer distCode) {
        this.distCode = distCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAccumulate() {
        return accumulate;
    }

    public void setAccumulate(Integer accumulate) {
        this.accumulate = accumulate;
    }

    public Integer getCoinBalance() {
        return coinBalance;
    }

    public void setCoinBalance(Integer coinBalance) {
        this.coinBalance = coinBalance;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Integer getNoShow() {
        return noShow;
    }

    public void setNoShow(Integer noShow) {
        this.noShow = noShow;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getCardYY() {
        return cardYY;
    }

    public void setCardYY(Integer cardYY) {
        this.cardYY = cardYY;
    }

    public Integer getCardMM() {
        return cardMM;
    }

    public void setCardMM(Integer cardMM) {
        this.cardMM = cardMM;
    }

    public String getCardVerifyCode() {
        return cardVerifyCode;
    }

    public void setCardVerifyCode(String cardVerifyCode) {
        this.cardVerifyCode = cardVerifyCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getBlockedTime() {
        return blockedTime;
    }

    public void setBlockedTime(Timestamp blockedTime) {
        this.blockedTime = blockedTime;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "memberId=" + memberId +
                ", memberLvId=" + memberLvId +
                ", staffId=" + staffId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthDt=" + birthDt +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", cntCode=" + cntCode +
                ", distCode=" + distCode +
                ", address='" + address + '\'' +
                ", accumulate=" + accumulate +
                ", coinBalance=" + coinBalance +
                ", joinDate=" + joinDate +
                ", noShow=" + noShow +
                ", cardHolder='" + cardHolder + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardYY=" + cardYY +
                ", cardMM=" + cardMM +
                ", cardVerifyCode='" + cardVerifyCode + '\'' +
                ", status=" + status +
                ", blockedTime=" + blockedTime +
                ", blockReason='" + blockReason + '\'' +
                ", createBy='" + createdBy + '\'' +
                ", dateCreated=" + dateCreated +
                ", lastUpdateBy='" + lastUpdatedBy + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
