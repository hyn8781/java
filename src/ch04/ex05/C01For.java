package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		
		for(int i = 0; i < 10; i++)
			System.out.print(i + " ");
		System.out.println();
		
		for(int i = 1; i < 10; i++)
			System.out.print((i - 1) + " ");
		// 과제: 초기값 i = 1 상황에서, 0 이상 9 이하를 출력하라. 결과적으로 프린트()괄호안과 조건문으로 범위를 정할수있다.
		// 초기값은 1~9 프린트에서 1빼니까 전체적인 범위가 줄어듬 그리고 위에 1번더 시행하니 최대값 증가함
	}
}
