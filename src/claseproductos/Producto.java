package claseproductos;

import java.util.ArrayList;
import java.util.List;

public class Producto {
	public static List<Producto> productos = new ArrayList<>();
	private String nombre;
	private String caracteristicas;
	private String idproducto;
	private String condiciones;

	public Producto() {

	}

	public Producto(String nombre, String caracteristicas, String idproducto, String condiciones) {
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
		this.idproducto = idproducto;
		this.condiciones = condiciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String carateristicas) {
		this.caracteristicas = carateristicas;
	}

	public String getIdProducto() {
		return idproducto;
	}

	public void setIdProducto(String idProducto) {
		this.idproducto = idProducto;
	}

	public String getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}

	@Override
	public String toString() {
		return "Nombre Producto:" + nombre + "\n" + "Características del producto:" + caracteristicas + "\n"
				+ "Código del producto:" + idproducto + "\n" + "Condiciones del producto:" + condiciones;
	}

}
