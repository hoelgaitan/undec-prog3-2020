package modeloTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import  java.time.LocalDateTime ;

import org.junit.Test;

import exceptions.FechaInicioActividadNuloException;
import exceptions.NombreAerolineaNuloException;
import exceptions.NombreAerolineaVacioException;
import modelo.Aerolinea;

public class AerolineaTest {
//nombre, fechainicioActivid
	@Test
	public void InstanciarAerolinea_DatosCompletos_InstanciaCorrecta() throws NombreAerolineaNuloException, NombreAerolineaVacioException, FechaInicioActividadNuloException {
		
		Aerolinea a1=new Aerolinea("Aerolineas Argentinas", LocalDate.of( 2020 , 06 , 07 ));//Año, mes, dia, Ultimos dos parametros para la hora
		assertNotNull(a1);
		
	}
	
	@Test
	public void InstanciarAerolinea_AerolineaSinNombre_InstanciaIncorrecta() throws NombreAerolineaNuloException, NombreAerolineaVacioException, FechaInicioActividadNuloException {
		
		
	
		
		try {
			Aerolinea a1= new Aerolinea("", LocalDate.of( 2020 , 06 , 07 ));
		} catch (NombreAerolineaVacioException e) {
			assertEquals("El nombre no puede estar vacio", e.getMessage());
		}
	
	}
	
	@Test
	public void InstanciarAerolinea_AerolineaSinFecha_InstanciaIncorrecta() throws NombreAerolineaNuloException, NombreAerolineaVacioException, FechaInicioActividadNuloException {
		
		try {
			Aerolinea a1= new Aerolinea("Aerolineas Argentinas",null);
		} catch (FechaInicioActividadNuloException  e) {
			assertEquals("La fecha no puede ser nula", e.getMessage());
		}
	}

	@Test
	public void InstanciarAerolinea_ImprimirFormatoCorrecto_FormatoCorrecto() throws NombreAerolineaNuloException, NombreAerolineaVacioException, FechaInicioActividadNuloException {
		
		Aerolinea a1= new Aerolinea("Aerolineas Argentinas", LocalDate.of( 2020 , 06 , 07  ));
		assertEquals("Aerolineas Argentinas 2020-06-07"  , a1.toString());
	}
	

}
