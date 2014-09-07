public class main{
	public static void main(String[] args){
		//Todo: Random name generation
		//Finish writing all 2 million entries.
		ponai Ponai1 = new ponai();
		ponai Ponai2 = new ponai();
		ponai Ponai3 = new ponai();
		ponai Ponai4 = new ponai();
		ponai Ponai5 = new ponai();
		ponai Ponai6 = new ponai();
		ponai Ponai7 = new ponai();
		ponai Ponai8 = new ponai();
		ponai Ponai9 = new ponai();
		ponai Ponai10 = new ponai();
		doLoadPony(Ponai1,"Twilight","Sparkle",10,"mare");
		doLoadPony(Ponai2,"Rainbow","Dash",10,"mare");
		doLoadPony(Ponai3,"Pinkie","Pie",10,"mare");
		doLoadPony(Ponai4,"Fluttershy","",10,"mare");
		doLoadPony(Ponai5,"Applejack","",10,"mare");
		doLoadPony(Ponai6,"Rarity","",10,"mare");
		doLoadPony(Ponai7,"Sweetie","Belle",5,"mare");
		doLoadPony(Ponai8,"Apple","Bloom",5,"mare");
		doLoadPony(Ponai9,"Scootaloo","",5,"mare");
		doLoadPony(Ponai10,"Carrot","Top",10,"mare");
	}
	
	public static ponai doLoadPony(ponai Ponai, String firstname, String lastname, int age, String gender){
		Ponai = new ponai(firstname, lastname, age, gender);
		System.out.println("Loaded Ponai: " + Ponai.getFirstName() + " " + Ponai.getLastName() + ", a " + Ponai.getAge() + " year old " + Ponai.getGender());
		return Ponai;
	}
}

class ponai{
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