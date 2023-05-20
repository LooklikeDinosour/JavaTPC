package tpc;

import kr.bit.Animal;
import kr.bit.Cat;
import kr.bit.Dog;

public class TPC20 {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat(); // -> 개처럼 먹다.
		Cat c = new Cat();
		c.eat();
		c.night();
		
		//Dog.class, Cat.class
		Animal ani = new Dog(); // upcating(자동형변환)
		ani.eat(); // -? ->개처럼 먹다.
		
		ani = new Cat();
		ani.eat(); // -? ->고양이 처럼 먹다.
		((Cat)ani).night(); // 밤에 눈에서 빛이난다. --> downcating(강제형변환)
		
	}
}
