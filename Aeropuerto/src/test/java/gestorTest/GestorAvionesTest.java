package gestorTest;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class GestorAvionesTest {
	//modelo, matricula, añofab, cantidadpasaj
	@Test
	public void CrearAvion_InstanciaCorrecta() {
		// Arrange
        GestorAvion g1 = new GestorAvion (new LinkedList <Avion>());
        
        Avion avion1 = g1.crearAvion("HG-190", "Turbo 2000", 2018, 100);


		//Act (Hacer que las instancias creadas hagan algo)
        g1.agregarAvion(avion1);

        int avionesCreados = g1.getColeccionAviones().size();
        
        //Assert
        assertEquals(avionesCreados, 1);

	}
	
	@Test
    void AvionDuplicado_InstanciaIncorrecta() throws AvionExisteException, FechaIncorrectaException, MatriculaIncorrectaException {

        // Arrange
        GestorAvion g1 = new GestorAvion();
        g1.getColeccionAviones().add(new Avion("HG-190", "Turbo 2000", 2018, 100));

      
        // Act
        Avion avion1 = elGestor.crearAvion("HG-190", "Turbo 2000", 2018, 100);

        // Assert
        assertFalse(elGestor.agregarAvion(avion1));
        assertEquals(1, elGestor.getColeccionAviones().size());

        }
	
	

	@Test
    void ConsultarAviones_InstanciaCorrecta () throws FechaIncorrectaException, MatriculaIncorrectaException {
        
        GestorAvion gestor = new GestorAvion(new LinkedList<Avion>());

        Avion avion1 = new Avion("HG-190", "Turbo 2000", 2018, 100);
        Avion avion2 = new Avion("HG-180", "Aguila2.0", 2019, 70);
        Avion avion3 = new Avion("BM-170", "Terminator", 2020, 110);
        Avion avion4 = new Avion("FR-707","Red 251", 2016, 57);

        gestor.agregarAvion(avion1);
        gestor.agregarAvion(avion2);
        gestor.agregarAvion(avion3);
        gestor.agregarAvion(avion4);
  

        Avion avionBuscado = gestor.buscarAvionPorMatricula("FR-707");

        // Assert
        assertEquals("FR-707",avionBuscado.getMatricula());
    }




}
