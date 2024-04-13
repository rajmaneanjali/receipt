package org.java.studentreceiptshbm.service;

import java.util.List;

import org.java.studentreceiptshbm.model.ReceiptForm;


public interface ReceiptService {
	List<ReceiptForm> getReceiptService();
	ReceiptForm getReceiptByReceiptnoService(int receiptno);
	void insertReceiptService(ReceiptForm receiptForm);
	void updateReceiptService(ReceiptForm receiptForm);
	void deleteReceiptService(int receiptno);
}
