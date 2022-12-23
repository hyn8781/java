package ch04.home.ex02;

import java.util.Scanner;

public class H01Coupon {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		String coupon = ""; 
		
		/*
		int grade = 2; grade = sc.nextInt();
		String coupon = "";
		
		switch(grade) {
		case 1 -> coupon = "5만원";
		case 2 -> coupon = "1만원";
		default -> coupon = "1천원";
		*/
		
		if(grade <= 1) coupon = "5만원";
		else if(grade ==2) coupon = "1만원";
		else coupon = "1천원";
		
		System.out.println(coupon);
	}
}

/*
과제: ch04.ex02.C01Switch 를 if로 refactoring 하라.
*/