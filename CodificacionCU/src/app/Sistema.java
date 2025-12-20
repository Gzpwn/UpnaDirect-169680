package app;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
    
    
    public Oferta ofrecerMejorOferta(int fechaNacimiento, int salario, String tipoBien, int valorBien) {
        
        Cliente cliente = crearYvalidarCliente(fechaNacimiento,salario); // Creamos un objeto cliente y verificamos que esté bien
        if (cliente == null) {
            return null;
                  
        }
        
        Bien bien = crearYvalidarBien(tipoBien, valorBien); // Creamos un objeto bien y verificamos que esté bien
        if (bien == null) {
            return null;
        }
        
        CalculadoraOfertas calcO = new CalculadoraOfertas(); // Creamos y generamos las ofertas 
        List<Oferta> ofertas = calcO.generarOfertas(cliente, bien);
        
        calcularComisiones(ofertas); // Calculamos las comisiones y las añadimos a las ofertas
        
        GestorOfertas gestor = new GestorOfertas(); // Calculamos cual es la mejor oferta
        Oferta mejorOferta = gestor.mejorOferta(ofertas);
        
        return mejorOferta;
        
        
        
        
    }
    
    private Cliente crearYvalidarCliente(int fechaNacimiento, int salario) {
        
        Cliente cliente = new Cliente(fechaNacimiento, salario);
        
        if (cliente.validarCliente()) {
            return cliente;
        } else {
            return null;
        }
        
    }
    
    private Bien crearYvalidarBien(String tipoBien, int valorBien) {
        
        Bien bien = new Bien(tipoBien, valorBien);
        
        if (bien.validarBien()) {
            return bien;
        } else {
            return null;
        }
    }
    
    private void calcularComisiones(List<Oferta> ofertas) {
        
        CalculadoraComisiones calculadora = new CalculadoraComisiones();
        
        for(Oferta ofertaActual: ofertas) {
            
            String aseguradora = ofertaActual.obtenerAseguradora();
            int poliza = ofertaActual.obtenerPoliza();
            
            int comision = calculadora.calcularComision(aseguradora,poliza);
            ofertaActual.anadirComision(comision);
        }
        
        
        
    }
    
}
