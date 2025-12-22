package app;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class CalculadoraOfertasTest {


    @Test
    public void mafroVehiculoJoven() { // para los menores de 20
        Cliente cliente = new Cliente(2005, 20000); // 
        Bien bien = new Bien("vehiculo", 30000);

        CalculadoraOfertas calc = new CalculadoraOfertas();
        List<Oferta> ofertas = calc.generarOfertas(cliente, bien);

        Oferta mafro = buscarOferta("mafro", ofertas);
        assertEquals(900, mafro.obtenerPoliza());
    }

    @Test
    public void mafroViviendaCara() { // Para las viviendas de más de 250000
        Cliente cliente = new Cliente(1980, 18000);
        Bien bien = new Bien("vivienda", 250000);

        CalculadoraOfertas calc = new CalculadoraOfertas();
        List<Oferta> ofertas = calc.generarOfertas(cliente, bien);

        Oferta mafro = buscarOferta("mafro", ofertas);
        assertEquals(5000, mafro.obtenerPoliza());
    }


    @Test
    public void lineaIndirectaVehiculoBarato() { // para los vehiculos baratos
        Cliente cliente = new Cliente(1995, 20000);
        Bien bien = new Bien("vehiculo", 15000);

        CalculadoraOfertas calc = new CalculadoraOfertas();
        List<Oferta> ofertas = calc.generarOfertas(cliente, bien);

        Oferta lineaI = buscarOferta("linea indirecta", ofertas);
        assertEquals(600, lineaI.obtenerPoliza());
    }

    @Test
    public void lineaIndirectaViviendaCara() { // para las viviendas de mas de 250000
        Cliente cliente = new Cliente(1990, 25000);
        Bien bien = new Bien("vivienda", 200000);

        CalculadoraOfertas calc = new CalculadoraOfertas();
        List<Oferta> ofertas = calc.generarOfertas(cliente, bien);

        Oferta lineaI = buscarOferta("linea indirecta", ofertas);
        assertEquals(6000, lineaI.obtenerPoliza());
    }

    @Test
    public void adaslesVehiculoMayor() { // para los mayores de 60
        Cliente cliente = new Cliente(1950, 20000); // 
        Bien bien = new Bien("vehiculo", 20000);

        CalculadoraOfertas calc = new CalculadoraOfertas();
        List<Oferta> ofertas = calc.generarOfertas(cliente, bien);

        Oferta adasles = buscarOferta("adasles", ofertas);
        assertEquals(1200, adasles.obtenerPoliza());
    }

    @Test
    public void adaslesViviendaNormal() { // para una vivienda ni cara ni barata
        Cliente cliente = new Cliente(1990, 20000);
        Bien bien = new Bien("vivienda", 100000);

        CalculadoraOfertas calc = new CalculadoraOfertas();
        List<Oferta> ofertas = calc.generarOfertas(cliente, bien);

        Oferta adasles = buscarOferta("adasles", ofertas);
        assertEquals(2000, adasles.obtenerPoliza());
    }

    private Oferta buscarOferta(String aseguradora, List<Oferta> ofertas) { // Metodo para buscar las ofertas
        for (Oferta oferta : ofertas) {
            if (oferta.obtenerAseguradora().equalsIgnoreCase(aseguradora)) { // buscamos igualar y le decimos que da igual las mayusculas o minusculas --> "mafro" == "Mafro", porque a veces se ponen mayusculas y otras minusculas pero el resultado tiene que ser el mism
                return oferta;
            }
        }
        fail("No se ha encontrado la oferta de la aseguradora " + aseguradora); // devolvemos el fallo e indicamos que oferta no se ha encontrado
        return null;
    }
}
