package fabryka.skladniki;


public class AmerykańskaFabrykaSkładnikówPizzy implements
		FabrykaSkładnikówPizzy {

	@Override
	public Ciasto utwórzCiasto() {
		return new GrubeCiasto();
	}

	@Override
	public Sos utwórzSos() {
		return new SosŚliwkowy();
	}

	@Override
	public Ser utwórzSer() {
		return new SerMozzarella();
	}

	@Override
	public Pepperoni utwórzPepperoni() {
		return new PlastryPepperoni();
	}

}
