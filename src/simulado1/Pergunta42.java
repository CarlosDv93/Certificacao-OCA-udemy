package simulado1;

import java.util.Arrays;
import java.util.List;

/**
 * Pergunta 42:
Qual a saída do seguinte trecho de código ?

String[] shopping = { "Roupas", "Moveis" };
List<String> shoppingList = Arrays.asList(shopping);
shoppingList.set(0, "Jogos");
System.out.println(shoppingList.contains("Jogos"));
 */
public class Pergunta42 {
	public static void main(String[] args) {
		String[] shopping = { "Roupas", "Moveis" };
		List<String> shoppingList = Arrays.asList(shopping);
		shoppingList.set(0, "Jogos");
		System.out.println(shoppingList.contains("Jogos"));

	}
}
