public class main{
	public static void main(String[] args){
		//Todo: Finish writing all 2 million entries.
		ponai Ponai1, Ponai2;
		ponai[] PonaiStoreArrayTemp = {Ponai1 = new ponai(), Ponai2 = new ponai()};
		ponai[] PonaiArray = doponaiarray(PonaiStoreArrayTemp);
	}
	
	public static ponai[] doponaiarray(ponai[] PonaiArray){
		ponai[] PonaiTempArray = new ponai[PonaiArray.length];
		for (int i = 0; i < PonaiArray.length; ++i){
			ponai Ponai = PonaiArray[i];
			int randjobid = randomnamegen.randomJobID();
			Ponai = doLoadPony(Ponai = new ponai(),randomnamegen.randomFirstName(),randomnamegen.randomLastName(),10,"mare",randjobid,1,1,1,randomnamegen.getJobString(randjobid),"Owner");
			PonaiTempArray[i] = Ponai;
		}
		return PonaiTempArray;
	}
}