package fabryka;

import fabryka.skladniki.*;

public class WłoskaPizzeria extends Pizzeria {

	@Override
	Pizza utwórzPizza(String type) {
		Pizza pizza = null;
		FabrykaSkładnikówPizzy fabryka = new WłoskaFabrykaSkładnikówPizzy();
		if (type.equals("serowa")) {
			pizza = new WłoskaSerowaPizza(fabryka);
			pizza.ustawNazwe("Włoska Pizza Serowa");
		}
		else if (type.equals("wegetariańska")) {
			pizza = new WłoskaMięsnaPizza(fabryka); 
			pizza.ustawNazwe("Włoska Pizza Mięsna");
		}
		
		return pizza;
	}

}
