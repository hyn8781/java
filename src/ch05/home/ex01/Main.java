package ch05.home.ex01;

public class Main {
	public static void main(String[] args) {
		Flower flower = new Flower();
		Flower flower2 = new Flower();
		
		flower.flowerName = "창포꽃";		
		flower.petalLength = 7;
		flower.calyxLength = 2;
		
		flower2.flowerName = "코스모스";	
		flower2.petalLength = 4;
		flower2.calyxLength = 1;
		
		System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.", flower.flowerName, flower.petalLength, flower.calyxLength);
		System.out.println();
		System.out.printf("%s는 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.", flower2.flowerName, flower2.petalLength, flower2.calyxLength);
	}
}
/*창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm 입니다.
코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm 입니다.*/