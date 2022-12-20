package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: "); // presentation logic, IO(Input/Output)
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		
		System.out.println("=> a, b 값을 교체합니다.");
		int temp = 0; // business logic
		temp = a;
		a = b;
		b = temp;
		System.out.printf("=> a: %d, b: %d", a, b);		
	}
}
/*
과제: H01을 확장성 있게 고도화하라.
*/