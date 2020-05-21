package modeloTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

import exceptions.CiudadAeropuertoNuloException;
import exceptions.CodigoAeropuertoNuloException;
import exceptions.NombreAerolineaVacioException;
import exceptions.NombreAeropuertoNuloException;
import modelo.Aerolinea;
import modelo.Aeropuerto;

public class AeropuertoTest {

	@Test
	public void InstanciarAeropuerto_DatosCompletos_InstanciaCorrecta() throws NombreAeropuertoNuloException, CiudadAeropuertoNuloException, CodigoAeropuertoNuloException {
		
		Aeropuerto ae1= new Aeropuerto("Ezeiza", "Buenos Aires", 1520);
		assertNotNull(ae1);
		
	}
	
	@Test
	public void InstanciarAeropuerto_AeropuertoNombreIncorrecto_InstanciaIncorrecta() throws NombreAeropuertoNuloException, CiudadAeropuertoNuloException, CodigoAeropuertoNuloException {
	
		
		try {
			Aeropuerto ae1= new Aeropuerto(null, "Buenos Aires", 1520);
		} catch (NombreAeropuertoNuloException e) {
			assertEquals("El nombre del Aeropuerto no puede ser nulo", e.getMessage());
		}
		
	}
	
	@Test
	public void InstanciarAeropuerto_AeropuertoCiudadIncorrecto_InstanciaIncorrecta() throws NombreAeropuertoNuloException, CiudadAeropuertoNuloException, CodigoAeropuertoNuloException {
		
		try {
			Aeropuerto ae1= new Aeropuerto("Ezeiza", null, 1520);
		} catch (CiudadAeropuertoNuloException e) {
			assertEquals("La ciudad del Aeropuerto no puede ser nulo", e.getMessage());
		}
		
	}
	
	@Test
	public void InstanciarAeropuerto_AeropuertoCodigoIncorrecto_InstanciaIncorrecta() throws NombreAeropuertoNuloException, CiudadAeropuertoNuloException, CodigoAeropuertoNuloException {{
		
		
		try {
			Aeropuerto ae1= new Aeropuerto("Ezeiza", "Buenos Aires", -1);
		} catch (CodigoAeropuertoNuloException e) {
			assertEquals("El codigo del Aeropuerto no puede ser menor a 0.", e.getMessage());
		}
		
	}
	
	}
}
