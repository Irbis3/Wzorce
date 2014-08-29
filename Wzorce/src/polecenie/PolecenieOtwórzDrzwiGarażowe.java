package polecenie;

public class PolecenieOtwórzDrzwiGarażowe implements Polecenie {

	DrzwiGarażowe drzwi;
	
	public PolecenieOtwórzDrzwiGarażowe(DrzwiGarażowe drzwi){
		this.drzwi = drzwi;
	}
	@Override
	public void wykonaj() {
		drzwi.doGóry();
	}

}
