package implementacionesPilas;

import java.util.Scanner;

public class ejercicioPIlaGenerica{
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Pila<Integer> pila= new Pila<Integer>();
		
		while(sc.hasNext()) {
			pila.apilar(sc.nextInt());
		}
		
		while(!pila.esVacia()) {
			System.out.println(pila.cima());
			pila.desapilar();
		}
	}
}