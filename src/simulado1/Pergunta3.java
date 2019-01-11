package simulado1;

/**
 * Pergunta 3:
Qual a saída do seguinte trecho de código ?

int i = 0;
if (true || ++i < 0 && i++ > 0)
    System.out.println(i);
 * @author carlos.arcos
 *
 */
public class Pergunta3 {

	public static void main(String[] args) {
		int i = 0;
		if (true || ++i < 0 && i++ > 0)
		    System.out.println(i);
	}
		
}
