package model.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8832526864025138083L;
	private String name;
	private int grade;
	private transient int studentId;

}
