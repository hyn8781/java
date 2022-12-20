package ch02.ex01;

import javax.print.DocFlavor.STRING;

public class C02Output {
	public static void main(String[] args) {
		
		int score = 100;		
		System.out.println(100);		
		System.out.println(score);
		System.out.println(100+1);
		System.out.println(Math.random());			

		System.out.print(200);
		System.out.print(300);
		System.out.print('\n'); // '\n' = 줄바꿈
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");
		/*
		%b = boolean, %c = char, %d = double, %f = float, %s = String,
		' = 캐릭터 캐릭터는 한개의 문자 " = 스트링 스트링은 여러개의 문자
		*/
		System.out.printf("%b\s%c\s%d\s%f\s%s\n", true,'a',10,1.15,"hello");// \s와 스페이스는 같다.
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n",true,'a',10,1.15,"hello");
		
		String name = "최한석";
		int age = 22;
		
		System.out.printf("%s %d\n", name, age);
		System.out.printf("%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다.");
		// 덧셈기호" + "는 뒤의 피연산자가 숫자일경우에 덧셈으로 피연산자중 문자가 하나라도 있으면 붙이기로 사용된다.
	}
}		
//용어 Snippet