package objetos;

import conectar.Query;

public class Main {

	public static void main(String[] args) {
		Query i = new Query();
		System.out.print(i.selectONG().get(0).getCausa().getNome());

	}

}
