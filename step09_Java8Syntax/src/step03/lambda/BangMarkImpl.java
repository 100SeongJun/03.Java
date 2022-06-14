package step03.lambda;

public class BangMarkImpl implements BangMark { // Impl : 인터페이스 구현체
	@Override
	public void addBangMark(String str1, String str2) {
		System.out.println(str1 + str2 + "!");
	}

}
