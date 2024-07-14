package com.andyhsu.aweidemo.controller;

import com.andyhsu.aweidemo.dto.MemberUpdateDto;
import com.andyhsu.aweidemo.model.MemberVO;
import com.andyhsu.aweidemo.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<MemberVO> creatMember(@RequestBody
                                                @Valid MemberVO memberVO) {
        Integer memberid = memberService.createMember(memberVO);

        return ResponseEntity.status(HttpStatus.CREATED).body(memberVO);
    }

    @GetMapping("/members/{memberId}")
    public ResponseEntity<MemberVO> getMemberId(@PathVariable Integer memberId) {
        MemberVO member = memberService.getMemberById(memberId);

        if (member != null) {
            return ResponseEntity.status(HttpStatus.OK).body(member);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }

    @GetMapping("/members")
    public ResponseEntity<List<MemberVO>> getAll() {
        List<MemberVO> memberList = memberService.getAll();

        if (memberList != null) {
            return ResponseEntity.status(HttpStatus.OK).body(memberList);
        } else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping("/members/{memberId}")
    public Integer updateMember(@PathVariable Integer memberId,
                                @RequestBody @Valid MemberUpdateDto memberUpdateDto) {
        return memberService.updateMember(memberId, memberUpdateDto);

    }
    @DeleteMapping("/members/{memberId}")
    public Integer deleteMemberById(@PathVariable Integer memberId){
        return memberService.deleteMemberById(memberId);
    }
}
