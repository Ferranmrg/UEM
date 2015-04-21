import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int billete = scan.nextInt();
		int persona = scan.nextInt();
		while (casodeprueba(billete, persona)) {
			_ejercicio(billete, persona);
			billete = scan.nextInt();
			persona = scan.nextInt();
		}
	}

	private static void _ejercicio(int billete, int persona) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		for (int i = 0; i < billete; i++) {
			ls.add(scan.nextInt());
		}

		for (int j = 0; j < persona; j++) {
			int total = 0;
			LinkedList<Integer> billetes = new LinkedList<Integer>();
			for (int j2 = j; j2 < ls.size(); j2 += persona) {
				billetes.add(ls.get(j2));
				total += ls.get(j2);
			}
			System.out.print(total + ":");
			for (Integer aux : billetes){
				System.out.print(" "+aux);
			}
			System.out.println("");
		}
		System.out.println("---");
	}

	public static boolean casodeprueba(int billete, int persona) {
		if (billete == 0 && persona == 0)
			return false;
		else
			return true;
	}
}
