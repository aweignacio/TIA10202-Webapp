package com.andyhsu.aweidemo.rowmapper;

import com.andyhsu.aweidemo.model.MemberVO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberRowmapper implements RowMapper<MemberVO> {
    @Override
    public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        //將資料庫的數據取出，並將數據轉為java object
        MemberVO member = new MemberVO();
        member.setMemberId(rs.getInt("MEMBERID"));
        member.setMemberLvId(rs.getInt("MEMBERLVID"));
        member.setStaffId(rs.getInt("STAFFID"));
        member.setAccount(rs.getString("ACCOUNT"));
        member.setPassword(rs.getString("PASSWORD"));
        member.setName(rs.getString("NAME"));
        member.setBirthDt(rs.getDate("BIRTHDT"));
        member.setPhone(rs.getString("PHONE"));
        member.setEmail(rs.getString("EMAIL"));
        member.setCntCode(rs.getInt("CNTCODE"));
        member.setDistCode(rs.getInt("DISTCODE"));
        member.setAddress(rs.getString("ADDRESS"));
        member.setAccumulate(rs.getInt("ACCUMULATE"));
        member.setCoinBalance(rs.getInt("COINBALANCE"));
        member.setJoinDate(rs.getDate("JOINDATE"));
        member.setNoShow(rs.getInt("NOSHOW"));
        member.setCardHolder(rs.getString("CARDHOLDER"));
        member.setCardNumber(rs.getString("CARDNUMBER"));
        member.setCardYY(rs.getInt("CARDYY"));
        member.setCardMM(rs.getInt("CARDMM"));
        member.setCardVerifyCode(rs.getString("CARDVERIFYCODE"));
        member.setStatus(rs.getInt("STATUS"));
        member.setBlockedTime(rs.getTimestamp("BLOCKEDTIME"));
        member.setBlockReason(rs.getString("BLOCKEDREASON"));
        member.setCreatedBy(rs.getString("CREATEDBY"));
        member.setDateCreated(rs.getTimestamp("DATECREATED"));
        member.setLastUpdatedBy(rs.getString("LASTUPDATEDBY"));
        member.setLastUpdated(rs.getTimestamp("LASTUPDATED"));
        return member;
    }
}
