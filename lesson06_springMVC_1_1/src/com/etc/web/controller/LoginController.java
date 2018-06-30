package com.etc.web.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.etc.web.vo.UserInfo;

@Controller
public class LoginController {


	@RequestMapping("login.action")
	public ModelAndView test1login(String uname, String password) {
		// 打印請求參數列表
		System.out.println("輸入的是" + uname +"@" +password);
		// 創建模型和视图对象
		ModelAndView mav = new ModelAndView();
		// 设置视图名
		mav.setViewName("welcome");
		// 设置数据模型：request.setAttribute();
		mav.addObject("msg", "欢迎光临" + uname);
		
		// 返回视图模型对象
		return mav;
	}

	@RequestMapping("regist.action")
//	http://localhost:8080/lesson06_springMVC_1_1/regist.action?uname=tom&psd=123456&birthday=1991-2-1&sex=1&likes=1&likes=2
//	public ModelAndView test2rgitst(String uname, @RequestParam("psd")String password, Date birthday, String[] likes) {
	public ModelAndView test2rgitst(UserInfo vo, HttpServletRequest req) {
		// 打印請求參數列表
		System.out.println("輸入的是" + vo.getUname()+"@" +vo.getPassword());
		// 創建模型和视图对象
		ModelAndView mav = new ModelAndView();
		// 设置视图名
		mav.setViewName("welcome");
		// 设置数据模型：request.setAttribute();
//		mav.addObject("msg", "欢迎光临" + uname);
		
		// 返回视图模型对象
		return mav;
	}
	
	
}
