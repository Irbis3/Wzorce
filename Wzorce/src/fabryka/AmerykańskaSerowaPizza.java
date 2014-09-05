package fabryka;

import fabryka.skladniki.FabrykaSkładnikówPizzy;

public class AmerykańskaSerowaPizza extends Pizza {

	public AmerykańskaSerowaPizza(FabrykaSkładnikówPizzy fabryka) {
		super(fabryka);	
	}
	void przygotowanie() {
		System.out.println("Przygotowanie " + nazwa);
		ser = fabryka.utwórzSer();
		ciasto = fabryka.utwórzCiasto();
		sos = fabryka.utwórzSos();
		pepperoni = fabryka.utwórzPepperoni();
	}
	
	void krojenie() {
		System.out.println("krojenie na kwadratowe kawałki");
	}

}
