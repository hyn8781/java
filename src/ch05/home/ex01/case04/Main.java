package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
//		LocalDate signUpDate = LocalDate.now();
		boolean isGood = false;
		String errorMsg = "";
		
		System.out.print("이름: "); user.userName = sc.nextLine();
		do {
			
		System.out.print("다시 입력해주세요.");
		} while(!isGood);
			
		System.out.print("나이: "); user.age = sc.nextInt();
		System.out.println();
		System.out.println("이름: " + user.getUserName());
		System.out.println("나이: " + user.getAge());
//		System.out.print("가입일 " + user.getSignUpDate());
	}
}
/*
과제: 사용자를 생성하라.
user가 user의 이름, 나이를 입력한다.
app이 user의 가입일을 입력한다. <<메인메서드에만들어라
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/