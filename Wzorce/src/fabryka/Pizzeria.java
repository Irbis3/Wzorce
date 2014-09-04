package fabryka;

public abstract class Pizzeria {
	
	public Pizza zamówPizza(String type) {
		Pizza pizza;
		
		pizza = utwórzPizza(type);
		
		pizza.przygotowanie();
		pizza.pieczenie();
		pizza.krojenie();
		pizza.pakowanie();
		
		return pizza;
	}
	
	abstract Pizza utwórzPizza(String type);
}
