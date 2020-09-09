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

    //punto 1
public class Perro {
    
    //Punto 7
    private String Nombre , Raza;
    private int Edad;
    
    
    //punto 4
    public Perro (String Nombre){
       if (Nombre != "" ) this.Nombre = Nombre;   
        }
    
        
    //Punto 7
    public void setNombre(String Nombre){
       if (Nombre != "" ) this.Nombre = Nombre;           
         }    
    public String getNombre(){
         return Nombre;   
         }     
   
    public void setRaza(String Raza){
         if (Raza != "" ) this.Raza = Raza;           
         }    
    public String getRaza(){
         return Raza;   
         }
    
   public void setEdad(int Edad){
         if(Edad>0) this.Edad = Edad;           
         }
    public int getEdad(){
         return Edad;   
         }
    
        
    
    public void ladrar () {
     
         System.out.println( "Guau" );    
    }
    
     
    
}
