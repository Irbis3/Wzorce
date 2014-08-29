package dekorator;

import składnik.*;
import napoje.*;

public class StarCafe {

	public static void main(String[] args) {
		Napój napój = new Espresso();
		System.out.println(napój.pobierzOpis());
		
		napój = new MocnoPalona();
		napój = new Czekolada(napój);
		napój = new Mleko(napój);
		System.out.println(napój.pobierzOpis() + " " + napój.koszt());
		

	}

}
