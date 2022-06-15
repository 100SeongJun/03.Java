package step04;

import java.util.ArrayList;
import java.util.List;

import model.domain.Person;

public class OptionalStreamTest {

	public static void main(String[] args) {
		// Optional
		// empty : 빈 Optional 객체 생성
//		Optional<String> opt1 = Optional.empty();
//		System.out.println(opt1);

		// of(value) : null이 아닌 데이터 생성(null 저장시 NPE)
//		Optional<String> opt2 = Optional.of("Java");
//		System.out.println(opt2);
//		System.out.println(opt2.get());

//		Optional<String> opt3 = Optional.of(null); // 예외 발생
//		System.out.println(opt3);

		// ofNullable : 값이 Null일수도, 아닐수도 있는 경우
//		Optional<String> opt4 = Optional.ofNullable("Java");
//		System.out.println(opt4);
//		
//		Optional<String> opt5 = Optional.ofNullable(null);
//		System.out.println(opt5);

		// ifPresent
//		Optional<String> opt6 = Optional.ofNullable("Java");
//		opt6.ifPresent(v -> System.out.println(v.charAt(0)));

//		Optional<String> opt7 = Optional.ofNullable(null);
//		opt7.ifPresent(v -> System.out.println(v));

		// orElse : 파라미터로 값을 받음
		// orElseGet : 파라미터로 함수형 인터페이스를 받음
//		Optional<String> opt8 = Optional.ofNullable("Java");
//		System.out.println(opt8.orElse("orElse 실행"));
//
//		Optional<String> opt9 = Optional.ofNullable(null);
//		System.out.println(opt9.orElse("orElse 실행"));

		// orElseThrow
//		Optional<String> opt10 = Optional.ofNullable("Java");
//		System.out.println(opt10.orElseThrow(IllegalArgumentException::new));

		// Stream
		// step01 Stream 생성
//		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
//		System.out.println(arr1);
//		Stream<Integer> stream1 = arr1.stream();
//		stream1.forEach(num -> System.out.print(num + " "));
//		System.out.println();
//		// step02 Stream 중개연산
//		// Filter : Stream 내 요소 중 조건에 맞는 것을 선택
//		List<String> arr2 = Arrays.asList("Apple", "Banana", "Melon");
//		arr2.stream().filter(v -> v.contains("A"));
//
//		// Map : Stream 내 요소가 특정 로직을 수행 후 새로운 스트림 반환
//		List<Integer> arr3 = Arrays.asList(1, 2, 3, 4, 5);
//		arr3.stream().map(v -> v + 1);
//
//		// Sorted : 정렬
//		arr3.stream().sorted().forEach(v -> System.out.print(v + " "));
//		System.out.println();
//		arr3.stream().sorted(Comparator.reverseOrder()).forEach(v -> System.out.print(v + " "));
//		System.out.println();
//		; // 역순
//
//		// step03 Stream 최종연산
//		// cnt, max,min,sum,foreach
//		List<Integer> arr4 = Arrays.asList();
//		System.out.println(arr4);
//		arr4.stream().collect(Collectors.toSet()).forEach(v -> System.out.print(v + " "));
//
//		System.out.println();
//		// reduce 누적된 값을 계산
//		System.out.println(arr4.stream().reduce(10, (v1, v2) -> v1 + v2));
//
//		// ex. sorted
//		Arrays.asList("A", "B", "AB", "O").stream().sorted().forEach(System.out::print);
//		System.out.println();
//		// sum 	
//		IntStream.of(1, 2, 3, 4, 5, 6).forEach(System.out::print);

		Person donghyun = new Person("donghyun", "intp");
		Person yeyeong = new Person("yeyeong", "isfj");
		Person doheon = new Person("doheon", "isfj");
		Person minkyu = new Person("minkyu", "enfp");
		Person yongju = new Person("yongju", "estj");
		Person yunho = new Person("yunho", "enfp");
		Person jeongin = new Person("jeongin", "infp");
		Person hanju = new Person("hanju", "isfp");
		Person seongjun = new Person("seongjun", "isfp");
		Person uijin = new Person("uijin", "isfp");
		Person jongheon = new Person("jongheon", "isfj");
		Person hyunchae = new Person("hyunchae", "infj");
		Person yeongkwang = new Person("yeongkwang", "isfp");
		Person yeonghun = new Person("yeonghun", "esfj");
		Person myungyun = new Person("myungyun", "enfj");
//		arr2.stream().filter(v -> v.contains("A"));
//		arr3.stream().map(v -> v + 1);
		List<Person> personList = new ArrayList<Person>();
		personList.add(donghyun);
		personList.add(yeyeong);
		personList.add(doheon);
		personList.add(minkyu);
		personList.add(yongju);
		personList.add(yunho);

		personList.add(jeongin);
		personList.add(hanju);
		personList.add(seongjun);
		personList.add(uijin);
		personList.add(jongheon);
		personList.add(hyunchae);
		personList.add(yeongkwang);
		personList.add(yeonghun);
		personList.add(myungyun);

		personList.stream().filter(person -> person.getMbti().charAt(0) == 'i' && person.getMbti().charAt(3) == 'j')
//				.forEach(System.out::println);
				.forEach(person -> System.out.println(person.getName() + "의 mbti: " + person.getMbti()));
	}
}
