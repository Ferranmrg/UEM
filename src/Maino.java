import java.util.*;

public class Maino {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int potitos = scan.nextInt();
		while (potitos!=0) {
			_potitos(potitos);
			potitos = scan.nextInt();
		}
	}

	private static void _potitos(int potitos) {
		LinkedList<String> SI = new LinkedList<String>();
		LinkedList<String> NO = new LinkedList<String>();
		for (int i = 0; i < potitos; i++) {
			String leGusta = scan.next();
			String ingrediente = scan.next();
			if (leGusta.equals("SI:")) {
				while (!ingrediente.equals("FIN")) {
					SI.add(ingrediente);
					Iterator<String> it = NO.iterator();

					while (it.hasNext()) {
						String helper = (String) it.next();
						if (helper.equals(ingrediente)) {
							it.remove();
						}
					}
					ingrediente = scan.next();
				}
			} else {
				while (!ingrediente.equals("FIN")) {
					boolean inList = false;
					boolean inList2 = false;
					for (String aux : SI) {
						if (aux.equals(ingrediente))
							inList = true;
					}
					for (String aux : NO) {
						if (aux.equals(ingrediente))
							inList2 = true;
					}
					if (!inList && !inList2) {
						NO.add(ingrediente);
					}
					ingrediente = scan.next();
				}
			}
		}
		Collections.sort(NO);
		StringBuilder stb = new StringBuilder();
		for (String aux : NO)
			stb.append(aux + " ");
		if (stb.length() > 0)
			stb.delete(stb.length() - 1, stb.length());
		String res = stb.toString();
		System.out.println(res);
	}


}
