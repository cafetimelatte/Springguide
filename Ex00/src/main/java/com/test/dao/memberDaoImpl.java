package com.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.dto.MemberDto;

public class memberDaoImpl implements memberDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int loginCheck(String id, String pw) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pw", pw);
		int result = sqlSession.selectOne("com.test.mapper.memberMapper.loginCheck",map);
		return result;
	}

	@Override
	public int insert(MemberDto dto) {	
		return sqlSession.insert("com.test.mapper.memberMapper.insertMember",dto);
	}

	@Override
	public List<MemberDto> showAll() {
		return sqlSession.selectList("com.test.mapper.memberMapper.showAll");
	}

	@Override
	public int delete(String id) {
		int result = sqlSession.delete("com.test.mapper.memberMapper.deleteMember",id);
		return result;
	}

	@Override
	public int update(String id) {
		return sqlSession.update("com.test.mapper.memberMapper.updateMember", id);
	}

	@Override
	public int login(String email, String pw) {
		int state = 0;
		String pwd = null;
		pwd = sqlSession.selectOne("com.test.mapper.memberMapper.login", email);
		if(pwd != null) {
			state = pwd.equals(pw) ? 1 : 0;
			return state;
		}else {
			state = -2;
			return state;
		}
		
	}

	@Override
	public List<MemberDto> userInfo(String userEmail) {
		return sqlSession.selectList("com.test.mapper.memberMapper.userInfo", userEmail);
	}

	@Override
	public List<MemberDto> findId(String userId, String userNick) {
		Map<String, String>find = new HashMap<String, String>();
		find.put("userid", userId);
		find.put("usernick", userNick);
		return sqlSession.selectList("com.test.mapper.memberMapper.findId",find);
	}



}

