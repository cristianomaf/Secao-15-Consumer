package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		List<Produto>lista = new ArrayList<>();
		
		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));
		//variavel que poderia ser alterada para ser o multiplicado de preco
		
		double factor = 1.1;
		
		//expressao lambda inline
		lista.forEach(p->p.setPreco(p.getPreco()*factor));

		//imprimir lista usando for each
		lista.forEach(System.out::println);
	}

}
