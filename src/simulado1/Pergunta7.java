package simulado1;

/**
 * Pergunta 7:
Qual a sa�da da seguinte aplica��o ?

public class Legos {
    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("red");
    	sb.deleteCharAt(0);
    	sb.delete(0, 2);
    	System.out.println(sb);
    }
}
 * @author carlos.arcos
 *
 */
public class Pergunta7 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("red");
		sb.deleteCharAt(0);
		sb.delete(0, 2);
		System.out.println(sb);

	}

}
