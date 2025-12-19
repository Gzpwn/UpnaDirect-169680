/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app;

/**
 *
 * @author alumno
 */
public interface Vista {
    
    // Muestra la oferta más ventajosa
    void mostrarMejorOferta(Oferta oferta);
    
    // Muestra un mensaje de error
    void mostrarError(String mensaje);
    
    // Solicita los datos del usuario
    void solicitarDatos();
    
}
