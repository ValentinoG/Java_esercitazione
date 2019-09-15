package esercizio.uno;

public class Potenza{
	Potenza(int number, int exp){
		this.number=number;
		this.exp=exp;
	}
	private  int number;
	private final int exp;
	public Potenza pow(){
		int result=number;
		for(int i=1; i<exp; i++)
			result*=number;
		System.err.println(result);
		return this;
	}
	public Potenza cambiobase(int number){
		this.number=number;
		return this;
	}
}
