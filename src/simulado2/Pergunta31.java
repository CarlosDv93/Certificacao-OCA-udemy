package simulado2;

public class Pergunta31 {

	public static void main(String[] args) {
		int hour = 12;
		String dayOfWeek = "saturday";
		String eat = hour > 11 && hour < 14 ? dayOfWeek.equals("monday") ? "Hamburguer" : "Rice" : "Candy";
		System.out.println(eat);
	}

}
