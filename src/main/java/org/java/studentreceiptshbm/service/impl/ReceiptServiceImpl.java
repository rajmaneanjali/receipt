package org.java.studentreceiptshbm.service.impl;


import java.util.List;

import org.java.studentreceiptshbm.dao.ReceiptDao;
import org.java.studentreceiptshbm.model.ReceiptForm;
import org.java.studentreceiptshbm.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
@Service
@AllArgsConstructor

public class ReceiptServiceImpl implements ReceiptService{
	@Autowired
	private ReceiptDao receiptDao;

	@Override
	public List<ReceiptForm> getReceiptService() {
		List<ReceiptForm> receiptList= receiptDao.getReceiptList();
		return receiptList;
	}

	@Override
	public ReceiptForm getReceiptByReceiptnoService(int receiptno) {
		ReceiptForm receiptForm	=receiptDao.getReceiptByReceiptno(receiptno);
		return receiptForm;
	}

	@Override
	public void insertReceiptService(ReceiptForm receiptForm) {
		receiptDao.insertReceipt(receiptForm);
		
	}

	@Override
	public void updateReceiptService(ReceiptForm receiptForm) {
		receiptDao.updateReceipt(receiptForm);
		
	}

	@Override
	public void deleteReceiptService(int receiptno) {
		receiptDao.deleteReceipt(receiptno);
		
	}
}
