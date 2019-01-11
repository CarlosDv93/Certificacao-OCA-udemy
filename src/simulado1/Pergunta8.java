package simulado1;
 /**
  * Pergunta 8:
Qual a saída da seguinte aplicação ?

package story;
public class BeautyAndTheBeast {
    public static void main (String args[]) {
        int beauty = 10 * (2 +  (3 + 2) / 5);
        int beast = beauty < 5 ? 10 : 25;
        System.out.print(beauty < beast ? "Beast is a Prince" : "Beast is Shrek");
    }
}
  * @author carlos.arcos
  *
  */
public class Pergunta8 {

	public static void main(String[] args) {
		int beauty = 10 * (2 + (3 + 2) / 5);
		int beast = beauty < 5 ? 10 : 25;
		System.out.print(beauty < beast ? "Beast is a Prince" : "Beast is Shrek");

	}

}
