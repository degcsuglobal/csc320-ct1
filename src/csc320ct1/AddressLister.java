package csc320ct1;

public class AddressLister {

	public static void main(String[] args) {
		System.out.println("The following individuals owe library fines in excess of five dollars:\n");
		
		AddressLister.listIndividual("Donald Q. Duck", "123 Outtamy Way", "Walla Walla", "WA", 99362);
		System.out.println("\n");
		AddressLister.listIndividual("Dan Quayle", "4124 Potatoe Drive", "Boise", "ID", 83701);
	}
	
	public static void listIndividual(String name, String street, String city, String state, int zip) {
		System.out.println(name+"\n"+street+"\n"+city+", "+state+" "+zip);
	}

}
