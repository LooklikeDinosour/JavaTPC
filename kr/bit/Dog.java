package kr.bit;

public class Dog extends Animal {
		//이름, 나이, 종 : 상태정보
	// 상속은 상태정보보다 행위정보측면에서 봐라봐야한다.
	
	//재정의(override)
	public void eat() {
		System.out.println("개처럼 먹다");
	}
}
