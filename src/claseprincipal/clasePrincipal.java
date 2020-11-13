package claseprincipal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import claseclientes.Cliente;
import claseempresa.Empresa;

public class clasePrincipal {
	public static String menu;

	public static void main(String[] args) {

		do {

			String menu = JOptionPane.showInputDialog("INGRESE OPCIÓN\n" + 
													" 1. Agregar Persona\n"+ 
													"2. Mostrar Informacion\n" + 
													"3. Actualizar Informacion\n" + 
													"4. Eliminar  Informacion\n"+
													"5. Agregar productos  x Persona\n" + 
													"6. Mostrar productos  x Persona\n"+
													"7. Buscar Informacion x Documento\n" + 
													"0. salir de la aplicacion");

			switch (menu) {
			case "1":
				agregarPersona();
				break;
			case "2":
				mostrarInformacion();
				break;
			case "3":
				actualizarInformacion();
				;
				break;
			case "4":
				eliminarInformacion();
				break;
			case "5":
				agregarProductos();
				break;
			case "6":
				mostrarProductosec();
				break;
			case "7":
				buscarInformacion();
				break;
			case "0":
				System.out.println("Muchas gracias por usar nuestra app, hasta luego");
				System.exit(0);
				break;
			default:
				System.out.println("El valor ingresado no es una opcion de menu");
				break;
			}
		} while (menu != "0");

	}

	private static void agregarPersona() {
		Scanner in = new Scanner(System.in);
		System.out.println("Que tipo de persona quiere agregar: ");
		System.out.println("1. Empresa");
		System.out.println("2. Cliente");
		String tipoPersona = in.nextLine();
		if (tipoPersona.equalsIgnoreCase("1")) {
			Empresa em = new Empresa();
			em.agregarInformacion();
		} else if (tipoPersona.equalsIgnoreCase("2")) {
			Cliente cl = new Cliente();
			cl.agregarInformacion();

		}
	}

	private static void mostrarInformacion() {
		Scanner in = new Scanner(System.in);
		System.out.println("Que información desea mostrar ");
		System.out.println("1. Empresa");
		System.out.println("2. Cliente");
		String tipoInformacion = in.nextLine();
		if (tipoInformacion.equalsIgnoreCase("1")) {
			Empresa em = new Empresa();
			em.mostrarInformacion();
		} else if (tipoInformacion.equalsIgnoreCase("2")) {
			Cliente cl = new Cliente();
			cl.mostrarInformacion();

		}
	}

	private static void actualizarInformacion() {
		Scanner in = new Scanner(System.in);
		System.out.println("Que información desea actualizar ");
		System.out.println("1. Empresa");
		System.out.println("2. Cliente");
		String tipoInformacion = in.nextLine();
		if (tipoInformacion.equalsIgnoreCase("1")) {
			Empresa em = new Empresa();
			em.actualizarInformacion();
		} else if (tipoInformacion.equalsIgnoreCase("2")) {
			Cliente cl = new Cliente();
			cl.actualizarInformacion();

		}

	}

	private static void eliminarInformacion() {
		Scanner in = new Scanner(System.in);
		System.out.println("Que tipo de información desea eliminar ");
		System.out.println("1. Empresa");
		System.out.println("2. Cliente");
		String tipoInformacion = in.nextLine();
		if (tipoInformacion.equalsIgnoreCase("1")) {
			Empresa em = new Empresa();
			em.eliminarInformacion();
		} else if (tipoInformacion.equalsIgnoreCase("2")) {
			Cliente cl = new Cliente();
			cl.eliminarInformacion();

		}

	}

	private static void agregarProductos() {
		Scanner in = new Scanner(System.in);
		System.out.println("A qué cliente desea agregar un Producto: ");
		System.out.println("1. Empresa");
		System.out.println("2. Cliente");
		String tipoInformacion = in.nextLine();
		if (tipoInformacion.equalsIgnoreCase("1")) {
			Empresa em = new Empresa();
			em.agregarProductos();
		} else if (tipoInformacion.equalsIgnoreCase("2")) {
			Cliente cl = new Cliente();
			cl.agregarProductos();

		}

	}

	
	private static void mostrarProductosec() {
		Scanner in = new Scanner(System.in);
		System.out.println("A qué cliente desea mostrar un Producto: ");
		System.out.println("1. Empresa");
		System.out.println("2. Cliente");
		String tipoInformacion = in.nextLine();
		if (tipoInformacion.equalsIgnoreCase("1")) {
			Empresa em = new Empresa();
			em.mostrarProductos();
		} else if (tipoInformacion.equalsIgnoreCase("2")) {
			Cliente cl = new Cliente();
			cl.mostrarProductos();

		}

	}
	private static void buscarInformacion() {
		Scanner in = new Scanner(System.in);
		System.out.println("Que información desea buscar ");
		System.out.println("1. Empresa");
		System.out.println("2. Cliente");
		String tipoInformacion = in.nextLine();
		if (tipoInformacion.equalsIgnoreCase("1")) {
			Empresa em = new Empresa();
			em.buscarInformacion();
		} else if (tipoInformacion.equalsIgnoreCase("2")) {
			Cliente cl = new Cliente();
			cl.buscarInformacion();

		}

	}

}