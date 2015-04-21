public class Main3 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		String n = in.nextLine();
		if (n.contains("-"))
			return false;
		else {
			calculaNum(n);
			return true;
		}
	}

	private static void calculaNum(String n) {
		char aux[] = n.toCharArray();
		int total = 0;
		for (int i = 0; i < aux.length; i++) {
			total += (aux[i] - 48);
			if ((i + 1) >= aux.length) {
				System.out.print(aux[i] - 48);
			} else {
				System.out.print((aux[i] - 48) + " + ");
			}
		}
		System.out.println(" = " + total);
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}
