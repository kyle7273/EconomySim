public class cmc{
	//THIS CODE IS FOR RANDOM CRAP TO GO.
	//THIS IS TOTALLY NOT A REFERENCE TO MY LITTLE PONY... NOPE!
	
	public static ponai doLoadPony(ponai Ponai, String firstname, String lastname, int age, String gender,int jobID,int jobBuilding,int jobRoom,int jobPositionID,String jobString,String jobPositionString){
		Ponai = new ponai(firstname, lastname, age, gender,jobID,jobBuilding,jobRoom,jobPositionID,jobString,jobPositionString);
		System.out.println("Loaded Ponai: " + Ponai.getFirstName() + " " + Ponai.getLastName() + ", a " + Ponai.getAge() + " year old " + Ponai.getGender() + " working at " + Ponai.getJobString() + " as a " + Ponai.getJobPositionString());
		return Ponai;
	}
}