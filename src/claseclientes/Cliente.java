package claseclientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clasepersona.Persona;
import claseproductos.Producto;

public class Cliente extends Persona {
	public static List<Cliente> clientes = new ArrayList<>();
	public static List<Producto> productos = new ArrayList<>();
	private String nombre;
	private String telefono;
	private String direccion;
	private List<Producto> producto;

	public Cliente() {
	}

	public Cliente(String cedula, String celular, String nombre, String telefono, String direccion) {
		super(cedula, celular);
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.producto = producto;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(List<Cliente> clientes) {
		Cliente.clientes = clientes;
	}

	@Override
	public void agregarInformacion() {

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese cedula cliente:");
		String cedula = in.nextLine();
		System.out.println("Ingrese celular cliente:");
		String celular = in.nextLine();
		System.out.println("Ingrese nombre cliente:");
		String nombre = in.nextLine();
		System.out.println("Ingrese teléfono cliente:");
		String telefono = in.nextLine();
		System.out.println("Ingrese dirección cliente:");
		String direccion = in.nextLine();
		Cliente cl = new Cliente(cedula, celular, nombre, telefono, direccion);
		clientes.add(cl);
		System.out.println("SE AGREGÓ CLIENTE CORRECTAMENTE");

	}

	@Override
	public void mostrarInformacion() {
		for (Cliente cliente : clientes) {
			System.out.println("Nombre Cliente: " + cliente.getNombre());
			System.out.println("Cedula Cliente:" + cliente.getCedula());
			System.out.println("Celular cliente: " + cliente.getCelular());
			System.out.println("Teléfono cliente: " + cliente.getTelefono());
			System.out.println("Dirección cliente: " + cliente.getDireccion());
			System.out.println("****************************");
		}

	}

	@Override
	public void buscarInformacion() {
		Scanner encontrado = new Scanner(System.in);
		System.out.println("Ingrese numero cedula cliente:");
		String cedula = encontrado.nextLine();
		boolean bandera = false;
		for (Cliente cliente : clientes) {
			if (cliente.getCedula().equals(cedula)) {
				bandera = true;
				System.out.println("Cliente encontrado");
				System.out.println("Nombre cliente:" + cliente.getNombre());
				System.out.println("Cédula cliente:" + cliente.getCedula());
				System.out.println("Celular cliente:" + cliente.getCelular());
				System.out.println("Celular cliente:" + cliente.getTelefono());
				System.out.println("Celular cliente:" + cliente.getDireccion());
				break;
			}
			if (!bandera) {
				System.out.println("Cliente  no encontrado");
			}

		}

	}

	@Override
	public void actualizarInformacion() {
		Scanner in = new Scanner(System.in);
		boolean cedulaencotrada = false;
		if (!clientes.isEmpty()) {

			System.out.println("Ingrese la cedula del cliente para actualizar información:");
			String cedula = in.nextLine();

			for (Cliente cliente : clientes) {
				if (cliente.getCedula().equals(cedula)) {
					cedulaencotrada = true;
					System.out.println("Ingrese cedula cliente:");
					String cedulaNueva = in.nextLine();
					cliente.setCedula(cedulaNueva);
					System.out.println("Ingrese celular cliente:");
					String celularNuevo = in.nextLine();
					cliente.setCelular(celularNuevo);
					System.out.println("Ingrese nombre cliente:");
					String nombreNuevo = in.nextLine();
					cliente.setNombre(nombreNuevo);
					System.out.println("Ingrese teléfono cliente:");
					String telefonoNuevo = in.nextLine();
					cliente.setTelefono(telefonoNuevo);
					System.out.println("Ingrese dirección cliente:");
					String direccionNueva = in.nextLine();
					cliente.setDireccion(direccionNueva);
					clientes.add(cliente);
					break;
				} else {
					System.out.println("El cliente no existe");
				}
			}
		} else {
			System.out.println("No hay clientes");
		}

	}

	@Override
	public void eliminarInformacion() {
		Scanner encontrado = new Scanner(System.in);
		System.out.println("Ingrese numero cedula cliente:");
		String cedula = encontrado.nextLine();
		boolean bandera = false;
		for (Cliente cliente : clientes) {
			if (cliente.getCedula().equals(cedula)) {
				bandera = true;
				clientes.remove(cliente);
				System.out.println("Cliente Eliminado");
				break;
			}

		}
		if (!bandera) {
			System.out.println("Cliente no encontrado");
		}

	}

	@Override
	public void agregarProductos() {
		Scanner in = new Scanner(System.in);
		boolean cedulaencotrada = false;

		if (!clientes.isEmpty()) {

			System.out.println("Ingrese la cedula del cliente para agregar producto:");
			String cedula = in.nextLine();

			for (Cliente cli : clientes) {
				if (cli.getCedula().equals(cedula)) {
					cedulaencotrada = true;
					System.out.println("Ingrese nombre producto:");
					String nombreproducto = in.nextLine();
					System.out.println("Ingrese caracteristicas del producto:");
					String caracteproducto = in.nextLine();
					System.out.println("Ingrese código del producto :");
					String idproducto = in.nextLine();
					System.out.println("Ingrese condiciones del producto:");
					String condiproducto = in.nextLine();
					Producto pr = new Producto(nombreproducto, caracteproducto, idproducto, condiproducto);
					productos.add(pr);
					System.out.println("SE AGREGÓ PRODUCTO CORRECTAMENTE");
					cli.setProducto(productos);
				}
			}
			if (!cedulaencotrada) {
				System.out.println("Cliente no existe");
			}

		} else {
			System.out.println("No hay clientes para asociar productos");
		}

	}

	@Override
	public void mostrarProductos() {
		Scanner in = new Scanner(System.in);
		boolean cedulaencotrada = false;
		if (!clientes.isEmpty()) {
			System.out.println("Ingrese la cedula del cliente para mostrar productos:");
			String cedula = in.nextLine();
			for (Cliente cli : clientes) {
				if (cli.getCedula().equals(cedula)) {
					if (!cli.getProducto().isEmpty()) {
						System.out.println("Los productos asociados al cliente son: " + cli.getProducto());
						cedulaencotrada = true;
					} else {
						System.out.println("El cliente no tiene productos asociados");
					}
				}

			}
			if (!cedulaencotrada) {
				System.out.println("Cliente no existe");
			}
		} else {
			System.out.println("No hay clientes");
		}

	}

}
