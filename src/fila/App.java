package fila;

import dados.Item;

public class App {

	public static void main(String[] args) {
	
		FilaCircular fila = new FilaCircular(10);
		
		
		fila.enfileirar(new Item(15));
		fila.enfileirar(new Item(-30));
		fila.enfileirar(new Item(20));
		
		

		
		System.out.println("Valores da fila:\n" + fila.toString());

	}

}
