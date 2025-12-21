package app;

import java.util.Scanner;

public class Consola implements Vista{
    
    private PresentadorOfertas presentador;
    private Scanner escaner;
    
    
    public Consola() {
        
        this.escaner = new Scanner(System.in); // Utilizamos el escaner para leer por teclado
        this.presentador = new PresentadorOfertas(this);
        
        
    }
    
    @Override
    public void mostrarError(String mensaje) { // Implementamos y sobreescribimos el metodo de la vista
        System.out.println("\n[!] Error: " + mensaje);
    }
    
    @Override
    public void mostrarMejorOferta(Oferta oferta) { // Implementamos y sobreescribimos el metodo de la vista
        System.out.println("\n[+] La mejor oferta es: ");
        System.out.println("Aseguradora: " + oferta.obtenerAseguradora());
        System.out.println("Importe poliza: " + oferta.obtenerPoliza());
        System.out.println("Comisión: " + oferta.obtenerComision());
        
        
    }
    
    public void iniciarConsola() {
        System.out.println("----- CORREDURÍA DE SEGUROS UPNA DIRECT -----");
        
        System.out.println("[i] Introduce tu fecha de nacimiento: ");
        int fechaNacimiento = escaner.nextInt(); // Almacenamos la fecha de nacimiento
        
        System.out.println("[i] Introduce tu salario anual: ");
        int salarioAnual = escaner.nextInt(); // Almacenamos el salario anual
        
        escaner.nextLine(); // Limpiamos el buffer para recoger el resto de datos
        
        System.out.println("[i] Introduce el tipo de bien que tienes (vivienda/vehículo): ");
        String tipoBien = escaner.nextLine(); // Almacenamos el tipo de bien
        
        System.out.println("[i] Introduce el valor del bien que has indicado: ");
        int valorBien = escaner.nextInt(); // Almacenamos el valor del bien
        
        presentador.solicitarMejOferta(fechaNacimiento, valorBien, tipoBien, valorBien); // Obtenemos la mejor oferta
        
    }
}
