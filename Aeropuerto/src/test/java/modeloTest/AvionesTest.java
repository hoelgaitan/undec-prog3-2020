package modeloTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AvionesTest {

	@Test
	public void InstanciarAviones_DatosCompletos_InstanciaCorrecta() { //modelo, matricula, añofab, cantidadpasaj
		
		Avion av1= Avion.factory("A350", "DIC-0918", 2015, 200);
		assertNotNull(av1);
		
	}

	@Test
	public void InstanciarAviones_ModeloIncorrecto_InstanciaIncorrecta() {
		
		Avion av1= Avion.factory(A*350, "DIC-0918", 2015, 200);// modelo solo debe contener numeros y letras
		assertNull(av1);	
	}
	
	@Test
	public void InstanciarAviones_MatriculaIncorrecto_InstanciaIncorrecta() {
		
		Avion av1= Avion.factory("A350", null, 2015, 200);
		assertNull(av1);	
	}
	
	@Test
	public void InstanciarAviones_AñoFabricacionIncorrecto_InstanciaIncorrecta() {
		
		Avion av1= Avion.factory("A350", "DIC-0918", 2022, 200);
		assertNull(av1);	
	}
	
	@Test
	public void InstanciarAviones_CantidadPasajerosIncorrecto_InstanciaIncorrecta() {
		
		Avion av1= Avion.factory("A350", "DIC-0918", 2022, 20000);//numero de pasajeros excede el limite
		assertNull(av1);	
	}
}
