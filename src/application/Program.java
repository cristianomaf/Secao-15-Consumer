package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import util.updatePreco;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		List<Produto>lista = new ArrayList<>();
		
		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));
		
		//percorre a lista passando o metodo de aumento de preco
		lista.forEach(new updatePreco());

		//imprimir lista usando for each
		lista.forEach(System.out::println);
	}

}
