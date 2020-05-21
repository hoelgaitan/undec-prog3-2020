package gestorTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestorAeropuertoTest {
	//nombreid, nombre, ciudad, codigo
	@Test
	void gestorAeropuertoEsSingleton() {
		
		GestorAerolinea a1 = GestorAerolinea.getIntance();//singleton
		
		GestorAerolinea a2 = GestorAerolinea.getIntance();
		
		
		assertEquals(a1, a2);
		
		
	}
	
	@Test
	void agregarAeropuerto_InstanciaCorrecta() {
		
		GestorAerolinea a1 = GestorAerolinea.getIntance();
		
		Aeropuerto aeropuerto1 = new Aeropuerto("Dorado", "Mexico", 2424);
		Aeropuerto aeropuerto2 = new Aeropuerto("Agua", "Colombia", 3221);

		
		a1.addAeropuerto(aeropuerto1);
		a1.addAeropuerto(aeropuerto2);

		assertEquals(2,a1.getCantidadAeropuerto());
	}

	@Test
	void buscarAeropuertoPorNombre_InstanciaCorrecta() {
		
		GestorAerolinea a1 = GestorAerolinea.getIntance();
		
		Aeropuerto aeropuerto1 = new Aeropuerto("Dorado", "Mexico", 2424);
		Aeropuerto aeropuerto2 = new Aeropuerto("Agua", "Colombia", 3221);
		
		

		assertEquals("Dorado",a1.buscarAeropuertoPorNombre("Dorado").getNombre);
		assertNull(a1.buscarAeropuertoPorNombre("Negro").getNombre);

	}

}
