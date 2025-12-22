package app;

import static org.junit.Assert.*;
import org.junit.Test;

public class SistemaTest {

    @Test
    public void test() {


        Sistema sistema = new Sistema();

        int fechaNacimiento = 2005;
        int salario = 15000;
        String tipoBien = "vehiculo";
        int valorBien = 30000;
        Oferta oferta = sistema.ofrecerMejorOferta(fechaNacimiento,salario,tipoBien,valorBien);

  
        assertNotNull(oferta); // Verificamos que no esté vacio
        assertEquals("Linea Indirecta", oferta.obtenerAseguradora()); // Verificamos la aseguradora
        assertEquals(900, oferta.obtenerPoliza()); // Verificamos que sean 900 d poliza
        assertEquals(9, oferta.obtenerComision()); // Verificamos que sean 9 de comision
    }
}