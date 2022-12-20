package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		
		int a = 1, b = 2, temp = 0;
		
		System.out.printf("%d, %d\n", a, b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("%d, %d\n", a, b);
	}
}
/*
과제: 두 변수의 데이터를 교환하라.
a: 1, b: 2
a: 2, b: 1
*/