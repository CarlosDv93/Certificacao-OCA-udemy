package simulado1;

public class Pergunta4 {


		public static void main(String[] args) {
			try {
				System.out.print("sa");
				throw new RuntimeException("Erro no array");
			} catch (ArrayIndexOutOfBoundsException t) {
				System.out.print("ve");
				throw t;
			} finally {
				System.out.print("s");
			}
		}


}
