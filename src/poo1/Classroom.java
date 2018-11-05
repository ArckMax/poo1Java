package poo1;

public class Classroom {

	public static void main(String[] args) {
		Wilder maxime = new Wilder("Maxime", true);
		Wilder toto = new Wilder("Toto", false);
		
		System.out.println(maxime.whoAmI());
		System.out.println(toto.whoAmI());
	}
}
