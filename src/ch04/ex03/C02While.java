package ch04.ex03;

public class C02While {
	public static void main(String[] args) {
		
		int random = 1;
		int pickCnt = 0;
		//반복이멈추는조건은 3의배수를뽑는거니까 반복이 멈추지않는조건은 3의배수를안뽑는것
		while(random % 3 != 0) {
			random = (int)(Math.random() * 100)+1;
			pickCnt++;
		}
		
		System.out.printf("%d회 뽑아서, %d를 찾았습니다.", pickCnt, random);
	}
}
