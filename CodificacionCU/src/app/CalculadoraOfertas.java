package app;

import java.util.List;
import java.util.ArrayList;
public class CalculadoraOfertas {
    
    private List<Oferta> ofertas = new ArrayList<>(); // Creamos una lista para las ofertas
    private Cliente cliente;
    private Bien bien;
    private int salario = cliente.obtenerSalario();
    private String tipoBien = bien.obtenerTipo();
    private int valorBien = bien.obtenerValor();
    private int edad = cliente.obtenerEdad();
    
    public CalculadoraOfertas(Cliente cliente, Bien bien) {
        
        this.bien = bien;
        this.cliente = cliente;
    }
    
    private double calcularMafro() {
        
        if (this.tipoBien.equals("vehiculo") && this.edad < 20) {
            
            return this.valorBien * 0.05;
        } else if (this.tipoBien.equals("vivienda") && this.valorBien > 200000 && this.salario < 20000) {
            
            return this.valorBien * 0.02;
        
        } else {
            
            return this.valorBien * 0.03;
        }
        
    }
    
    private int calcularLineaIndirecta() {
        
    }
    
    private int calcularAdasles() {
        
    }
    
    private List<Oferta> generarOfertas() {
        
    }
    
}
