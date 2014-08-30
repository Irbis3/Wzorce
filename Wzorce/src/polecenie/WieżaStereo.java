package polecenie;

public class WieżaStereo {
	
	public void włącz(){
		System.out.println("włączam wieże stereo");
	}
	
	public void wyłącz(){
		System.out.println("wyłączam wieże stereo");
	}
	
	public void ustawCD(){
		System.out.println("ustawiam CD");
	}
	
	public void ustawDVD(){
		System.out.println("ustawiam DVD");
	}
	
	public void ustawRadio(){
		System.out.println("ustawiam Radio");
	}
	
	public void ustawGłośność(int głośność){
		System.out.println("ustawiam głośność na " + głośność);
	}
}
