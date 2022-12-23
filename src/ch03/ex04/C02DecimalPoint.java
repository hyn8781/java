package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = (int)(pi * 10) / 10.0; // 소수점 첫번째 자리까지 표현방법
		
		shortPi = (int)(pi*1000) / 1000.0; // 과제1: pi 값을 소수점 이하 세자로 조정하라.		
		shortPi = Math.round(pi * 1000) / 1000.0; // 과제2: pi 값을 반올림해서, 소수점 이하 세자로 조정하라.
		
		System.out.print(shortPi);
	}
}