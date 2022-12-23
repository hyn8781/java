package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
		String s = a + b + "";
		System.out.println(s);
		
		s = "" + a + b;
		System.out.println(s);
		
		String dialog = "John said, \"hello\".";
		System.out.println(dialog);
	}
}
