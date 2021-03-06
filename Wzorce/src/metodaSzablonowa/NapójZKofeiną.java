package metodaSzablonowa;

public abstract class NapójZKofeiną {
	
	void recepturaParzenia() {
		gotowanieWody();
		zaparzanie();
		nalewajDoFiliżanki();
		if(czyKlientChceDodatki()) {
			domieszanieDodatków();
		}
	}
	
	abstract void zaparzanie();
	abstract void domieszanieDodatków();
	
	void gotowanieWody() {
		System.out.println("Gotowanie wody");
	}
	
	void nalewajDoFiliżanki() {
		System.out.println("Nalewanie do filiżanki");
	}
	
	boolean czyKlientChceDodatki() {
		return false;
	}
}

