package składnik;

import dekorator.Napój;
import dekorator.SkładnikDekorator;

public class Czekolada extends SkładnikDekorator {
	Napój napój;
	
	public Czekolada(Napój napój){
		this.napój = napój;
	
	}

	@Override
	public String pobierzOpis() {
		return napój.pobierzOpis() + ", Czekolada";
	}

	@Override
	public double koszt() {
		return napój.koszt() + 0.20;
	}

}
