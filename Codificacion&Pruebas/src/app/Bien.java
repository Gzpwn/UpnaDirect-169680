
package app;


public class Bien {
    
    private String tipoBien;
    private int valorBien;
    
    public Bien(String tipoBien, int valorBien) {
        
        this.tipoBien = tipoBien.toLowerCase();
        this.valorBien = valorBien;
        
    }
    
    private boolean verificarTipo() { // funcion para verificar el tipo de bien
        
        
        if (! this.tipoBien.equals("vehiculo") && ! this.tipoBien.equals("vivienda")) {
            return false;
        } else {
            return true;
        }
    }
    
    private boolean verificarValor() { // Funcion para verificar el valor
        
        if (this.valorBien <= 0) {
            return false;
        } else {
            
            if (this.tipoBien.equals("vehiculo")) {
                if (this.valorBien > 50000) {
                    return false;
                }
            }
            if (this.tipoBien.equals("vivienda")) {
                if (this.valorBien < 50000) {
                    return false;
                }
            }    
        }
        return true;
    }
    
    public boolean validarBien() {
        
        return this.verificarTipo() && this.verificarValor();
        
    }
    
    public String obtenerTipo() {
        
        return this.tipoBien;
    }
    
    public int obtenerValor() {
        
        return this.valorBien;
        
    }
    
}
