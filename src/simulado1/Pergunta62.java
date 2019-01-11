package simulado1;

/**
 * Pergunta 62: Qual o resultado de compilar e rodar a seguinte aplicação ?
 * 
 * package base; class CoreException extends Exception {} public class Bunker {
 * public void fix() throws Exception { try { throw new RuntimeException("Found
 * error"); } catch (RuntimeException e) { throw new CoreException(); } finally
 * { throw new RuntimeException("Found another error"); } } public static void
 * main(String... args) throws Exception { new Bunker().fix(); } }
 * 
 * @author carlos.arcos
 *
 */
public class Pergunta62 {
	public static void main(String... args) throws Exception {
		new Bunker().fix();
	}
}

class CoreException extends Exception {
	private static final long serialVersionUID = 1L;
}

class Bunker {
	@SuppressWarnings("finally")
	public void fix() throws Exception {
		try {
			throw new RuntimeException("Found error");
		} catch (RuntimeException e) {
			throw new CoreException();
		} finally {
			throw new RuntimeException("Found another error");
		}
	}
}
