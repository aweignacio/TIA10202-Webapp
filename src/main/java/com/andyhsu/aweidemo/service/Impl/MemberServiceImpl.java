package com.andyhsu.aweidemo.service.Impl;

import com.andyhsu.aweidemo.dao.MemberDao;
import com.andyhsu.aweidemo.dto.MemberUpdateDto;
import com.andyhsu.aweidemo.model.MemberVO;
import com.andyhsu.aweidemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;
    @Override
    public Integer createMember(MemberVO memberVO) {
       return memberDao.createMember(memberVO);
    }

    @Override
    public MemberVO getMemberById(Integer memberId) {
        return memberDao.getMemberById(memberId);
    }

    @Override
    public List<MemberVO> getAll() {
        return memberDao.getAll();
    }

    @Override
    public Integer updateMember(Integer memberId, MemberUpdateDto memberUpdateDto) {

        return memberDao.updateMember(memberId, memberUpdateDto);
    }

    @Override
    public Integer deleteMemberById(Integer memberId) {
        return memberDao.deleteMemberById(memberId);
    }
}
