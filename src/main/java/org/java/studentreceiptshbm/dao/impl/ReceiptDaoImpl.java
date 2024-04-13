package org.java.studentreceiptshbm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.java.studentreceiptshbm.dao.ReceiptDao;
import org.java.studentreceiptshbm.model.ReceiptForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ReceiptDaoImpl implements ReceiptDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ReceiptForm> getReceiptList() {
	Session session =sessionFactory.openSession();
	 Criteria criteria = session.createCriteria(ReceiptForm.class);
	 List<ReceiptForm> receiptList =criteria.list();
		return receiptList;
	}

	@Override
	public ReceiptForm getReceiptByReceiptno(int receiptno) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(ReceiptForm.class);
		Criterion criterion =Restrictions.eq("receiptno",receiptno);
		criteria.add(criterion);
		ReceiptForm  receiptForm = ( ReceiptForm) criteria.uniqueResult();
        return  receiptForm;
		
	}

	@Override
	public void insertReceipt(ReceiptForm receiptForm) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		session.save(receiptForm);
		transaction.commit();
		
	}

	@Override
	public void updateReceipt(ReceiptForm receiptForm) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		session.update(receiptForm);
		transaction.commit();
		
	}

	@Override
	public void deleteReceipt(int receiptno) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		 ReceiptForm receiptForm=session.load(ReceiptForm.class,receiptno);
		 session.delete(receiptForm);
		 transaction.commit();
		
	}

}
