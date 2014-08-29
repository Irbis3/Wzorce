package napoje;

import dekorator.Napój;

public class MocnoPalona extends Napój {

	public MocnoPalona(){
		opis = "Kawa mocno palona";
	}
	@Override
	public double koszt() {
		return 0.89;
	}

}
