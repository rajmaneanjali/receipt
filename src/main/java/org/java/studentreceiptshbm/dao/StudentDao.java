
package org.java.studentreceiptshbm.dao;

import java.util.List;

import org.java.studentreceiptshbm.model.StudentForm;

public interface StudentDao {
	List<StudentForm> getStudentList();
	StudentForm getStudentBySno(int sno); 
	void insertStudent (StudentForm studentForm);
	void updateStudent (StudentForm studentForm);
	void deleteStudent (int sno);
}
