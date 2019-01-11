package simulado1;

/**
 * interface Run { default void walk() { System.out.print("Walking and
 * running"); } } interface Jog { default void walk() {
 * System.out.print("Walking and jogging"); } } public class Sprint implements
 * Run, Jog { public static void main(String[] args) { new Sprint().walk(); } }
 * 
 * @author carlos.arcos
 *
 */

interface Run {
	default void walk() {
		System.out.print("Walking and running");
	}
}

interface Jog {
	default void walk() {
		System.out.print("Walking and jogging");
	}
}

public class Pergunta65 implements Run, Jog {
	public static void main(String[] args) {
		new Sprint().walk();
	}
}
