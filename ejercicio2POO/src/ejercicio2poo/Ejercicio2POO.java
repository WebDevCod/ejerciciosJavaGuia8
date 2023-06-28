/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto. 
d) Método area(): para calcular el área de la circunferencia (area = pi * radio2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 * pi * radio).
 */
package ejercicio2poo;

import Entidad.Circunferencia;
import Servicios.ServicioCircunferencia;

public class Ejercicio2POO {

    public static void main(String[] args) {

        ServicioCircunferencia sc = new ServicioCircunferencia();

        Circunferencia c = sc.crearCircunferencia();

        sc.area(c);
        sc.perimetro(c);

    }

}
