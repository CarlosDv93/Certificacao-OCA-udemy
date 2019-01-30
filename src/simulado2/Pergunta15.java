package simulado2;

public class Pergunta15 {

	public void boot() {
		try {
			System.out.print("Storage initialization ");
			throw new Exception();
		} catch (Exception e) {
			System.out.print("Faulty data ");
			System.exit(0);
		} finally {
			System.out.print("Shutting down ");
		}
	}
    public static void main(String... pills) {
    	new Pergunta15().boot();
    }
	
}
