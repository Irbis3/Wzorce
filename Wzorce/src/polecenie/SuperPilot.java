package polecenie;

public class SuperPilot {
	Polecenie[] polecenieWłącz;
	Polecenie[] polecenieWyłącz;
	
	public SuperPilot() {
		polecenieWłącz = new Polecenie[7];
		polecenieWyłącz = new Polecenie[7];
		Polecenie brakPolecenia = new BrakPolecenia();
		for(int i = 0; i < 7; i++){
			polecenieWłącz[i] = brakPolecenia;
			polecenieWyłącz[i] = brakPolecenia;
		}		
	}
	
	public void ustawPolecenie(int slot, Polecenie polecenieWłącz, Polecenie polecenieWyłącz) {
		this.polecenieWłącz[slot] = polecenieWłącz;
		this.polecenieWyłącz[slot] = polecenieWyłącz;
	}
	
	public void wciśniętoPrzyciskWłącz(int slot) {
		polecenieWłącz[slot].wykonaj();
	}
	
	public void wciśniętoPrzyciskWyłącz(int slot) {
		polecenieWyłącz[slot].wykonaj();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n---- SuperPilot ----\n");
		for (int i = 0; i < 7; i++){
			stringBuff.append("[slot " + i + "] " + polecenieWłącz[i].getClass().getName()
					+ "    " + polecenieWyłącz[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
