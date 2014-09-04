package fabryka.skladniki;


public class WłoskaFabrykaSkładnikówPizzy implements FabrykaSkładnikówPizzy {

	@Override
	public Ciasto utwórzCiasto() {
		return new CienkieKrucheCiasto();
	}

	@Override
	public Sos utwórzSos() {
		return new SosMarinara();
	}

	@Override
	public Ser utwórzSer() {
		return new SerReggiano();
	}

	@Override
	public Pepperoni utwórzPepperoni() {
		return new PlastryPepperoni();
	}

}
