package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
 public static void main(String[] args) {	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("문자: ");
	 char ch = sc.nextLine().charAt(0);
	 
	 int unicode = ch;	 
	 System.out.printf("%c의 unicode는 %d입니다.", ch, unicode);
 }
}
/* 과제: 입력한 문자의 unicode를 출력하라.
 * String API를 사용치 않는다
 

문자: A
A의 unicode는 65입니다.
*/

