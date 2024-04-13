package org.java.studentreceiptshbm.service;

import java.util.List;

import org.java.studentreceiptshbm.model.StudentForm;

public interface StudentService {
	List<StudentForm> getStudentService();
	StudentForm getStudentBySnoService(int sno);
	void insertStudentService(StudentForm studentForm);
	void updateStudentService(StudentForm studentForm);
	void deleteStudentService(int sno);
	
}
