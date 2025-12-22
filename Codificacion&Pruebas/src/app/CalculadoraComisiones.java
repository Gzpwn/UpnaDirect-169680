
package app;

public class CalculadoraComisiones {
    
    
    
    public int calcularComision(String aseguradora, int importeSeguro) { // Funcion para calcular las comisiones de los seguros
    
        aseguradora = aseguradora.toLowerCase();
        if (importeSeguro < 1000) {
            return (int)(importeSeguro*0.01);
        } else {
            
            if (aseguradora.equals("mafro")) {
                
                return (int)(importeSeguro*0.03);
            } else if (aseguradora.equals("linea indirecta")) {
                return ((int)(importeSeguro*0.04));
                
            } else  if (aseguradora.equals("adasles")) {
                
                return (int)(importeSeguro*0.05);
            } else {
                
                return 0;
            }
        }
        
    }
    
 
    
    
}
