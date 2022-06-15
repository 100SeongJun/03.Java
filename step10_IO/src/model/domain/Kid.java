package model.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Kid implements Serializable {
	/**
	 * 
	 */
	// 내부에 오브젝트가 존재한다면 최상위 클래스에 대한 시리어라이저블을 할 수 없다?
	// 인터페이스 / 객체에 대한 오버라이딩 작용?
	private static final long serialVersionUID = 3969910529609330821L;

	public Kid() {
	};

	private String name;
	private int age;
	private transient int personalNumber;
	// 클래스 내부에 Object 객체가 존재한다면 이 클래스는 직렬화가 되지 않음!
}
