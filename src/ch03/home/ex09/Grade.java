package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = 0, // 국어점수
			score2 = 0, // 영어점수
			score3 = 0; // 수학점수
		
		System.out.print("국어: "); score = sc.nextInt();
		System.out.print("영어: "); score2 = sc.nextInt();
		System.out.print("수학: "); score3 = sc.nextInt();

		int total = score + score2 + score3;		
		double average = (total / 3.0); // (int)((total / 3.0) * 10.0) / 10.0;
		char grade = average >= 90 ? 'A' : (score >= 80 ? 'B' : 'C'); // 이거 익히기
		
		System.out.println();
		System.out.println("총점: " + total);
		System.out.printf("평균: %.1f\n", average); // System.out.printf("평균: + %.1f\n", average); 
		System.out.print("학점: " + grade);
	}
}