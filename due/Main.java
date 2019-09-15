/*
*	Crea un programma per la gestione di un controcorrente gestito dalla classe CC.
*	Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire 
*	il saldo e di effettuare la lista degli ultimi 5 movimenti .
*/



package esercizio.due;

public class Main{
	public static void main(String[] args){
		System.out.println("Gestore Conti Correnti");
		ContiCorrenti oggetto = new ContiCorrenti("Valentino","Gandolfo");
		oggetto.versamento(10);
		oggetto.versamento(50);
		oggetto.versamento(100);
		oggetto.versamento(16);
		oggetto.saldo();
		oggetto.ultimiMovimenti();
		oggetto.prelevamento(5);
		oggetto.prelevamento(10);
		oggetto.prelevamento(45);
		oggetto.prelevamento(18);
		oggetto.saldo();
		oggetto.ultimiMovimenti();
	}
}

class ContiCorrenti{
	private String[] movimenti;
	private int numeroMovimenti;
	private final String name;
	private final String surname;
	private int saldo;
	ContiCorrenti(String name, String surname){
		System.out.println("Creo un nuovo CC intestato a " + name + " " + surname);
		movimenti = new String[100];
		this.name=name;
		this.surname=surname;
		saldo=0;
		numeroMovimenti=0;
	}
	public ContiCorrenti versamento(int somma){
		saldo+=somma;
		movimenti[numeroMovimenti]="+" + somma;
		numeroMovimenti++;
		return this;
	}
	public ContiCorrenti prelevamento(int somma){
		saldo-=somma;
		movimenti[numeroMovimenti]="-" + somma;
		numeroMovimenti++;
		return this;
	}
	public ContiCorrenti ultimiMovimenti(){
		int i=0;
		if(numeroMovimenti>5) i=numeroMovimenti-5;
		for(;i<numeroMovimenti;i++)
			System.out.println(i+" -> "+movimenti[i]);
		return this;
	}
	public ContiCorrenti saldo(){
		System.out.println(saldo);
		return this;
	}
}