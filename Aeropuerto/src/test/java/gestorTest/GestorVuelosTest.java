package gestorTest;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class GestorVuelosTest {
	//CodigoVuelo, salida, fechaHoraSalida, Arribo, fechaHoraArribo, Aerolinea, Avion

void gestorAeropuertoEsSingleton() {
		
		GestorVuelos v1 = GestorVuelos.getIntance();//singleton
		
		GestorVuelos v2 = GestorVuelos.getIntance();
		
		assertEquals(v1, v2);
		
		
	}
	
	@Test
	public void crearVuelo_InstanciaCorrecta() {
		GestorVuelos v1 = GestorVuelos.getIntance();

		
		
		Vuelos vuelo1= v1.crearVuelo(1234, "Australia", LocalDateTime.of(2022, 07, 13, 18, 30));
		
		v1.addVuelos(vuelo1);
		int vueloCreado = v1.getColeccionVuelos().size();

        // Assert
        assertTrue(1 == vueloCreado );

		
	}
	
	@Test
	public void mostrarVuelos_InstanciaCorrecta() {
		GestorVuelos v1 = GestorVuelos.getIntance();

		
		
		foreach (Vuelos  v1.getColeccionVuelos() : iterable) {
			
			System.out.println(iterable.toString());
			
		}


		
	}

}
