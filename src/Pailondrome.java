import java.util.*;

public class Maino {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int potitos = scan.nextInt();
		while (potitos != 0) {
			_potitos(potitos);
			potitos = scan.nextInt();
		}
	}

	private static void _potitos(int potitos) {
		TreeSet<String> SI = new TreeSet<String>();
		TreeSet<String> INGREDIENTES = new TreeSet<String>();
		for (int i = 0; i < potitos; i++) {
			String leGusta = scan.next();
			String ingrediente = scan.next();
				while (!ingrediente.equals("FIN")) {
					if (leGusta.equals("SI:")) {
					SI.add(ingrediente);
					}
					INGREDIENTES.add(ingrediente);
					ingrediente = scan.next();
			} 
			
		}
		INGREDIENTES.removeAll(SI);
		StringBuilder stb = new StringBuilder();
		for (String aux : INGREDIENTES)
			stb.append(aux + " ");
		if (stb.length() > 0)
			stb.delete(stb.length() - 1, stb.length());
		String res = stb.toString();
		System.out.println(res);
	}

}

