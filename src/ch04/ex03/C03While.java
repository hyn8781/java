package ch04.ex03;

public class C03While {
	public static void main(String[] args) {
		
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("상한 음식을 뱉다.");
				break;
			}
			
			calorie += food;
		}
		
		System.out.println(calorie + "cal.만큼 먹었습니다.");
	}
}