package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		
		int weight = 80;
		int jumpCnt = 0;
		//반복의조건으로 반복의종료의조건이아닌 왜냐 종료시켜야되니까
		//false가 나올때까지 반복 while 
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}
		
		System.out.printf("%d번 줄넘기해서, 몸무게 %dkg이 되었습니다.", jumpCnt, weight);
	}
}
