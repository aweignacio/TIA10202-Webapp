package com.andyhsu.aweidemo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class MemberUpdateDto implements Serializable {

    @NotNull
    Integer memberLvId = 1;
    Integer staffId;
    @NotNull
    String password;
    @NotNull
    String name;
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
    String lastUpdatedBy;
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

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
