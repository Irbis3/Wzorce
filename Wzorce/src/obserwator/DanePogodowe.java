package obserwator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
	private ArrayList<Obserwator> obserwatorzy; 
	private float temperatura;
	private float wilgotność;
	private float ciśnienie;
	
	public DanePogodowe() {
		obserwatorzy = new ArrayList<Obserwator>();
	}
	
	public void zarejestrujObserwatora(Obserwator obserwator) {
		obserwatorzy.add(obserwator);
	}
	@Override
	public void usuńObserwatora(Obserwator obserwator) {
		int i = obserwatorzy.indexOf(obserwator);
		if (i >= 0)
			obserwatorzy.remove(i);
	}

	@Override
	public void powiadomObserwatorów() {
		for(int i = 0; i < obserwatorzy.size(); i++) {
			Obserwator obs = obserwatorzy.get(i);
			obs.update(temperatura, wilgotność, ciśnienie);
		}

	}
	
	public void odczytyZmian() {
		powiadomObserwatorów();
	}
	
	public void ustawOdczyty(float t, float w, float c) {
		this.temperatura = t;
		this.wilgotność = w;
		this.ciśnienie = c;
		odczytyZmian();
	}

}
