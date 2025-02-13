package com.ktdsuniversity.edu.do_to_list.bbs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ktdsuniversity.edu.do_to_list.bbs.service.ScheduleService;
import com.ktdsuniversity.edu.do_to_list.bbs.vo.ScheduleVO;
import com.ktdsuniversity.edu.do_to_list.bbs.vo.ScheduleWriteVO;




@Controller
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;
	
	@GetMapping("/post/list")
	public String showListPage(Model model) {
		List<ScheduleVO> scheduleList = scheduleService.showAllSchedule() ;
		model.addAttribute("scheduleList" , scheduleList);
		return "main";
	}
	
	@PostMapping("/post/write")
	public String goWritePage ( ScheduleWriteVO scheduleWriteVO) {
	
		scheduleService.createSchedule(scheduleWriteVO);
		
		return "redirect:/post/list";
	}
	
	@GetMapping("/post/write")
	public String showWritePage() {
		
		return "write";
	}
	
	@GetMapping("/post/done/{id}")
	public String chageState(@PathVariable int id) {
		
		scheduleService.updateState(id);
		
		return "redirect:/post/list";
	}
	
	@GetMapping("/post/remove/{id}")
	public String deleteSchedule(@PathVariable int id) {
		scheduleService.removeSchedule(id);
		return "redirect:/post/list";
	}
	
	
	
}
