package simulado1;

/**
 * Pergunta 28: Qual o resultado do seguinte trecho de código ?
 * 
 * int i = 0; do { do { i++; } while (i > 4); } while(1 == 1);
 * System.out.print(i);
 * 
 * @author carlos.arcos
 *
 */
public class Pergunta28 {

	public static void main(String[] args) {

		int i = 0;
		do {
			do {
				i++;
			} while (i > 4);
		} while (1 == 1);
		
		//System.out.print(i);
	}
}
