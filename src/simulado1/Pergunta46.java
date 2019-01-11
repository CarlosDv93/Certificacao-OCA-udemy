package simulado1;

/**
 * Pergunta 46: Qual a saída do seguinte trecho de código ?
 * 
 * int a = 0; int b = 20; while (a < 10) { b--; a++; }
 * System.out.println(a+"-"+b);
 * 
 * @author carlos.arcos
 *
 */
public class Pergunta46 {

	public static void main(String[] args) {
		int a = 0;
		int b = 20;
		while (a < 10) {
			b--;
			a++;
		}
		System.out.println(a + "-" + b);
	}

}
