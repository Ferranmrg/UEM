import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static ArrayList<String> Ganador = new ArrayList<String>();
	static ArrayList<String> Perdedor = new ArrayList<String>();
	static ArrayList<String> Equipos = new ArrayList<String>();
	
	public static void main(String[] args) {
		String entrada = in.next();
		while (!casosdeprueba(entrada)) {
			checkNumber();
			ShowResult();
			entrada = in.next();
		}
	}

	private static void ShowResult() {
		String Gan = "";
		int PuntosGanador = 0;
		for(String aux : Equipos){
			int ganadas = 0, perdidas = 0;
			for(String aux2 : Ganador){
				if (aux.equals(aux2))
					ganadas++;
			}
			for(String aux2 : Perdedor){
				if (aux.equals(aux2))
					perdidas++;
			}
			int resultado = (ganadas * 2) + perdidas;
			
			if(PuntosGanador==resultado){
				Gan = "EMPATE";
				PuntosGanador = resultado;
			}else if(PuntosGanador<resultado){
				Gan = aux;
				PuntosGanador = resultado;
			}
		}
		PuntosGanador = 0;
		System.out.print(Gan+" ");
		System.out.println((Equipos.size()*(Equipos.size()-1)) - Ganador.size());
		Ganador.removeAll(Ganador);
		Perdedor.removeAll(Perdedor);
		Equipos.removeAll(Equipos);
		
	}

	private static void checkNumber() {
		String Equipo1 = in.next();
		while (!Equipo1.equals("FIN")) {
			int resEquipo1 = in.nextInt();
			String Equipo2 = in.next();
			int resEquipo2 = in.nextInt();
			if(!Equipos.contains(Equipo1))
				Equipos.add(Equipo1);
			if(!Equipos.contains(Equipo2))
				Equipos.add(Equipo2);
			if (resEquipo1 > resEquipo2) {
				Ganador.add(Equipo1);
				Perdedor.add(Equipo2);
			} else {
				Ganador.add(Equipo2);
				Perdedor.add(Equipo1);
			}
			Equipo1 = in.next();
		}

	}
	
	private static boolean casosdeprueba(String entrada) {
		if (entrada.equals("FIN"))
			return true;
		else
			return false;

	}
}
