package claseempresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import clasepersona.Persona;
import claseproductos.Producto;

public class Empresa extends Persona {
	public static List<Empresa> empresas = new ArrayList<>();
	public static List<Producto> productos = new ArrayList<>();
	private String nit;
	private String nombre;
	private String telefono;
	private String direccion;
	private List<Producto> producto;

	public Empresa(String nit, String nombre, String telefono, String direccion) {
		this.nit = nit;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;

	}

	public Empresa() {

	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
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

	@Override
	public void agregarInformacion() {

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el Nit de la empresa:");
		String nit = in.nextLine();
		System.out.println("Ingrese nombre empresa:");
		String nombre = in.nextLine();
		System.out.println("Ingrese teléfono empresa:");
		String telefono = in.nextLine();
		System.out.println("Ingrese dirección empresa:");
		String direccion = in.nextLine();
		Empresa mp = new Empresa(nit, nombre, telefono, direccion);
		empresas.add(mp);
		System.out.println("SE AGREGÓ EMPRESA CORRECTAMENTE");

	}

	@Override
	public void mostrarInformacion() {
		for (Empresa empresa : empresas) {
			System.out.println("Nit de la empresa: " + empresa.getNit());
			System.out.println("Nombre empresa: " + empresa.getNombre());
			System.out.println("Teléfono empresa: " + empresa.getTelefono());
			System.out.println("Dirección empresa: " + empresa.getDireccion());
			System.out.println("****************************");
		}

	}

	@Override
	public void buscarInformacion() {
		Scanner encontrado = new Scanner(System.in);
		System.out.println("Ingrese numero nit de la empresa:");
		String nit = encontrado.nextLine();
		boolean bandera = false;
		for (Empresa empresa : empresas) {
			if (empresa.getNit().equals(nit)) {
				bandera = true;
				System.out.println("Empresa encontrada");
				System.out.println("Nombre empresa:" + empresa.getNombre());
				System.out.println("Cédula empresa:" + empresa.getNit());
				System.out.println("Celular empresa:" + empresa.getTelefono());
				System.out.println("Celular empresa:" + empresa.getDireccion());
				break;
			}

		}
		if (!bandera) {
			System.out.println("Empresa no encontrada");
		}
	}

	@Override
	public void actualizarInformacion() {
		Scanner in = new Scanner(System.in);
		boolean nitencontrado = false;
		if (!empresas.isEmpty()) {

			System.out.println("Ingrese el Nit de la empresa para actualizar información:");
			String nit = in.nextLine();

			for (Empresa emp : empresas) {
				if (emp.getNit().equals(nit)) {
					nitencontrado = true;
					System.out.println("Ingrese nit  empresa:");
					String nitNuevo = in.nextLine();
					emp.setNit(nitNuevo);
					System.out.println("Ingrese nombre empresa:");
					String nombreNuevo = in.nextLine();
					emp.setNombre(nombreNuevo);
					System.out.println("Ingrese teléfono empresa:");
					String telefonoNuevo = in.nextLine();
					emp.setTelefono(telefonoNuevo);
					System.out.println("Ingrese dirección empresa:");
					String direccionNueva = in.nextLine();
					emp.setDireccion(direccionNueva);
					empresas.add(emp);
					break;

				} else {
					System.out.println("La empresa no existe");
				}
			}
		} else {
			System.out.println("No hay Empresas creadas");
		}

	}

	@Override
	public void eliminarInformacion() {
		Scanner encontrado = new Scanner(System.in);
		System.out.println("Ingrese numero nit empresa:");
		String nit = encontrado.nextLine();
		boolean bandera = false;
		for (Empresa emp : empresas) {
			if (emp.getNit().equals(nit)) {
				bandera = true;
				empresas.remove(emp);
				System.out.println("Empresa Eliminada");
				break;
			}

		}
		if (!bandera) {
			System.out.println("Empresa no encontrada");
		}

	}

	@Override
	public void agregarProductos() {
		Scanner in = new Scanner(System.in);
		boolean nitencontrado = false;

		if (!empresas.isEmpty()) {

			System.out.println("Ingrese el nit de la empresa para agregar producto: ");
			String nit = in.nextLine();

			for (Empresa emp : empresas) {
				if (emp.getNit().equals(nit)) {
					nitencontrado = true;
					System.out.println("Ingrese nombre producto:");
					String nombreproducto = in.nextLine();
					System.out.println("Ingrese caracteristicas del producto:");
					String caracteproducto = in.nextLine();
					System.out.println("Ingrese código del producto:");
					String idproducto = in.nextLine();
					System.out.println("Ingrese condiciones del producto:");
					String condiproducto = in.nextLine();
					Producto pr = new Producto(nombreproducto, caracteproducto, idproducto, condiproducto);
					productos.add(pr);
					System.out.println("SE AGREGÓ PRODUCTO CORRECTAMENTE");
					emp.setProducto(productos);
				}
			}
			if (!nitencontrado) {
				System.out.println("Empresa no existe");
			}

		} else {
			System.out.println("No hay empresas para asociar productos");
		}

	}

	@Override
	public void mostrarProductos() {
		Scanner in = new Scanner(System.in);
		boolean nitencontrado = false;

		if (!empresas.isEmpty()) {
			System.out.println("Ingrese el nit de la empresa para mostrar productos:");
			String nit = in.nextLine();
			for (Empresa emp : empresas) {
				if (emp.getNit().equals(nit)) {
					if (!emp.getProducto().isEmpty()) {
						System.out.println("Los productos asociados a la empresa son: " + emp.getProducto());
						nitencontrado = true;
					} else {
						System.out.println("La empresa no tiene productos asociados");
					}
				}

			}
			if (!nitencontrado) {
				System.out.println("Empresa no existe");
			}
		} else {
			System.out.println("No hay empresas");
		}

	}

}
