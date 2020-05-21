package modeloTest;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class AeropuertoTest {

	@Test
	public void InstanciarAeropuerto_DatosCompletos_InstanciaCorrecta() {
		
		Aeropuerto ae1= Aeropuerto.factory("Ezeiza", "Buenos Aires", 1520);
		assertNotNull(ae1);
		
	}
	
	@Test
	public void InstanciarAeropuerto_AeropuertoNombreIncorrecto_InstanciaIncorrecta() {
		
		Aeropuerto ae1= Aeropuerto.factory(null, "Buenos Aires", 1520);
		assertNull(ae1);
		
	}
	
	@Test
	public void InstanciarAeropuerto_AeropuertoCiudadIncorrecto_InstanciaIncorrecta() {
		
		Aeropuerto ae1= Aeropuerto.factory("Ezeiza", null, 1520);
		assertNull(ae1);
		
	}
	
	@Test
	public void InstanciarAeropuerto_AeropuertoCodigoIncorrecto_InstanciaIncorrecta() {
		
		Aeropuerto ae1= Aeropuerto.factory("Ezeiza", "Buenos Aires", null);
		assertNull(ae1);
		
	}
	
}
