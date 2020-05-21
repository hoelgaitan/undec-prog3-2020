package modeloTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class PilotoTest {

	@Test
	public void InstanciarPiloto_DatosCompletos_InstanciaCorrecta() { //cuit, matricula, apellidoYnombre, fechaNacimiento, horasdeVuelo
		
		Piloto pil1= Piloto.factory(20-39700340-5, 195350, "Pedro Sofovich", LocalDate.of(1977, 05, 18));
		assertNotNull(pil1);
		
	}
	@Test
	public void InstanciarPiloto_CuitIncorrecto_InstanciaIncorrecta() {
		
		Piloto pil1= Piloto.factory(20-3970034012-55, 195350, "Pedro Sofovich", LocalDate.of(1977, 05, 18));// cuit no puede superar los 11 caracteres
		assertNull(pil1);
	}
	
	@Test
	public void InstanciarPiloto_CuitRepetido_InstanciaIncorrecta() {
		
		Piloto pil1= Piloto.factory(20-39700340-5, 195350, "Pedro Sofovich", LocalDate.of(1977, 05, 18));
		Piloto pil2= Piloto.factory(20-39700340-5, 195355, "Gabriel Jesus", LocalDate.of(1967, 04, 12));

		assertNotNull(pil1);
		assertNull(pil2);
	}
	
	@Test
	public void InstanciarPiloto_HorasDeVuelo_InstanciaIncorrecta() {
		
		Piloto pil1= Piloto.factory(20-39700340-5, 195350, "Pedro Sofovich", LocalDate.of(1977, 05, 18));
		assertlEquals(10, pil1.getCantidadHorasDeVuelo());
	}

}
