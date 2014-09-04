package metodaSzablonowa;

public class NapojeTest {
	public static void main(String[] args) {
		
		NapójZKofeiną kawa = new Kawa();
		NapójZKofeiną herbata = new Herbata();
		
		System.out.println("\nPrzyrządzam kawę: ");
		kawa.recepturaParzenia();
		
		System.out.println("\nPrzyrządzam herbatę: ");
		herbata.recepturaParzenia();
		
	}

}
