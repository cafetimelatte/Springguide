package com.test.service;

import java.util.List;
import java.util.Map;

import com.test.dto.MemberDto;

public interface MemberService {
	boolean loginCheck(String id, String pw);
	boolean insertMember(MemberDto dto);
	int login(String email, String pw);
	List<MemberDto>showall();
	int deletMember(String id);
	int updateMember(MemberDto dto);
	List<MemberDto>userInfo(String userEmail);
	List<MemberDto> findId(String userId, String userNick);
	
}
