package fabryka;

import fabryka.skladniki.FabrykaSkładnikówPizzy;

public class SerowaPizza extends Pizza {

	public SerowaPizza(FabrykaSkładnikówPizzy fabryka) {
		super(fabryka);	
	}
	
	void przygotowanie() {
		System.out.println("Przygotowanie " + nazwa);
		ser = fabryka.utwórzSer();
		ciasto = fabryka.utwórzCiasto();
		sos = fabryka.utwórzSos();
	}

}
