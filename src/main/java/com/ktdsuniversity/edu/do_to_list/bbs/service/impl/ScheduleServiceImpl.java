package com.ktdsuniversity.edu.do_to_list.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.do_to_list.bbs.dao.ScheduleDao;
import com.ktdsuniversity.edu.do_to_list.bbs.service.ScheduleService;
import com.ktdsuniversity.edu.do_to_list.bbs.vo.ScheduleListVO;
import com.ktdsuniversity.edu.do_to_list.bbs.vo.ScheduleVO;
import com.ktdsuniversity.edu.do_to_list.bbs.vo.ScheduleWriteVO;

@Service
public class ScheduleServiceImpl implements ScheduleService{

	@Autowired
	private ScheduleDao scheduleDao;
	@Override
	public boolean createSchedule(ScheduleWriteVO  schedulewriteVO){
		
		int insertRow = scheduleDao.insertSchedule(schedulewriteVO);
		
		return insertRow >0;
	}

	@Override
	public boolean removeSchedule(int id) {
		int removeRow = scheduleDao.deleteSchedule(id);
		return removeRow >0;
	}

	@Override
	public boolean updateState(int id) {
	
		int updateRow = scheduleDao.updateSchedule(id);
		
		return updateRow>0;
	}

	@Override
	public List<ScheduleVO> showAllSchedule() {
		
		List<ScheduleVO> scheduleList = scheduleDao.selectAllSchedule();
		
		return scheduleList;
		
	}

	
	
}
