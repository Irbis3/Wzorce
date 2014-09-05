package fabryka;

import fabryka.skladniki.FabrykaSkładnikówPizzy;

public class WłoskaSerowaPizza extends Pizza {

	public WłoskaSerowaPizza(FabrykaSkładnikówPizzy fabryka) {
		super(fabryka);	
	}
	
	void przygotowanie() {
		System.out.println("Przygotowanie " + nazwa);
		ser = fabryka.utwórzSer();
		ciasto = fabryka.utwórzCiasto();
		sos = fabryka.utwórzSos();
	}

}