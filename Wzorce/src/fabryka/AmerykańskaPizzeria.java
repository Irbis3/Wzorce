package fabryka;

import fabryka.skladniki.AmerykańskaFabrykaSkładnikówPizzy;
import fabryka.skladniki.FabrykaSkładnikówPizzy;

public class AmerykańskaPizzeria extends Pizzeria {

	@Override
	Pizza utwórzPizza(String type) {
		Pizza pizza = null;
		FabrykaSkładnikówPizzy fabryka = new AmerykańskaFabrykaSkładnikówPizzy();
		if (type.equals("serowa")) {
			pizza = new SerowaPizza(fabryka);
			pizza.ustawNazwe("Amerykańska Pizza Serowa");
		}
		else if (type.equals("mięsna")) {
			pizza = new MięsnaPizza(fabryka);
			pizza.ustawNazwe("Amerykańska Pizza Mięsna");
		}
		return pizza;
	}
	
	void krojenie() {
		System.out.println("Krojenie na 8 kwadratowych kawałków");
	}

}