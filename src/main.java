public class main{
	public static void main(String[] args){
		//Todo: Finish writing all 2 million entries.
		//Warning: Wall of laggy text.
		ponai Ponai1 = doLoadPonai2(Ponai1 = new ponai());
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