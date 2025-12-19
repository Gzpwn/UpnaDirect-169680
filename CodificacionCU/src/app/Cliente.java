
package app;

import java.time.LocalDate;

public class Cliente {
    
    private int fechaNacimiento;
    private int salario;
    private int anoActual = LocalDate.now().getYear(); // Obtener año actual
    
    public Cliente(int fechaNacimiento, int salario) {
        
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
        
    }
    
    private boolean validarFecha() { // Funcion para validar la fecha
       
                
        if (this.fechaNacimiento < 1900 || this.fechaNacimiento > anoActual) {
            
            return false;
        } else {
            return true;
        }
        
    }
    
    private boolean validarSalario() { // Funcion para validar el salario
        
        if (this.salario <= 0) {
            
            return false;
        } else{
            return true;
        }
        
    }
    
    public boolean validarCliente() {
        
        return this.validarFecha() && this.validarSalario();
        
    }
    
    public int obtenerSalario() {
        
        return this.salario;
    }
    
    public int obtenerEdad() {
        
        return this.anoActual - this.fechaNacimiento;
    }
    
}
