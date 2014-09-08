import java.util.Random;

public class randomnamegen{
	static String[] firstnames = {"Bill","Joe"};
	
	public static String randomFirstName(){
		return firstnames[new Random().nextInt(firstnames.length)];
	}
}