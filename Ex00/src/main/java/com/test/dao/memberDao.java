package com.test.dao;

import java.util.List;
import java.util.Map;

import com.test.dto.MemberDto;

public interface memberDao {
	int loginCheck(String id, String pw);
	int insert(MemberDto dto);
	List<MemberDto> showAll();
	int delete(String id);
	int update(String id);
	int login(String email, String pw);
	List<MemberDto> userInfo(String userEmail);
	List<MemberDto> findId(String userId, String userNick);

}
