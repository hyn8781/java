package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true & true;
		b = (2 > 1) && (2 > 1);
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		
		int x = 0, y = 0;
		b = ++x < 0 && ++y < 0;
		
		x = 0, y = 0;
		b = ++x < 0 & ++y < 0;
		
		x = 0, y = 0;
		b = ++x < 0 || ++y < 0;
		
		//System.out.println(b);
		
		System.out.println("x: %d, y: %d, b: %d", x, y, b);
	}
}
