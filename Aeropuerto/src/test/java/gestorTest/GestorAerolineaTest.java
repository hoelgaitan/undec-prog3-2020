package gestorTest;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GestorAerolineaTest {
	//nombre, fechainicioActivid

	
	@Test
	void GestorAerolineaEsSingleton() {
		
		GestorAerolinea g1 = GestorAerolinea.getIntance();//singleton
		
		GestorAerolinea g2 = GestorAerolinea.getIntance();
		
		assertEquals(g1, g2);
		
		
	}
		
	
	
	@Test
	public void CrearAerolinea_InstanciaCoreecta() throws NombreAerolineaIncorrectoException{
		
		GestorAerolinea g1 = GestorAerolinea.getIntance();
		
		Aerolinea aerolinea1 = g1.crearAerolinea("Avianca", LocalDate.of(2020, 06, 18));
		
		//Act
		g1.agregarAerolinea(aerolinea1);
		
		
		//Assert
		assertEquals(g1.getAerolinea.size(), 1);
	
	}
	
	@Test
	public void AerolineaDuplicada_InstanciaIncoreecta() throws AerolineaExisteException{
		
		
		GestorAerolinea g1 = GestorAerolinea.getIntance();
		
		Aerolinea aerolinea1= new Aerolinea("Ezeiza", LocalDate.of(2020,05, 10));
		
		Aerolinea aerolinea2= new Aerolinea("Ezeiza", LocalDate.of(2020,05, 10));

		
		//Act
		
		g1.addAerolinea(aerolinea1);
		g1.addAerolinea(aerolinea2);		
		
		
		//Assert
		assertNotNull(aerolinea1);
		assertNull(aerolinea2);
	
	}
	

}
