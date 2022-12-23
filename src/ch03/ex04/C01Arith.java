package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		// IO단위는 32bit이고 피연산자간의 데이터타입은 같아야한다
		byte a = 3;
		byte b = 2;
		// 과제: 아래compile error 를 해결하라.
		// byte c 는 건드리지 않는다.
		byte c = (byte)(a + b); 		
		System.out.println(c);
		
		//c = c + 1;
		c++; //데이터타입무시연산가능
		System.out.println(c);
		
		double d = a / (double)b;
		System.out.println(d);
		
		d = 1.0 * a / b;
		System.out.println(d);
		
		// 과제: d 변수에 1.5가 저장되도록 하라.
	}
}
