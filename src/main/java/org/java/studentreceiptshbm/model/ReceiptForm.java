package org.java.studentreceiptshbm.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="receipt")
public class ReceiptForm {
	@Id
	@Column(name="receiptno")
	private int receiptno;
	@Column(name="receiptdate")
	private String receiptdate;
	@Column(name="receiptamount")
	private int receiptamount;
	@ManyToOne
	@JoinColumn(name="sno")
    private StudentForm studentForm;
	
}
