package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		
		int day = 2;
		//arrow 옆에 실행문 -> ""; 할당연산자랑 같이쓸때는 리턴값 그리고 스테이트먼트하나니까 세미콜론
		String dayName = switch(day) {
		case 1 -> "sunday";
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "friday";
		case 7 -> "saturday";
		default -> "none";
		};
		
		System.out.println(dayName);
	}
}
