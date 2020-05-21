package modelo;

import exceptions.CiudadAeropuertoNuloException;
import exceptions.CodigoAeropuertoNuloException;
import exceptions.NombreAerolineaNuloException;
import exceptions.NombreAerolineaVacioException;
import exceptions.NombreAeropuertoNuloException;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private int codigo;
	
	public Aeropuerto(String nombre, String ciudad, int codigo) throws NombreAeropuertoNuloException, CiudadAeropuertoNuloException, CodigoAeropuertoNuloException {
		if(validar(nombre, ciudad, codigo)) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo = codigo;
		}
	}

	
	private boolean validar(String nombre, String ciudad, int codigo) throws NombreAeropuertoNuloException, CiudadAeropuertoNuloException, CodigoAeropuertoNuloException {
		
		if(nombre == null)
			throw new NombreAeropuertoNuloException("El nombre del Aeropuerto no puede ser nulo");
		if(ciudad == null)
			throw new CiudadAeropuertoNuloException("La ciudad del Aeropuerto no puede ser nulo");
		if(codigo < 0)
			throw new CodigoAeropuertoNuloException("El codigo del Aeropuerto no puede ser menor a 0.");
	
		
		return true;
	}





	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", ciudad=" + ciudad + ", codigo=" + codigo + "]";
	}
	
	
	
	

}
