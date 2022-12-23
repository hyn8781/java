package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String youName = "", meName = "", result = "", retry = "";	
		int youChoice = 0, random = (int)(Math.random() * 3) + 1;
		
		System.out.print("1.가위 2.바위 3.보\n> "); youChoice = sc.nextInt();		
	
		youName = switch(youChoice) {
		case 1 -> "가위";
		case 2 -> "바위";
		case 3 -> "보";		
		default -> "none";
		};		
				
		meName = switch(random) {
		case 1 -> "가위";
		case 2 -> "바위";
		case 3 -> "보";
		default -> "none";
		};
		
		System.out.println("You: " + youName);
		System.out.println("Me: " + meName);
		
		int winlose = youChoice - random;
		
		if(youChoice == random) result = "Fair.";
		else if(winlose == -1 || winlose == 2) result = "You lose.";
		else result = "You win.";
		
		System.out.print("\n" + result);
	}
}