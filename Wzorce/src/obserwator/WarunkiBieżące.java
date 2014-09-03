package obserwator;

public class WarunkiBieżące implements Obserwator, WyświetlElement {
	private float temperatura;
	private float wilgotność;
	private Podmiot danePogodowe;
	
	public WarunkiBieżące(Podmiot danePogodowe) {
		this.danePogodowe = danePogodowe;
		this.danePogodowe.zarejestrujObserwatora(this);
	}
	
	@Override
	public void wyświetl() {
		System.out.println("Warunki bieżące: " + temperatura + " stopni, oraz " 
				+ wilgotność + "% wilgotności");

	}

	@Override
	public void update(float temperatura, float wilgotność, float ciśnienie) {
		this.temperatura = temperatura;
		this.wilgotność =wilgotność;
		wyświetl();

	}

}
