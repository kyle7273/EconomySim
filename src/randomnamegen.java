import java.util.Random;

public class randomnamegen{
	static String[] firstnames = {"Spicy","Alpha","Danger","Sesame","Brown","Kocher","Mirror","Trick","Star","Vanilla","Banana","Toota","Lion","Water","Furious","Jet","Clover","Dusty","Poppy","Ham","Auto","Corn"," Toga","Hadron","Snake","Lucky","Old","Rug","Shelf","Jasmin","Riiiiiiiiiiiiidge","Bobbing","Crusty","Foxy","Smooth","Clever","Seal","Fuge","BeeBee","Rambli'","Sweet","Silver","Beer","Uncle","Hollow","Water","Miss","Burnt","Spring","Mick","Spring","Snow","Loose","Sun","Finger","Rubber","Blue","Free","Chipoff","Shoe","Laser","Wacky","Common","Fresh","Razor","Citrus","Bravo","Tongue","Sci","High","Window","Dead","Under","Broken","Man","Shell","Whiplash","Glass","Honeycomb","Calm","Air","Mosh","Dragon","Telltale","Eskimo","Leather","Thunder","Wonderstrike","Rotten","Sappy","Swan.Lava","Trick","Honey","Wild"};
	static String[] lastnames = {"Nachos","Numeric","Zone","Seed","Streak","Pickle","Shine","Shot","Dust","Chip","Bread","Tango","Mane","Ship","Fury","Propelled","Luck","Trails","Seed","Sandwich","Tune","Cob","Toga","Collider","Eyes","Seven","Boot","Burn","Life","Tea","Racer","Apples","Bread","Walk","Jazz","Cog","Deal","State","Gun","Ricky","Tooth","Orange","Belly","Mercy","Bastion","Bottle","Step","Toast","Fling","Fly","Winds","Angel","Cannon","Spot","Lickin'","Glue","Shift","Hat","Block","","Face","Weasel","Denominator","Air","Blade","Squirt","Bravo","Cheek","","Five","Shopper","Air","Suspicion","Arrow","Hands","Shock","","Eye","","Waters","Pressure","Pit","Ball","Heart","Kisses","Jacket","Pressure","","Apple","Story","Song","Flow","Smog","Mustard","Card"};
	
	public static String randomFirstName(){
		return firstnames[new Random().nextInt(firstnames.length)];
	}
	
	public static String randomLastName(){
		return lastnames[new Random().nextInt(lastnames.length)];
	}
}