package simulado2;

public class Pergunta4 {

	public static void main(String[] args) {
        String somebody = new String("me");
        String nobody = somebody;
        System.out.print((somebody==nobody)+" "+(somebody.equals(nobody))+" "+((somebody=="me") ? true : false));
        

    }

}

