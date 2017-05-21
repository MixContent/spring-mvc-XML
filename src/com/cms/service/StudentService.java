package com.cms.service;

import com.cms.dao.StudentDAO;
import com.cms.model.StudentModel;

public class StudentService {

	private StudentDAO studentDAO;

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public String saveOp(StudentModel model) {
		studentDAO.saveStudent(model);
		return "RECORD INSERTED SUCCESSFULLY...";

	}

}
