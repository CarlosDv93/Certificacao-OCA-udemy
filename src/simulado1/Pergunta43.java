package simulado1;

/**
 * Pergunta 43:
Dado o seguinte trecho de c�digo, qual a exce��o que ser� lan�ada ?

final Object e = new Exception();
final Exception data = (RuntimeException) e;
System.out.print(data);
 * @author carlos.arcos
 *
 */
public class Pergunta43 {

	public static void main(String[] args) {
		final Object e = new Exception();
		final Exception data = (RuntimeException) e;
		System.out.print(data);
	}

}
