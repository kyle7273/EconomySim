public class main{
	public static void main(String[] args){
		//Todo: Random name generation
		//Finish writing all 2 million entries.
		ponai Ponai1 = doLoadPony(Ponai1 = new ponai(),"Twilight","Sparkle",10,"mare");
		ponai Ponai2 = doLoadPony(Ponai2 = new ponai(),"Rainbow","Dash",10,"mare");
		ponai Ponai3 = doLoadPony(Ponai3 = new ponai(),"Pinkie","Pie",10,"mare");
		ponai Ponai4 = doLoadPony(Ponai4 = new ponai(),"Fluttershy","",10,"mare");
		ponai Ponai5 = doLoadPony(Ponai5 = new ponai(),"Applejack","",10,"mare");
		ponai Ponai6 = doLoadPony(Ponai6 = new ponai(),"Rarity","",10,"mare");
		ponai Ponai7 = doLoadPony(Ponai7 = new ponai(),"Sweetie","Belle",5,"mare");
		ponai Ponai8 = doLoadPony(Ponai8 = new ponai(),"Apple","Bloom",5,"mare");
		ponai Ponai9 = doLoadPony(Ponai9 = new ponai(),"Scootaloo","",5,"mare");
		ponai Ponai10 = doLoadPony(Ponai10 = new ponai(),"Carrot","Top",10,"mare");
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