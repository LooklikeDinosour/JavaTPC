package tpc;

import kr.bit.Animal;
import kr.bit.Cat;
import kr.bit.Dog;

public class TPC19 {
	
	public static void main(String[] args) {
		
	// Dog, Cat --> Animal
	
	Dog d = new Dog();
	d.eat();
	
	Cat	c = new Cat();
	c.eat();
	
	//Dog.java(X), Dog class(o)
	//Dog dd = new Dog(),
	
	//Animal <---[Dog.class, Cat.class]
	//Dog dd = new Dog();
	//dd.eat();
	Animal ani = new Dog();
	ani.eat();
	
	ani = new Cat();
	ani.eat();
	
	
	
	}
}
