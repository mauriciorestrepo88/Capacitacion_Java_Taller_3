package clasepersona;

public abstract class Persona {
	protected String cedula;
	protected String celular;

	public Persona() {

	}

	public Persona(String cedula, String celular) {
		this.cedula = cedula;
		this.celular = celular;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public abstract void agregarInformacion();

	public abstract void mostrarInformacion();

	public abstract void buscarInformacion();

	public abstract void actualizarInformacion();

	public abstract void eliminarInformacion();

	public abstract void agregarProductos();
	
	public abstract void mostrarProductos();

	@Override
	public String toString() {
		return "Cédula cliente:" + cedula + "\n" + "Celular cliente:" + celular + "\n";
	}
}
