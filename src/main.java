public class main{
	public static void main(String[] args){
		//Todo: Finish writing all 2 million entries.
		//Warning: Wall of laggy text.
		ponai Ponai1 = doLoadPonai2(Ponai1 = new ponai());
		ponai Ponai2 = doLoadPonai2(Ponai2 = new ponai());
		ponai Ponai3 = doLoadPonai2(Ponai3 = new ponai());
		ponai Ponai4 = doLoadPonai2(Ponai4 = new ponai());
		ponai Ponai5 = doLoadPonai2(Ponai5 = new ponai());
		ponai Ponai6 = doLoadPonai2(Ponai6 = new ponai());
		ponai Ponai7 = doLoadPonai2(Ponai7 = new ponai());
		ponai Ponai8 = doLoadPonai2(Ponai8 = new ponai());
		ponai Ponai9 = doLoadPonai2(Ponai9 = new ponai());
		ponai Ponai10 = doLoadPonai2(Ponai10 = new ponai());
		ponai Ponai11 = doLoadPonai2(Ponai11 = new ponai());
		ponai Ponai12 = doLoadPonai2(Ponai12 = new ponai());
		ponai Ponai13 = doLoadPonai2(Ponai13 = new ponai());
		ponai Ponai14 = doLoadPonai2(Ponai14 = new ponai());
		ponai Ponai15 = doLoadPonai2(Ponai15 = new ponai());
		ponai Ponai16 = doLoadPonai2(Ponai16 = new ponai());
		ponai Ponai17 = doLoadPonai2(Ponai17 = new ponai());
		ponai Ponai18 = doLoadPonai2(Ponai18 = new ponai());
		ponai Ponai19 = doLoadPonai2(Ponai19 = new ponai());
		ponai Ponai20 = doLoadPonai2(Ponai20 = new ponai());
	}
	
	public static ponai doLoadPony(ponai Ponai, String firstname, String lastname, int age, String gender,int jobID,int jobBuilding,int jobRoom,int jobPositionID,String jobString,String jobPositionString){
		Ponai = new ponai(firstname, lastname, age, gender,jobID,jobBuilding,jobRoom,jobPositionID,jobString,jobPositionString);
		System.out.println("Loaded Ponai: " + Ponai.getFirstName() + " " + Ponai.getLastName() + ", a " + Ponai.getAge() + " year old " + Ponai.getGender() + " working at " + Ponai.getJobString() + " as a " + Ponai.getJobPositionString());
		return Ponai;
	}
	
	public static ponai doLoadPonai2(ponai Ponai){
		int randjobid = randomnamegen.randomJobID();
		Ponai = doLoadPony(Ponai = new ponai(),randomnamegen.randomFirstName(),randomnamegen.randomLastName(),10,"mare",randjobid,1,1,1,randomnamegen.getJobString(randjobid),"Owner");
		return Ponai;
	}
}