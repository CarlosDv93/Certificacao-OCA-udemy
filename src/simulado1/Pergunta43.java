package simulado1;

/**
 * Pergunta 43:
Dado o seguinte trecho de código, qual a exceção que será lançada ?

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
