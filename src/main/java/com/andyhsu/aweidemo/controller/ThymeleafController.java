package com.andyhsu.aweidemo.controller;

import com.andyhsu.aweidemo.dto.MemberUpdateDto;
import com.andyhsu.aweidemo.model.MemberVO;
import com.andyhsu.aweidemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;


@Controller
public class ThymeleafController {

    @Autowired
    private MemberService memberService;

    // 顯示所有會員資料
    @RequestMapping("/Display")
    public ModelAndView display(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        List<MemberVO> memberVOList = memberService.getAll();
        modelAndView.addObject("members",memberVOList);
        modelAndView.setViewName("Display");
        return modelAndView;
    }

    // 新增會員頁面
    @GetMapping("/addPage")
    public ModelAndView addPage(Model model) {
        model.addAttribute("member", new MemberVO());
        return new ModelAndView("add", "membermodel", model);
    }

    // 新增會員處理
    @PostMapping("/add")
    public ModelAndView add(MemberVO memberVO) {
        memberService.createMember(memberVO);
        return new ModelAndView("redirect:/Display");
    }

    // 更新會員資料頁面
    @GetMapping("/sendmemberId")
    public ModelAndView sendmemberId(HttpServletRequest request, Model model) {
        int memberId = Integer.parseInt(request.getParameter("memberId"));
        MemberVO member = memberService.getMemberById(memberId);
        model.addAttribute("member", member);
        return new ModelAndView("Edit", "membermodel", model);
    }

    @PostMapping("/update")
    public ModelAndView update(@RequestParam("memberId") Integer memberId, @ModelAttribute MemberUpdateDto memberUpdateDto){
        memberService.updateMember(memberId, memberUpdateDto);
        return new ModelAndView("redirect:/Display");
    }

    // 刪除會員
    @GetMapping("/del")
    public ModelAndView delete(@RequestParam("memberId") int memberId) {
        memberService.deleteMemberById(memberId);
        return new ModelAndView("redirect:/Display");
    }
}
