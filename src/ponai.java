public class ponai{
	public String firstname;
	public String lastname;
	public int age;
	public String gender;
	
	public ponai(){
		firstname = "Unnamed";
		lastname = "Unnamed";
		age = 0;
		gender = "mare";
	}
	
	public ponai(String firstname1, String lastname1, int age1, String gender1){
		firstname = firstname1;
		lastname = lastname1;
		age = age1;
		gender = gender1;
	}
	
	public String getFirstName(){
		return firstname;
	}
	
	public String getLastName(){
		return lastname;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getGender(){
		return gender;
	}
}