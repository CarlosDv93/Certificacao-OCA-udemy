package simulado1;

import java.util.ArrayList;

/**
 * 
 * Pergunta 21:
O que acontece quando atribuímos a um array de String válido a seguinte assinatura ?

v[v.length] = "valor";
 * @author carlos.arcos
 *
 */
public class Pergunta21 {

	public static void main(String[] args) {
	
		String[] v = {"123", "carlos", "David"};
		v[v.length] = "valor";
		
		System.out.println(v);
		
	}

}
