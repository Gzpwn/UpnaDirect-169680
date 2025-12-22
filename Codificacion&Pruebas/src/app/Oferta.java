package app;


public class Oferta {
    
    private String aseguradora;
    private int poliza;
    private Cliente cliente;
    private Bien bien;
    private int comision;
    
    public Oferta(String aseguradora,int poliza, Cliente cliente, Bien bien) {
        
        this.aseguradora = aseguradora;
        this.poliza = poliza;
        this.cliente = cliente;
        this.bien = bien;
        this.comision = 0;
        
    }
    
    public void anadirComision(int comision) {  
        this.comision = comision; 
    }
    
    public int obtenerComision() {
        return this.comision;
    }
    
    public String obtenerAseguradora() {
        return this.aseguradora;
    }
    
    public int obtenerPoliza() { 
        return this.poliza;
    }
    
    public Cliente obtenerCliente() {
        return this.cliente;
    }
    
    public Bien obtenerBien() {
        return this.bien;
    }
    
}
