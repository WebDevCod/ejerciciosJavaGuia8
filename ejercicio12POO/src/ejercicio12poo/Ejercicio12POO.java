/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento 
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
 Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual. 
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario. 
 Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package ejercicio12poo;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

public class Ejercicio12POO {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        PersonaServicio ps = new PersonaServicio();
        
        Persona p = ps.crearPersona();
        
        int edadPersona = ps.calcularEdad(p);
        
        System.out.println("Ingresa una edad para verificar");
        int edad = leer.nextInt();
        boolean retorno = ps.menorQue(edadPersona, edad);
        String mensaje = retorno ? (p.getNombre() + " es menor") : (p.getNombre() + " es mayor");
        System.out.println(mensaje);
        
        ps.mostrarPersona(p, edadPersona);
        
    }
    
}
