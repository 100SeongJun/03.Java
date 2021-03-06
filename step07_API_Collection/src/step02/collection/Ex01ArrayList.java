package step02.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.domain.Student;

public class Ex01ArrayList {

	public static void main(String[] args) {
		ArrayList<Object> arr1 = new ArrayList<Object>();
		arr1.add("Java");
		arr1.add(new Student("Java", 1, "Junior"));
		arr1.add(3);

		// get : 원소의 객체를 반환
//		System.out.println(arr1.get(0));a
		System.out.println(arr1);

		// size
		System.out.println(arr1.size());

		// ?
		System.out.println(((Student) arr1.get(1)).getName());

		// 제네릭 (Generic) :컬렉션 객체 생성 시 , 저장되는 데이터 타입을 지정
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Java");
//		arr2.add(new Student("Java",1,"Junior")); //Error
		arr2.add("C++");
		System.err.println("문자열 길이 : " + arr2.size());
		System.out.println(arr2);
		arr2.remove(0);
		System.out.println("-----");
		System.out.println(arr2);
//		System.out.println(arr2.get(2));
		// remove : 해당 index 객체 삭제

		// 배열에 대한 시간 측정
		long startTime;
		long endTime;
		List arrayList = new ArrayList();
		List ldkList = new LinkedList();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
			arrayList.add(0, i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList 데이터 삽입 시간은 " + (endTime - startTime) + "ms 입니다.");

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			ldkList.add(i);
			ldkList.add(0, i);
		}
		endTime = System.currentTimeMillis();

		System.out.println("LinkedList 데이터 삽입 시간은 " + (endTime - startTime) + "ms 입니다.");
	}

}
