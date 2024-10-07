package com.ktdsuniversity.edu.do_to_list.bbs.dao;

import java.util.List;

import com.ktdsuniversity.edu.do_to_list.bbs.vo.ScheduleVO;
import com.ktdsuniversity.edu.do_to_list.bbs.vo.ScheduleWriteVO;

public interface ScheduleDao {

	public int insertSchedule(ScheduleWriteVO scheduleWriteVO);
	
	public int deleteSchedule(int id);
	
	public List<ScheduleVO> selectAllSchedule();
	
	public int updateSchedule(int id);
	
}
