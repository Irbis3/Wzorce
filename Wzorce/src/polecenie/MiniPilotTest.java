package polecenie;

public class MiniPilotTest {

	public static void main(String[] args) {
			MiniPilot pilot = new MiniPilot();
			Światło światło = new Światło("gdzieś");
			//DrzwiGarażowe drzwi = new DrzwiGarażowe();
			Polecenie włączŚwiatło = new PolecenieWłączŚwiatło(światło);
			pilot.ustawPolecenie(włączŚwiatło);
			pilot.przyciskZostałNaciśnięty();
			
			
	
		}
	

}
