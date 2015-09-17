
public class Animal {
	
	String gender; // 성별 
	
	public Animal() {
		gender = "Not init gender";
	}

	public Animal(String iniGender) {
		gender = iniGender;
	}
	
	public void setGender(String iniGender) {
		gender = iniGender;
	}
	
	public String getGender() {
		return gender;
	}
}
