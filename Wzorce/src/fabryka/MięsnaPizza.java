package fabryka;

import fabryka.skladniki.FabrykaSkładnikówPizzy;

public class MięsnaPizza extends Pizza {

	public MięsnaPizza(FabrykaSkładnikówPizzy fabryka) {
		super(fabryka);	
	}
	void przygotowanie() {
		System.out.println("Przygotowanie " + nazwa);
		ser = fabryka.utwórzSer();
		ciasto = fabryka.utwórzCiasto();
		sos = fabryka.utwórzSos();
		pepperoni = fabryka.utwórzPepperoni();
	}


}
