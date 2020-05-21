package gestorTest;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GestorPilotoTest {
	//cuit, matricula, apellidoYnombre, fechaNacimiento, horasdeVuelo
	
	@Test
    void crearPiloto_InstanciaCorrecta(){

		GestorPiloto p1 = GestorPiloto.getIntance();
		
	
        // Act
        
        Piloto piloto1 = p1.crearPiloto("20-12345678-0", 123343, "Ocampo", "Jose",LocalDate.of(1996, 05, 18));
        
        p1.agregarPiloto(piloto1);

        int pilotoCreado = p1.getColeccionPiloto().size();

        // Assert
        assertTrue(1 == pilotoCreado );

    }
	
	@Test
    void pilotoYaExiste_InstanciaIncorrecta(){

		GestorPiloto p1 = GestorPiloto.getIntance();
		
        Piloto piloto1 = p1.crearPiloto("20-12345678-0", 123343, "Ocampo", "Jose",LocalDate.of(1996, 05, 18));
        Piloto piloto2 = p1.crearPiloto("20-12345678-0", 35335, "Asis", "Jose",LocalDate.of(1996, 05, 18));

        
        assertTrue(p1.addPiloto(piloto1));
        assertFalse(p1.addPiloto(piloto2));

  
    }


}
