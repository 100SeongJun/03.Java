package step04;

public enum Name {
	donghyun("동현"), yeyeong("예영"), doheon("도헌"), minkyu("민규"), yongju("용주"), yunho("윤호"), jeongin("정인"),
	yeongkwang("영광"), hanju("한주"), seongjun("성준"), uijin("의진"), jongheon("종헌"), hyunchae("현채"), yeonghun("영훈"),
	myungyun("명윤");

	private final String name;

	Name(String name) {
		this.name = name;
	}

	String GetName() {
		return name;
	}
}
