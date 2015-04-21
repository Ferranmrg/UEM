public class Main5 {
	static java.util.Scanner in;

	public static void casosDePrueba() {
		int num = in.nextInt();
		String aux = String.valueOf(num);
		StringBuilder build = new StringBuilder(num);
		build = build.reverse();
		String numReverse = build.toString();
		long foo = Long.parseLong(aux);
		long foo2 = Long.parseLong(numReverse);
		int veces = 0;
		while(!numReverse.equals(num) && foo < 1000000000){
			foo += foo2;
			aux = String.valueOf(foo);
			build = new StringBuilder(num);
			build = build.reverse();
			numReverse = build.toString();
			veces++;
		}
		if(numReverse.equals(num)){
			System.out.println(veces);
		}else{
			System.out.println("Lychrel?");
		}
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++) {
			casosDePrueba();

		}
	}
}
