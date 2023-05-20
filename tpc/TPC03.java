package tpc;

import kr.bit.Book;
import kr.bit.PersonVO;
//kr.bit 는 directory

public class TPC03 {
	public static void main(String[] args) {
		
	
	//관계를 이해하라. PDT VS UDDT
	//정수 1개를 저장하기 위한 변수를 선언하시오.
	int a;
	a=10;
	
	// 책 1권을 저장하기 위한 변수를 선언하시오.
	Book b; 
	b = new Book(); 
	b.title = "자바";
	b.price = 15000;
	b.company = "한빛미디어";
	b.page =700;
	
	System.out.println(b); //12c8a2c0 에 데이터가 들어있다.
	//date의 실체를 instance라고 한다. b는 인스턴스변수, 객체변수라고 한다.
	
	System.out.print(b.title);
	System.out.print(b.price);
	System.out.print(b.company);
	System.out.println(b.page);
	
	PersonVO p = new PersonVO();
	
	p.age = 33;
	p.name = "자바";
	p.weight = 68.4F;
	p.height = 180.3F;
	
	System.out.print(p.name+"\t");
	System.out.print(p.age+"\t");
	System.out.print(p.weight+"\t");
	System.out.print(p.height+"\t");
	}
	
}