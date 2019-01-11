package simulado1;
/**
 * Pergunta 9:
Qual dos seguintes operadores podem ser utilizados com variáveis booleanas ?

A: ==

B: +

C: --

D: !
E: %

F: <=
 * @author carlos.arcos
 *
 */
public class Pergunta9 {

	public static void main(String[] args) {
		boolean a = true, b = false;
		
		if(a == b) {
			System.out.println(a +"=="+ b);
		}
		if(a + b) {
			System.out.println(a + "+" + b);
		}
		if(a -- b) {
			System.out.println(a +"--"+ b);
		}
		if(!b) {
			System.out.println("!"+ b);
		}
		if(%a) {
			System.out.println("%"+b);
		}
		if(a <= b) {
			System.out.println(a+"<="+b);
		}

	}

}
