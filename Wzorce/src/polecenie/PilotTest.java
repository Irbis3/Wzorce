package polecenie;

public class PilotTest {

	public static void main(String[] args) {
		SuperPilot pilot = new SuperPilot();
		
		Światło jadalniaŚwiatło = new Światło ("jadalnia");
		Światło kuchniaŚwiatło = new Światło ("kuchnia");
		WieżaStereo wieżaStereo = new WieżaStereo();
		
		Polecenie jadalniaWłączŚwiatło = new PolecenieWłączŚwiatło(jadalniaŚwiatło);
		Polecenie jadalniaWyłączŚwiatło = new PolecenieWyłączŚwiatło(jadalniaŚwiatło);
		Polecenie kuchniaWłączŚwiatło = new PolecenieWłączŚwiatło(kuchniaŚwiatło);
		Polecenie kuchniaWyłączŚwiatło = new PolecenieWyłączŚwiatło(kuchniaŚwiatło);
		Polecenie wieżaWłączCD = new PolecenieWieżaStereoWłączCD(wieżaStereo);
		
		pilot.ustawPolecenie(0, jadalniaWłączŚwiatło, jadalniaWyłączŚwiatło);
		pilot.ustawPolecenie(1, kuchniaWłączŚwiatło, kuchniaWyłączŚwiatło);
		pilot.ustawPolecenie(2, wieżaWłączCD, new BrakPolecenia());
		
		System.out.println(pilot);
		pilot.wciśniętoPrzyciskWłącz(0);
		pilot.wciśniętoPrzyciskWyłącz(0);
		pilot.wciśniętoPrzyciskWłącz(1);
		pilot.wciśniętoPrzyciskWyłącz(1);
		pilot.wciśniętoPrzyciskWłącz(2);
	}

}
