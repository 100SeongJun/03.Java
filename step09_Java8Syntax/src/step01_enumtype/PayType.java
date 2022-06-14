package step01_enumtype;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public enum PayType {
	CARD("카드", Arrays.asList("신용카드", "직불카드")), CASH("현금", Arrays.asList("현장결제", "계좌이체")),
	ETC("기타", Arrays.asList("외상", "쿠폰"));

	// 변화의 가능성이 존재한다면 final을 굳이 안써도 됨
	private String typeCategory;
	private List<String> typeList;

	PayType(String typeCategory, List<String> typeList) {
		this.typeCategory = typeCategory;
		this.typeList = typeList;
	}
}
