package com.ktdsuniversity.edu.do_to_list.bbs.vo;

import java.util.List;

public class ScheduleListVO {

	private int listCount;
	private List<ScheduleVO> scheduleList;
	
	public int getListCount() {
		return listCount;
	}
	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	public List<ScheduleVO> getScheduleList() {
		return scheduleList;
	}
	public void setScheduleList(List<ScheduleVO> scheduleList) {
		this.scheduleList = scheduleList;
	}
	
}
