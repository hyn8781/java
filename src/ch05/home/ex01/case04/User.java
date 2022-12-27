package ch05.home.ex01.case04;
import java.time.LocalDate;
public class User {
	String userName;
	int age;
	LocalDate signUpDate;

	public void setUserName(String userName) {
		userName = userName;
	}
	
	public void setAge(int Age) {
			Age = Age;
	}
	
	public void setSignUpDate(LocalDate signUpDate) {
			signUpDate = signUpDate;
	}
		
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public LocalDate getSignUpDate() {
		return signUpDate;
	}
}
