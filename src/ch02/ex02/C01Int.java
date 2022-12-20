package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		
		int x = 10; // decimal
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; // octal 8진수 표기법 숫자 앞에 0
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; // hexa 16진수 표기법 숫자 앞에 0x
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; // 2진수 표기법 숫자 앞에 0b 
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567; // 천 단위 표기법
		System.out.println(x + 1);
		
		double y = 1e1;
		System.out.println(y);
	}
}
