import java.util.Random;

public class randomnamegen{
	static String[] firstnames = {"Spicy","Alpha","Danger","Sesame","Brown","Kocher","Mirror","Trick","Star","Vanilla","Banana","Toota","Lion","Water","Furious","Jet","Clover","Dusty","Poppy","Ham","Auto","Corn"," Toga","Hadron","Snake","Lucky","Old","Rug","Shelf","Jasmin","Riiiiiiiiiiiiidge","Bobbing","Crusty","Foxy","Smooth","Clever","Seal","Fuge","BeeBee","Rambli'","Sweet","Silver","Beer","Uncle","Hollow","Water","Miss","Burnt","Spring","Mick","Spring","Snow","Loose","Sun","Finger","Rubber","Blue","Free","Chipoff","Shoe","Laser","Wacky","Common","Fresh","Razor","Citrus","Bravo","Tongue","Sci","High","Window","Dead","Under","Broken","Man","Shell","Whiplash","Glass","Honeycomb","Calm","Air","Mosh","Dragon","Telltale","Eskimo","Leather","Thunder","Wonderstrike","Rotten","Sappy","Swan.Lava","Trick","Honey","Wild"};
	
	public static String randomFirstName(){
		return firstnames[new Random().nextInt(firstnames.length)];
	}
}