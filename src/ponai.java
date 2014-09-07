public class ponai{
	public String firstname;
	public String lastname;
	public int age;
	public String gender;
	public int jobID;
	public int jobBuilding;
	public int jobRoom;
	public int jobPositionID;
	public String jobString;
	public String jobPositionString;
	
	public ponai(){
		firstname = "Unnamed";
		lastname = "Unnamed";
		age = 0;
		gender = "mare";
	}
	
	public ponai(String firstname1, String lastname1, int age1, String gender1, int jobID1, int jobBuilding1, int jobRoom1, int jobPositionID1, String jobString1, String jobPositionString1){
		firstname = firstname1;
		lastname = lastname1;
		age = age1;
		gender = gender1;
		jobID = jobID1;
		jobBuilding = jobBuilding1;
		jobRoom = jobRoom1;
		jobPositionID = jobPositionID;
		jobString= jobString1;
		jobPositionString = jobPositionString1;
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
	
	public int getJobID(){
		return jobID;
	}
	
	public int getJobBuilding(){
		return jobBuilding;
	}
	
	public int getJobPositionID(){
		return jobPositionID;
	}
	
	public String getJobString(){
		return jobString;
	}
	
	public String getJobPositionString(){
		return jobPositionString;
	}
}