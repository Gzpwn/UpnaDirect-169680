package app;

import java.util.List;
import java.util.ArrayList;
public class CalculadoraOfertas {

    
    
    public List<Oferta> generarOfertas(Cliente cliente, Bien bien) {
        
        List<Oferta> ofertas = new ArrayList<>(); // Creamos una lista para las ofertas
        int edad = cliente.obtenerEdad();
        int salario = cliente.obtenerSalario();
        String tipoBien = bien.obtenerTipo();
        int valorBien = bien.obtenerValor();
        
        int polizaMafro = calcularMafro(tipoBien, valorBien, edad, salario);
        int polizaAdasles = calcularAdasles(tipoBien, valorBien, edad);
        int polizaLineaIndirecta = calcularLineaIndirecta(tipoBien, valorBien, edad);
        
        ofertas.add(new Oferta("Mafro",polizaMafro, cliente,bien));
        ofertas.add(new Oferta("Linea Indirecta",polizaLineaIndirecta,cliente,bien));
        ofertas.add(new Oferta("Adasles",polizaAdasles, cliente, bien));
        
        return ofertas;
        
    }
    
    private int calcularMafro(String tipoBien, int valorBien, int edad, int salario) { //Calcular poliza de mafro
        
        if (tipoBien.equals("vehiculo") && edad < 20) {
            
            return (int)(valorBien * 0.05);
        } else if (tipoBien.equals("vivienda") && valorBien > 200000 && salario < 20000) {
            
            return (int)(valorBien * 0.02);
        
        } else {
            
            return (int)(valorBien * 0.03);
        }
        
    }
    
    private int calcularLineaIndirecta(String tipoBien, int valorBien, int edad) { // Calcular poliza de Linea Indirecta
        
        if ( (tipoBien.equals("vehiculo") && valorBien < 20000) || (tipoBien.equals("vivienda") && valorBien < 150000)) {
            
            return (int)(valorBien * 0.04);
        
        } else if (tipoBien.equals("vehiculo") && valorBien >= 20000 &&  edad > 60) {
            
            return (int)(valorBien * 0.06);
        } else {
            return (int)(valorBien * 0.03);
        }
        
    }
    
    private int calcularAdasles(String tipoBien, int valorBien, int edad) { // Calcular poliza Adasles
        
        if (tipoBien.equals("vehiculo") && (edad <20 || edad >60)) {
            return (int)(valorBien * 0.06);
        } else {
            return (int)(valorBien * 0.02);
        }
        
    }
    
}
