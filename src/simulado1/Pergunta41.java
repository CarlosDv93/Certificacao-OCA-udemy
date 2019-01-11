package simulado1;

/**
 * Pergunta 41: Qual a saída da execução do seguinte código ?
 * 
 * public class DoIt { public String when = "now"; public DoIt() { when = "right
 * now"; } public void sayIt() { System.out.println(when); } { when = "later"; }
 * public static void main(String args[]) { new DoIt().sayIt(); } }
 * 
 * @author carlos.arcos
 *
 */
public class Pergunta41 {

	public String when = "now";

	public Pergunta41() {
			when = "right now";
		}

	public void sayIt() {
		System.out.println(when);
	}

	{
		when = "later";
	}

	public static void main(String args[]) {
		new Pergunta41().sayIt();
	}

}
