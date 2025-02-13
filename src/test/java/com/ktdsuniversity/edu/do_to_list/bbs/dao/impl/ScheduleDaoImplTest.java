package com.ktdsuniversity.edu.do_to_list.bbs.dao.impl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;

import com.ktdsuniversity.edu.do_to_list.bbs.dao.ScheduleDao;
import com.ktdsuniversity.edu.do_to_list.bbs.vo.ScheduleWriteVO;

@MybatisTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
@Import(ScheduleDaoImpl.class)
public class ScheduleDaoImplTest {

	@Autowired
	private ScheduleDao scheduleDao;
	
	@Test
	public void testimpl() {
		ScheduleWriteVO scheduleWriteVO = new ScheduleWriteVO();
		
		scheduleWriteVO.setSubject("테스트");
		scheduleWriteVO.setDeadline("1999-11-21");
		
		int insertCount = this.scheduleDao.insertSchedule(scheduleWriteVO);
		assertTrue(insertCount==1);
		System.out.println("insertCount");
	}
}
