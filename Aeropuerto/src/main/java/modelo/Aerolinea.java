package modelo;

import java.time.LocalDate;

import exceptions.FechaInicioActividadNuloException;
import exceptions.NombreAerolineaNuloException;
import exceptions.NombreAerolineaVacioException;

public class Aerolinea {

	private String nombre;
	private LocalDate fechaInicioActividad;
	
	public Aerolinea(String nombre, LocalDate fechaInicioActividad) throws NombreAerolineaNuloException, NombreAerolineaVacioException, FechaInicioActividadNuloException {
		if(validar(nombre, fechaInicioActividad)) {
		this.nombre= nombre;
		this.fechaInicioActividad = fechaInicioActividad;
		}
	}
	/*public static Aerolinea factory(String nombre, LocalDate fechaInicioActividad) throws NombreAerolineaNuloException, NombreAerolineaVacioException, FechaInicioActividadNuloException {
		if(validar(nombre, fechaInicioActividad)) {
			new Aerolinea (nombre, fechaInicioActividad);
		}
		
		
		return null;
	}*/
	private boolean validar(String nombre, LocalDate fechaInicioActividad) throws NombreAerolineaNuloException, NombreAerolineaVacioException, FechaInicioActividadNuloException {
		if(nombre == null)
			throw new NombreAerolineaNuloException("El nombre no puede ser nulo");
		if(nombre == "")
			throw new NombreAerolineaVacioException("El nombre no puede estar vacio");
		if(fechaInicioActividad == null)
			throw new FechaInicioActividadNuloException ("La fecha no puede ser nula");
		
		return true;
	}
	@Override
	public String toString() {
		return nombre + " " + fechaInicioActividad  ;
	}
	
	

}
