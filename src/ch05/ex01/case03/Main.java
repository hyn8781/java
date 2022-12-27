package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		
		user.setUserName("최한석");
		user.setAge(12);
		
		user.setUserName("한아름");
		user.setAge(43);
		
		System.out.printf("%s, %d", user.getUserName(), user.getAge());
		
	}
}
