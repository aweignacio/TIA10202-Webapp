package com.andyhsu.aweidemo.dao;

import com.andyhsu.aweidemo.dto.MemberUpdateDto;
import com.andyhsu.aweidemo.model.MemberVO;

import java.util.List;


public interface MemberDao {
    /**
     * 新增一筆會員資料的方法
     * @param memberVO 由前端發送過來的參數
     */
    Integer createMember(MemberVO memberVO);

    /**
     * 藉由會員ID查詢會員的方法
     * @param memberId 要查詢的會員ID
     * @return 返回該會員的相關資料
     */
    MemberVO getMemberById(Integer memberId);

    /**
     * 查詢所有會員的方法
     * @return 返回一個包含所有會員的List
     */
    List<MemberVO> getAll();

    /**
     * 更新某會員ID地址的方法
     *
     */
    Integer updateMember(Integer memberId, MemberUpdateDto memberUpdateDto);

    /**
     * 刪除某會員ID的方法
     * @param memberId 要刪除的會員ID
     *
     */
    Integer deleteMemberById(Integer memberId);
}
