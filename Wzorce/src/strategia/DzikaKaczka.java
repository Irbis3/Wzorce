package strategia;

public class DzikaKaczka extends Kaczka {
	
	public DzikaKaczka() {
		latanie = new LatamBoMamSkrzydła();
		kwakanie = new Kwacz();
	}
	
}
