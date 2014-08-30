package polecenie;

public class PolecenieWieżaStereoWłączCD implements Polecenie {
	WieżaStereo wieżaStereo;
	public PolecenieWieżaStereoWłączCD(WieżaStereo wieżaStereo){
		this.wieżaStereo = wieżaStereo;
	}
	@Override
	public void wykonaj() {
		wieżaStereo.włącz();
		wieżaStereo.ustawCD();
		wieżaStereo.ustawGłośność(11);
	}

}
