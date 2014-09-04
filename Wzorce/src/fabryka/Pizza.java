package fabryka;

import fabryka.skladniki.*;

public abstract class Pizza {
	String nazwa;
	Ciasto ciasto;
	Sos sos;
	Ser ser;
	Pepperoni pepperoni;
	FabrykaSkładnikówPizzy fabryka;
	
	public Pizza(FabrykaSkładnikówPizzy fabryka) {
		this.fabryka = fabryka;
	}
	
	abstract void przygotowanie();
	
	void pieczenie() {
		System.out.println("Pieczenie: 25 minut w temperaturze 350 stopni");
	}
	void krojenie() {
		System.out.println("Krojenie na 8 kawałków");
	}
	void pakowanie() {
		System.out.println("Pakowanie w pudełko");
	}
	
	public String pobierzNazwe() {
		return nazwa;
	}
	
	void ustawNazwe(String nazwa) {
		this.nazwa = nazwa;
	}
}
