import java.util.ArrayList;
import java.util.Scanner;

import com.prueba.*;

public class App {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Robot> robots = new ArrayList<Robot>();

		String opc = "";
		do {
			menu();
			opc = scan.nextLine();
			switch (opc) {
			case "1":
				crear(robots);
				System.out.println("has creado " + robots);
				scan.nextLine();
				break;
			case "2":
				destruir(robots);
				System.out.println("has destruído " + robots);
				scan.nextLine();
				break;
			case "3":
				String nombre;
				String tipo;
				System.out.println("¿Qué robot quieres buscar?");
				System.out.println("Nombre:");
				nombre = scan.next();
				System.out.println("tipo:");
				tipo = scan.next();
				buscarRobot(nombre, tipo);
				break;
			case "4":
				System.out.println("Hasta pronto");
				;
				break;
			default:
				System.out.println("OPCIÓN INCORRECTA");
			}
		} while (!opc.equals("4"));

		scan.close();
	}

	public static void menu() {
		System.out.println("***Estamos en un nuevo planeta dominado por robots***");
		System.out.println("-------------------------");
		System.out.println("Elige una opción:\n1.Crear robot\n2.Destruir robot\n3.Buscar robot" + "\n4.Salir");
		System.out.println("-------------------------");
	}

	public static void crear(ArrayList<Robot> robots) {
		String nombre;
		String tipo;
		String color;
		String tamaño;
		Arma arma = null;
		Armadura armadura = null;

		System.out.println("nombre:");
		nombre = scan.next();

		System.out.println("tipo (táctico, protector o hacker):");
		tipo = scan.next();

		System.out.println("color:");
		color = scan.next();

		System.out.println("tamaño (pequeño, mediano o grande): ");
		tamaño = scan.next();
		
		System.out.println("arma (laser, code, acid o map): ");
		tamaño = scan.next();
		
		System.out.println("armadura (escudo, campo magnético o campo invisible): ");
		tamaño = scan.next();

		robots.add(new Robot(nombre, tipo, color, tamaño, arma, armadura));
	}

	public static void destruir(ArrayList<Robot> robots) {
		String nombre;

		System.out.println("nombre del robot:");
		nombre = scan.next();

		robots.removeIf(robot -> robot.getNombre().equals(nombre));

	}

	public static Robot buscarRobot(String nombre, String tipo) {
		ArrayList<Robot> robots = new ArrayList<Robot>();
		Robot resultado = null;
		for (Robot r : robots) {
			if (r.getNombre().equals(nombre) && r.getTipo().equals(tipo)) {
				resultado = r;
				break;
			}
		}
		return resultado;
	}

}
