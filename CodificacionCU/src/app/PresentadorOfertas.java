
package app;


public class PresentadorOfertas {
    
    private Vista vista;
    private Sistema sistema;
    
    public PresentadorOfertas(Vista vista) {
        
        this.vista = vista;
        this.sistema = new Sistema();
    }
    
    public void solicitarMejOferta(int fechaNacimiento, int salario, String tipoBien, int valorBien) {
 
        
        Oferta oferta = sistema.ofrecerMejorOferta(fechaNacimiento, salario, tipoBien, valorBien);
        if (oferta == null) { // Si la oferta no es válida, llamamos a la vista para que muestre por pantalla el mensaje de error
            vista.mostrarError("\n[!] No se ha podido calcular la oferta\n");
        } else {
            vista.mostrarMejorOferta(oferta); // Si la oferta es válida, llamamos a la vista para que muestre por pantalla la oferta
            
        }
    }
    
    public Oferta devolverMejorOferta (int fechaNacimiento, int salario, String tipoBien, int valorBien) {
        
        Oferta oferta = sistema.ofrecerMejorOferta(fechaNacimiento, salario, tipoBien, valorBien);
        if (oferta == null) { // Si la oferta no es válida, llamamos a la vista para que muestre por pantalla el mensaje de error
            vista.mostrarError("\n[!] No se ha podido calcular la oferta\n");
        } else {
            return oferta; // Si la oferta es válida, llamamos a la vista para que muestre por pantalla la oferta  
        }  
        return oferta;
    }
    
}
