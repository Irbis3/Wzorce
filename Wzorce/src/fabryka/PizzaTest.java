package fabryka;

public class PizzaTest {

	public static void main(String[] args) {
		WłoskaPizzeria włoska = new WłoskaPizzeria();
		AmerykańskaPizzeria amerykańska = new AmerykańskaPizzeria();
		
		Pizza pizza = włoska.zamówPizza("serowa");
		System.out.println("Eryk zamówił " + pizza.pobierzNazwe() + "\n");
		pizza = amerykańska.zamówPizza("serowa");
		System.out.println("Jazek zamówił " + pizza.pobierzNazwe() + "\n");

	}

}
