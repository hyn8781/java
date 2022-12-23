package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false; // flag variable on off 두가지 상태만나타내는변수
		power = !power; // ! 논리부정연산자 toggle
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}