package com.sms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.cms.command.StudentCommand;
import com.cms.model.StudentModel;
import com.cms.service.StudentService;

@SuppressWarnings("deprecation")
public class SMSController extends AbstractCommandController {

	private StudentService StudentService;

	public StudentService getStudentService() {
		return StudentService;
	}

	public void setStudentService(StudentService studentService) {
		StudentService = studentService;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException bindException) throws Exception {

		StudentCommand studentCommand = (StudentCommand) command;

		ModelAndView mav = new ModelAndView();
		StudentModel sm = new StudentModel(studentCommand.getSname(), studentCommand.getScollege(),
				studentCommand.getSphone(), studentCommand.getSemail());
		String message = StudentService.saveOp(sm);
		mav.addObject("studentCommand", studentCommand);
		mav.addObject("message", message);
		mav.setViewName("result");
		return mav;
	}

}
