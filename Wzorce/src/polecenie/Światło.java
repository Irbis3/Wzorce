package polecenie;

public class Światło {
	String pomieszczenie;
	
	public Światło(String pomieszczenie){
		this.pomieszczenie = pomieszczenie;
	}
	
	void włącz(){
		System.out.println(pomieszczenie + "włączam światło");
	}
	
	void wyłącz(){
		System.out.println(pomieszczenie + "wyłączam światło");
	}
}
