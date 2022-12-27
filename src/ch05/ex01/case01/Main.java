package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time = new Time();
		Time time2 = new Time();
		
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		System.out.print(time);
		System.out.println(time2.toString()); // 생략된 .toString()을 뭐라고하셨지?
	}
}