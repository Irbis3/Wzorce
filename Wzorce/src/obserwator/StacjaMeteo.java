package obserwator;

public class StacjaMeteo {
	public static void main(String[] args) {
		DanePogodowe dane = new DanePogodowe();
		
		@SuppressWarnings("unused")
		WarunkiBieżące warunki = new WarunkiBieżące(dane);
		
		dane.ustawOdczyty(26.6f, 65f, 1013.1f);
		dane.ustawOdczyty(26.6f, 67f, 1013.1f);
	}
}
