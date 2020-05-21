package modeloTest;

import static org.junit.Assert.*;
import  java.time.LocalDateTime ;

import org.junit.Test;

public class AerolineaTest {
//nombre, fechainicioActivid
	@Test
	public void InstanciarAerolinea_DatosCompletos_InstanciaCorrecta() {
		
		Aerolinea a1= Aerolinea.factory("Aerolineas Argentinas", LocalDateTime.of( 2020 , 06 , 07 , 13 , 10 ));//Año, mes, dia, Ultimos dos parametros para la hora
		assertNotNull(a1);
		
	}
	
	@Test
	public void InstanciarAerolinea_AerolineaSinNombre_InstanciaIncorrecta() {
		
		Aerolinea a1= Aerolinea.factory("", 18-05-20);
		assertNull(a1);
	}
	
	@Test
	public void InstanciarAerolinea_AerolineaSinFecha_InstanciaIncorrecta() {
		
		Aerolinea a1= Aerolinea.factory("Aerolineas Argentinas", null);
		assertNotNull(a1);
	}

	@Test
	public void InstanciarAerolinea_ImprimirFormatoCorrecto_FormatoCorrecto() {
		
		Aerolinea a1= Aerolinea.factory("Aerolineas Argentinas", LocalDateTime.of( 2020 , 06 , 07 , 13 , 10 ));
		assertEquals("Aerolineas Argentinas" + a1.toString);
	}
	

}
