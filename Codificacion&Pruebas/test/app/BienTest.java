package app;

import org.junit.Test;
import static org.junit.Assert.*;

public class BienTest {

    @Test
    public void vehiculoValido() { // Test valido para el vehículo
        Bien bien = new Bien("vehiculo", 30000);
        assertTrue(bien.validarBien());
    }

    @Test
    public void viviendaInvalida() { // Testo inválido para la vivienda
        Bien bien = new Bien("vivienda", 30000);
        assertFalse(bien.validarBien());
    }
}
