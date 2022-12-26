package ch04.ex01;

public class C03If {
	public static void main(String[] args) {		
		int hour = 22;
		
		String bow = "";		
		if(hour < 12) bow = "Good Morning.";
		else if(hour < 18) bow = "Good Afternoon.";
		else if(hour < 21) bow = "Good Evening.";
		else bow = "Good night.";
		
		System.out.println(bow);
	}
}
/*
과제: println()을 한번만 사용하라.
*/