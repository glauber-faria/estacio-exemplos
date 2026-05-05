package collections.list.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListGanha {
	public static void main(String[] args) {
		int tamanho = 100000;

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		// preenchendo
		for (int i = 0; i < tamanho; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}

		// teste ArrayList
		long inicioArray = System.currentTimeMillis();
		for (int i = 0; i < tamanho; i++) {
			arrayList.get(i);
		}
		long fimArray = System.currentTimeMillis();

		// teste LinkedList
		long inicioLinked = System.currentTimeMillis();
		for (int i = 0; i < tamanho; i++) {
			linkedList.get(i);
		}
		long fimLinked = System.currentTimeMillis();

		System.out.println("ArrayList: " + (fimArray - inicioArray) + " ms");
		System.out.println("LinkedList: " + (fimLinked - inicioLinked) + " ms");
	}
}
