package strategia;

public class Kaczka {
	LatanieInterfejs latanie;
	KwakanieInterfejs kwakanie;
	
	void wykonajLeć() {
		latanie.leć();
	}
	
	void wykonajKwacz() {
		kwakanie.kwacz();
	}

	public void ustawLatanieInterfejs(LatanieInterfejs latanie) {
		this.latanie = latanie;		
	}
}
