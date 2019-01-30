package simulado2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pergunta17 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);
	}

}
