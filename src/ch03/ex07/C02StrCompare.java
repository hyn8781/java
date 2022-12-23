package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; //상수로 스트링만듬
		b = s == "a";
		
		s = new String("a");		// 뉴스트링으로 만듬
		System.out.println(s);
		b = s == "a";
		
		b = s.equals("a"); // 논리적 참 거짓 비교 API
		
		System.out.println(b);
		// 스트링타입 데이터 만드는법 2가지 new String으로
		// 메서드콜
	}
}
