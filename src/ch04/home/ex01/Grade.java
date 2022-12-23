package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int score = 0, addgrade = 0, grade = 0;
		char textgrade = 0, textadd = 0; //tenDigit oneDigit
		
		System.out.print("점수: "); score = sc.nextInt();
		
		grade = score / 10;
		addgrade = score % 10;
	
		if(grade >= 9) textgrade = 'A';
		else if(grade >= 8) textgrade = 'B';
		else textgrade = 'C';
		
		if(addgrade >= 8 || addgrade <= 0) textadd = '+';
		else if(addgrade >= 4) textadd = ' ';
		else textadd = '-';
		
		System.out.printf("%c%c", textgrade, textadd);
		
		/*
		if(socre >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigt && oneDigit <4) grade += "-";
		}
		
		System.out.println(grade);
		*/
	}
}
/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B-
80 이상 B-
80 미만 C
--

점수: 100
A+
*/