package simulado1;

/**
 * Pergunta 47:
Qual a sa�da do seguinte trecho de c�digo no caso de x ser 1 e y ser 0 ?

try {
    System.out.print(x / y);
} catch (RuntimeException re) {
    System.out.print(x);
} catch (Exception e) {
    System.out.print(y);
} finally {
    System.out.print(x * 2);
}
 * @author carlos.arcos
 *
 */
public class Pergunta47 {
	public static void main(String[] args) {
		int x = 1;int y = 0;
		try {
		    System.out.print(x / y);
		} catch (RuntimeException re) {
		    System.out.print(x);
		} catch (Exception e) {
		    System.out.print(y);
		} finally {
		    System.out.print(x * 2);
		}
	}
}
