
package app;

import java.time.LocalDate;

public class Cliente {
    
    private int fechaNacimiento;
    private int salario;
    
    public Cliente(int fechaNacimiento, int salario) {
        
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
        
    }
    
    private boolean validar_fecha() { // Funcion para validar la fecha
        
        int ano_actual = LocalDate.now().getYear(); // Obtener el año actual
                
        if (this.fechaNacimiento < 1900 || this.fechaNacimiento > ano_actual) {
            
            return false;
        } else {
            return true;
        }
        
    }
    
    private boolean validar_salario() { // Funcion para validar el salario
        
        if (this.salario <= 0) {
            
            return false;
        } else{
            return true;
        }
        
    }
    
    public boolean validarCliente() {
        
        return this.validar_fecha() && this.validar_salario();
        
    }
    
}
