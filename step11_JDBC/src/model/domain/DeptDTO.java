package model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeptDTO {
	public DeptDTO() {
		// TODO Auto-generated constructor stub
	}

	private int deptno;
	private String dname;
	private String loc;
}
