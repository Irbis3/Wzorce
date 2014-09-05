package fabryka;

import fabryka.skladniki.FabrykaSkładnikówPizzy;

public class WłoskaMięsnaPizza extends Pizza {

	public WłoskaMięsnaPizza(FabrykaSkładnikówPizzy fabryka) {
		super(fabryka);	
	}
	
	void przygotowanie() {
		System.out.println("Przygotowanie " + nazwa);
		ser = fabryka.utwórzSer();
		ciasto = fabryka.utwórzCiasto();
		sos = fabryka.utwórzSos();
	}

}
