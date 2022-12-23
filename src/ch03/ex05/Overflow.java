package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		
		int a = 1_000_000, b = 1_000_000;
		
		long c = a * b; // 데이터타입 int a, b를 곱셈 연산한 순간 오버플로우발생 이후 롱타입 c에 할당해봤자 오버플로우된 결과값이 저장된다.
		System.out.println(c);
		
		c = (long)a*b; // int a는 롱타입으로 "프로모션"되고, int b 역시 롱타입 a와 연산과정에서 프로모션되기때문에 오버플로우X 
		System.out.println(c);
		
		int x = a * b / a; // a * b, b / a에서 좌에서 우방향으로 연산되기때문에 int a * b는 오버플로우O
		System.out.println(x);
		
		x = a / b * a; // 반면에 a / b에서 오버플로우가 되지않은 값을 a와 연산하여 정상적인 값을 얻을수있다.
		System.out.println(x);
	}
}