package app;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void clienteValido() { // Test valido
        Cliente cliente = new Cliente(1990, 20000);
        assertTrue(cliente.validarCliente());
    }

    @Test
    public void clienteInvalido() { // Test invalido
        Cliente cliente = new Cliente(1990, -100);
        assertFalse(cliente.validarCliente());
    }
}
