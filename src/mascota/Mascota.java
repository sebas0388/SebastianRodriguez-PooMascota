/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

/**
 *
 * @author SebastianR
 */
public class Mascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     //punto 4
     Perro P1 ;
     P1 = new Perro ("Aisha");
     
     P1.setNombre("Aisha");
     P1.setRaza("Pitbull");
     P1.setEdad(5);
     
     System.out.println("*****************");
     System.out.println("*DATOS DEL PERRO" );
     System.out.println("*Nombre: " + P1.getNombre());
     System.out.println("*Raza: " + P1.getRaza());
     System.out.println("*Edad: " + P1.getEdad());
     System.out.println("*****************");
    
     //punto 1
     //P1.ladrar();
     
    }
    
    
}
