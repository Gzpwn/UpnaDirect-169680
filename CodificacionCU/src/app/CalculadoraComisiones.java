
package app;

public class CalculadoraComisiones {
    
    
    
    public int calcularComision(String aseguradora, int importeSeguro) {
    
        aseguradora = aseguradora.toLowerCase();
        if (importeSeguro < 1000) {
            return (int)(importeSeguro*0.01);
        } else {
            
            if (aseguradora.equals("mafro")) {
                
                return (int)(importeSeguro*0.03);
            } else if (aseguradora.equals("linea indirecta")) {
                return ((int)(importeSeguro*0.04));
            } else {
                
                return (int)(importeSeguro*0.05);
            }
        }
        
    }
    
 
    
    
}
