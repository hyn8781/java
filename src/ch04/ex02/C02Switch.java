package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		/*
		switch(grade) {
		case "gold" -> coupon = "5만원";
		case "silver" -> coupon = "5만원";
		default -> coupon = "1천원";	
		}
		*/
		switch(grade) {
		case "gold", "silver" -> coupon = "5만원";		
		default -> coupon = "1천원";	
		}
		//이항연산자는 좌우 데이터타입이같아야한다
		//마찬가지로 스위치의 기준값과 비교값의 데이터타입이
		//일치해야된다.
		System.out.println(coupon);
	}
}
