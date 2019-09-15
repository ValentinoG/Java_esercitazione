/*
*	Crea un programma dotato di una classe 'potenza' che implementa 
*	la potenza del 2 dei numeri (interi) associati agli oggetti istanziati 
*	della classe . La classe deve essere dotata di costruttore, di un metodo
*	pow() che stampi a video la potenza del numero associato all'oggetto, e 
*	di un metodo cambiobase() che deve permettere di cambiare base alla potenza da calcolare. 
*/
package esercizio.uno;
public class Main {
	public static void main(String[] args) {
		System.err.println("Calcolo la potenza");
		Potenza oggetto=new Potenza(3,5);
		oggetto.pow();
		oggetto.cambiobase(2).pow().cambiobase(10000).pow();
	}
}