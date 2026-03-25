package controller;
import model.*;

public class converteController {

	public converteController() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public String decToBin(int decimal) {

	        PilhaInt pilha = new PilhaInt(); // usa sua pilha
	        String binario = "";

	        // empilha os restos
	        while (decimal > 0) {

	            int resto = decimal % 2; // pega resto

	            pilha.push(resto); // empilha

	            decimal = decimal / 2; // divide
	        }

	        // desempilha para formar o binário
	        try {
	            while (!pilha.isEmpty()) {

	                int valor = pilha.pop(); // remove topo

	                binario = binario + valor; // concatena
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        return binario;
	    }
	
	
}
