package simulado1;

import java.util.ArrayList;

/**
 * 
 * Pergunta 21:
O que acontece quando atribu�mos a um array de String v�lido a seguinte assinatura ?

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
