package polecenie;

public class BrakPolecenia implements Polecenie {
	@Override
	public void wykonaj() {
		System.out.println("brak");
	}
}
