package com.testest.ex00;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.memberDao;
import com.test.dto.MemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class memberDaoTest {
	@Autowired
	memberDao dao;
	
	@Test
	public void testLoginCheck() throws Exception{
		int result = dao.loginCheck("admin", "1234");
		System.out.println(result);
	}

	

}