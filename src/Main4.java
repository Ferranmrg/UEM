public class Main4 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int n = in.nextInt();
		if (n == 0)
			return false;
		else {
			int resul = 0;
			int lleva = 0;
			int aux = 1;
			while (n > 0 && n - aux >= 0) {
				n -= aux;
				resul++;
				aux++;
			}
			lleva = n;
			System.out.println(resul + " " + lleva);
		}
		return true;
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}
