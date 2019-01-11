package simulado1;

/**
 * Pergunta 7:
Qual a saída da seguinte aplicação ?

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
