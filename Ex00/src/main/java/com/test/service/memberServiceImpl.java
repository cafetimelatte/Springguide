package com.test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.memberDao;
import com.test.dto.MemberDto;

@Service
public class memberServiceImpl implements MemberService {
	@Autowired
	memberDao dao;
	
	@Override
	public boolean loginCheck(String id, String pw) {
		int result = dao.loginCheck(id, pw);
		return result==1;
	}
	
	@Override
	public boolean insertMember(MemberDto dto) {
		int result = dao.insert(dto);
		return result == 1;
	}

	@Override
	public List<MemberDto> showall() {
		List<MemberDto> list = dao.showAll();
		return list;
	}

	@Override
	public int deletMember(String id) {
		int result = dao.delete(id);
		return result;
	}

	@Override
	public int updateMember(MemberDto dto) {
		int result = dao.update(null);
		return result;
	}

	@Override
	public int login(String email, String pw) {
		int result= dao.login(email, pw);

		return result;
//		로그인
//		-2:아이디없음
//		-1:서버오류
//		0:비밀번호틀림
//		1:성공
	}

	@Override
	public List<MemberDto> userInfo(String userEmail) {
		List<MemberDto>list = dao.userInfo(userEmail);
		return list;
	}

	@Override
	public List<MemberDto> findId(String userId, String userNick) {
		List<MemberDto> findList = dao.findId(userId, userNick);
		return findList;
	}



}

