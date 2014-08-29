package dekorator;


public class Mleko extends SkładnikDekorator {

	Napój napój;
	
	public Mleko(Napój napój){
		this.napój = napój;
	
	}

	@Override
	public String pobierzOpis() {
		return napój.pobierzOpis() + ", Mleko";
	}

	@Override
	public double koszt() {
		return napój.koszt() + 0.10;
	}

}
