package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too long.";
		};
		
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "i don't know.";}//리턴값인데 실행문쓰는법
		case 2 -> {
			String message = comment + " is good.";
			yield message;
		}
		default -> {yield comment + " is too long";}
		};
		System.out.println(msg);
		
		//yield: keyword X, restricted idneitfier 0
		// keyword? 문법에서 이미찜햇기때문에 베리어블 클래스네임 못씀
		// 하지만 yield는 제한자기때문에 변수로사용가능
		//int yield = 1; OO 키워드아님
		//int switch = 1; XX 키워드라 변수설정 불가
		
	}
}
