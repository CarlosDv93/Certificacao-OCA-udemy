package simulado1;

/**
 * Pergunta 39: Qual a sa�da do seguinte trecho de c�digo ?
 * 
 * int x = 0; while (x++ < 10); System.out.println((x > 10 ? "Maior" : "Menor")
 * + "," + x);
 * 
 * @author carlos.arcos
 *
 */
public class Pergunta39 {
	public static void main(String[] args) {

		int x = 0;
		while (x++ < 10);
		System.out.println((x > 10 ? "Maior" : "Menor") + "," + x);
	}
}
