package metodaSzablonowa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kawa extends NapójZKofeiną {

	void zaparzanie() {
		System.out.println("Zaparzanie i przesączanie kawy przez filtr ");

	}

	void domieszanieDodatków() {
		System.out.println("Dodawanie cukru i mleka");
	}
	
	public boolean czyKlientChceDodatki() {
		String odpowiedź = pobierzOdpowiedź();
		
		if(odpowiedź.toLowerCase().startsWith("t")) {
			return true;
		}
		else {
			return false;
		}
	}

	private String pobierzOdpowiedź() {
		String odpowiedź = null;
		
		System.out.print("Czy życzy Pan sobie dodania cukru i mleka (t/n)? ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			odpowiedź = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Błąd wejścia-wyjścia");
		}
		if(odpowiedź == null)
			odpowiedź = "nie";
		
		return odpowiedź;
	}

}
