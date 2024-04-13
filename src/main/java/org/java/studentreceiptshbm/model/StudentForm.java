package org.java.studentreceiptshbm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="students")
public class StudentForm {
	@Id
	@Column
	private int sno;
	@Column
	private String sname;
	@Column
	private int age;
	
	
}
