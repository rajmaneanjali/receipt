package org.java.studentreceiptshbm.service.impl;

import java.util.List;

import org.java.studentreceiptshbm.dao.StudentDao;
import org.java.studentreceiptshbm.model.StudentForm;
import org.java.studentreceiptshbm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;


	@Override
	public List<StudentForm> getStudentService() {
		List<StudentForm> studentList = studentDao.getStudentList();
		return studentList;
	}


	@Override
	public StudentForm getStudentBySnoService(int sno) {
		StudentForm studentForm= studentDao.getStudentBySno(sno);
		return studentForm;
	}


	@Override
	public void insertStudentService(StudentForm studentForm) {
		studentDao.insertStudent(studentForm);
		
	}


	@Override
	public void updateStudentService(StudentForm studentForm) {
		studentDao.updateStudent(studentForm);
	}


	@Override
	public void deleteStudentService(int sno) {
		studentDao.deleteStudent(sno);
		
	}
	
	
}
