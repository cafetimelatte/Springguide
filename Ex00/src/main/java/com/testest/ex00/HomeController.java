package com.testest.ex00;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.dto.MemberDto;
import com.test.service.MemberService;

@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	@RequestMapping(value = "/registerAction")
	public String registerAction(MemberDto dto,HttpServletRequest request) {
		request.setAttribute("msg", "가입되었습니다 로그인해주세요");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
//		memberService.registerMember(new MemberDto(id,name,age));
//		request.setAttribute("member", new MemberDto(id,name,age));
		return "student/result";
	}
	
	@RequestMapping("login")
	public String login() {
		
		return "home";
	}
	
	@RequestMapping("join")
	public String join(HttpServletRequest request) {
		String userEmail = request.getParameter("email");
		String lastEmail = request.getParameter("last_email");
		String userpw = request.getParameter("pw");
		String userNickname = request.getParameter("nick");
		String username = request.getParameter("name");
		String birth = request.getParameter("brith");
		String addr1  = request.getParameter("addr1"), addr2 = request.getParameter("addr2"), addr3 = request.getParameter("addr3");
		System.out.println(userEmail + lastEmail + userpw + userNickname + username + birth + addr1 + addr2 + addr3);
		return "join";
	}
}
