package modeloTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class VuelosTest {
	//CodigoVuelo, salida, fechaHoraSalida, Arribo, fechaHoraArribo, Aerolinea, Avion
	@Test
	public void InstanciarVuelos_DatosCompletos_InstanciaCorrecta() {
		
		Vuelos v1= Vuelos.factory(345, "ezeiza", LocalDateTime.of(2020,  10, 06, 13, 00), "El dorado",LocalDateTime.of(2020,  10, 06, 22, 00), "Aerolineas Argentinas", "dx150");

		assertNotNull(v1);
		}
	
	
	

}
