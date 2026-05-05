package collections.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListGanha {
		public static void main(String[] args) {
			int tamanho = 100000;

			List<Integer> arrayList = new ArrayList<>();
			List<Integer> linkedList = new LinkedList<>();

			// preenchendo
			for (int i = 0; i < tamanho; i++) {
				arrayList.add(i);
				linkedList.add(i);
			}

			// removendo do início (simula fila)

			long inicioArray = System.currentTimeMillis();
			while (!arrayList.isEmpty()) {
				arrayList.remove(0);
			}
			long fimArray = System.currentTimeMillis();

			long inicioLinked = System.currentTimeMillis();
			while (!linkedList.isEmpty()) {
				linkedList.remove(0);
			}
			long fimLinked = System.currentTimeMillis();

			System.out.println("ArrayList: " + (fimArray - inicioArray) + " ms");
			System.out.println("LinkedList: " + (fimLinked - inicioLinked) + " ms");
	}
}
