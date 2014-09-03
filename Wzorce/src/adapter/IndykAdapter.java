package adapter;

public class IndykAdapter implements Kaczka {

	Indyk indyk;
	public IndykAdapter(Indyk indyk) {
		this.indyk = indyk;
	}
	@Override
	public void kwacz() {
		indyk.gulgocz();

	}

	@Override
	public void lataj() {
		for(int i = 0; i < 5; i++) {
			indyk.lataj();
		}

	}

}
