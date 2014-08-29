package polecenie;

public class MiniPilot {
	Polecenie slot;
	
	public MiniPilot(){}
	
	public void ustawPolecenie(Polecenie polecenie){
		slot = polecenie;
	}
	
	public void przyciskZostałNaciśnięty() {
		slot.wykonaj();
	}
}
