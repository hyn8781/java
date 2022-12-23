package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in); 
		
		double a = 0.0;
		
		System.out.print("x: "); a = sc.nextDouble();
		System.out.println(a - a % 1); // 입력받은 data에서 몫을 구하는 방법.
		System.out.println(a % 1); // 입력받은 data에서 소수점 이하의 나머지를 구하는방법.
		System.out.println();
		
		b = a%1
		
		
	}
}   
	/*
	과제: (casting)과 Math API를 사용하지않고,
	%연산자를 이용해서 입력받은 실수값의 소수점 이하를 내림처리하라.
	실수값은 sc.nextDouble() 로 입력한다.
	예시)			
	x: 3.1492
	result = 3.0
	 */