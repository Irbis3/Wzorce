package adapter;

public class TestowanieKaczki {

	public static void main(String[] args) {
		DzikaKaczka kaczka = new DzikaKaczka();
		
		DzikiIndyk indyk = new DzikiIndyk();
		Kaczka indykAdapter = new IndykAdapter(indyk);
		
		System.out.println("Indyk mowi tak:");
		indyk.gulgocz();
		indyk.lataj();
		
		System.out.println("Kaczka mowi tak:");
		testujęKaczkę(kaczka);
		
		System.out.println("IndykAdapter mowi tak:");
		testujęKaczkę(indykAdapter);
		
		
		
		
		

	}
	
	static void testujęKaczkę(Kaczka kaczka) {
		kaczka.kwacz();
		kaczka.lataj();
	}

}
