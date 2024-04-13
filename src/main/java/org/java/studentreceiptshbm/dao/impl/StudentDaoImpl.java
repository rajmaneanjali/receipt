package org.java.studentreceiptshbm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.java.studentreceiptshbm.dao.StudentDao;
import org.java.studentreceiptshbm.model.StudentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<StudentForm> getStudentList() {
		Session session =sessionFactory.openSession();
		 Criteria criteria = session.createCriteria(StudentForm.class);
		 List<StudentForm> studentList = criteria.list();
		return studentList;
	}

	@Override
	public StudentForm getStudentBySno(int sno) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(StudentForm.class);
		Criterion criterion =Restrictions.eq("sno",sno);
		criteria.add(criterion);
		StudentForm  studentForm = (StudentForm) criteria.uniqueResult();
        return  studentForm;
		
	}

	@Override
	public void insertStudent(StudentForm studentForm) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		session.save(studentForm);
		transaction.commit();
		
	}

	@Override
	public void updateStudent(StudentForm studentForm) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		session.update(studentForm);
		transaction.commit();
		
	}

	@Override
	public void deleteStudent(int sno) {
		 Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		 StudentForm studentForm = session.load(StudentForm.class, sno);
		 session.delete(studentForm);
		 transaction.commit();
		
	}
	
	
}
