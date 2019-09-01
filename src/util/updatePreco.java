package util;

import java.util.function.Consumer;

import entities.Produto;

public class updatePreco  implements Consumer<Produto>{

	@Override
	public void accept(Produto p) {
		//aumenta preco em 10 %
		p.setPreco(p.getPreco()*1.1);
		
	}

	
}
