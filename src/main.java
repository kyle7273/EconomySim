public class main{
	public static void main(String[] args){
		//Todo: Random name generation
		//Finish writing all 2 million entries.
		int randjobid = randomnamegen.randomJobID();
		ponai Ponai1 = doLoadPony(Ponai1 = new ponai(),randomnamegen.randomFirstName(),randomnamegen.randomLastName(),10,"mare",randjobid,1,1,1,randomnamegen.getJobString(randjobid),"Owner");
		//ponai Ponai2 = doLoadPony(Ponai2 = new ponai(),"Rainbow","Dash",10,"mare");
		//ponai Ponai3 = doLoadPony(Ponai3 = new ponai(),"Pinkie","Pie",10,"mare");
		//ponai Ponai4 = doLoadPony(Ponai4 = new ponai(),"Fluttershy","",10,"mare");
		//ponai Ponai5 = doLoadPony(Ponai5 = new ponai(),"Applejack","",10,"mare");
		//ponai Ponai6 = doLoadPony(Ponai6 = new ponai(),"Rarity","",10,"mare");
		//ponai Ponai7 = doLoadPony(Ponai7 = new ponai(),"Sweetie","Belle",5,"mare");
		//ponai Ponai8 = doLoadPony(Ponai8 = new ponai(),"Apple","Bloom",5,"mare");
		//ponai Ponai9 = doLoadPony(Ponai9 = new ponai(),"Scootaloo","",5,"mare");
		//ponai Ponai10 = doLoadPony(Ponai10 = new ponai(),"Carrot","Top",10,"mare");
	}
	
	public static ponai doLoadPony(ponai Ponai, String firstname, String lastname, int age, String gender,int jobID,int jobBuilding,int jobRoom,int jobPositionID,String jobString,String jobPositionString){
		Ponai = new ponai(firstname, lastname, age, gender,jobID,jobBuilding,jobRoom,jobPositionID,jobString,jobPositionString);
		System.out.println("Loaded Ponai: " + Ponai.getFirstName() + " " + Ponai.getLastName() + ", a " + Ponai.getAge() + " year old " + Ponai.getGender() + " working at " + Ponai.getJobString() + " as a " + Ponai.getJobPositionString());
		return Ponai;
	}
}