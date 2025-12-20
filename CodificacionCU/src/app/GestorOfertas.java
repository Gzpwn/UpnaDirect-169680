
package app;

import java.util.List;
import java.util.ArrayList;

public class GestorOfertas {
 
    public Oferta mejorOferta(List<Oferta> ofertas) {
        
        Oferta mejorOfer = ofertas.get(0); // Suponemos que la primera oferta es la mejor, y vamos comparando con el resto de ofertas
        
        for (Oferta ofertaActual: ofertas) {
            
            if (ofertaActual.obtenerPoliza() < mejorOfer.obtenerPoliza()) { // Si la poliza de la oferta actual es menor que la que hemos supuesto, es mejor oferta
                mejorOfer = ofertaActual;
                
            } else if (ofertaActual.obtenerPoliza() == mejorOfer.obtenerPoliza() && ofertaActual.obtenerComision() > mejorOfer.obtenerComision()) { // Si tienen la misma poliza, comparamos por la que genere más comision
                mejorOfer = ofertaActual;
            }
        }
        
        return mejorOfer;
        
    }
}
