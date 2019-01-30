package simulado2;

public class Pergunta37 {

	public static void main(String[] args) {
        int[][] itens = new int[6][6];
        Object[] obj = itens[0];
        ((int) obj)[3] = 3;
        System.out.println(itens[0][3]);
    }
}
