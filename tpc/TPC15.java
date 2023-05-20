package tpc;

import kr.bit.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO("홍길동", 54, "010-4454-4544", "서울");
		// setter method - 필요없다. 생성자를 통한 것이 더 쉽고 간편
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
				
		System.out.println(m.toString());
		
		MemberVO m1 = new MemberVO();
		m1.setName("나길동");
		m1.setAge(20);
		m1.setTel("010-4546-6544");
		m1.setAddr("sd");
		
		System.out.println(m1.getName());
		System.out.println(m1.getAge());
		System.out.println(m1.getTel());
		System.out.println(m1.getAddr());
		
		System.out.println(m.toString());
		System.out.println(m); //-< toString이 생략됨.
	}

}
