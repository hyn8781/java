package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i = 0;
		int j = ++i;
		System.out.printf("i: %d, j: %d", i, j);
		
		i = 0;
		j = i++;
		System.out.printf("i: %d, j: %d", i, j);
		
	}
}
//비교연산자 불리언 논리연산자의 오퍼랜드는 불리언