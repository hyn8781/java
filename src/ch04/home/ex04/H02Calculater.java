package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		int a = 0;
		int b = 0;
		int result = 0;
		String op = "";
		String tmp = "";
		String errMsg = "input 0 or natural number.";
		
		do {
			do {
				isGood = false; // 초기화
				System.out.print("a: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+"); // 괄호안의 "*"표시는 글자수제한표시로 0글자 이상을 "+"한글자 이상을 의미한다.
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: "); op = sc.nextLine();
				isGood = op.matches("[+-/\\*]"); // regular expression(정규식)에서 "*"는 이미 기능을 가지고있어서 \\를 사용해서 일반문자화 해야한다.
				if(!isGood) System.out.println("input one of them(+, -, *, /)."); 
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			System.out.println("continue(y/n)? ");
		} while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}
/*
과제: 계산기를 만들어라.
연산자는 +, -, *, /이다.
 /는 몫만을 구한다.
input a 와 b는 0 또는 자연수일것.
continue(y/n)? 에서 y 또는 Y 입력시 재수행한다.
User가 다른 대답을 할 시 예외처리로서 입력값을 다시 물어본다.
--
a: 1 
op: +
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op: *
b: 2
2 * 2 = 4
continue(y/n)? n
end.
*/