/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o 
O. Si no es correcto se deberá mostrar un mensaje 
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano. 
A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores 
 */
package ejercicio7poo;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class Ejercicio7POO {

    public static void main(String[] args) {

        int valorSegunImc;
        String mayorDeEdad;
        int contadorMayoresDeEdad = 0;
        int contadorMenoresDeEdad = 0;
        int contadorBajoPeso = 0;
        int contadorPesoIdeal = 0;
        int contadorSobrePeso = 0;

        PersonaServicio ps = new PersonaServicio();

        Persona[] personas = new Persona[4];

        for (int i = 0; i < personas.length; i++) {
            Persona p = ps.crearPersona(i);
            personas[i] = p;
        }

        for (int i = 0; i < personas.length; i++) {

            Persona p = personas[i];

            mayorDeEdad = ps.esMayorDeEdad(p) ? "Es mayor de edad" : "No es mayor de edad";
            if (ps.esMayorDeEdad(p)) {
                contadorMayoresDeEdad++;
            } else {
                contadorMenoresDeEdad++;
            }
            System.out.println(p.getNombre() + ": " + mayorDeEdad);

            valorSegunImc = ps.calcularIMC(p);
            switch (valorSegunImc) {
                case -1:
                    System.out.println("Debajo del peso ideal");
                    contadorBajoPeso++;
                    break;
                case 0:
                    System.out.println("Peso ideal");
                    contadorPesoIdeal++;
                    break;
                default:
                    System.out.println("Sobrepeso");
                    contadorSobrePeso++;
                    break;
            }
            System.out.println("---------------------------------------");
        }

        float porcentajeMayoresDeEdad = (contadorMayoresDeEdad * 100) / 4;
        float porcentajeMenoresDeEdad = (contadorMenoresDeEdad * 100) / 4;
        float porcentajeBajoPeso = (contadorBajoPeso * 100) / 4;
        float porcentajePesoIdeal = (contadorPesoIdeal * 100) / 4;
        float porcentajeSobrePeso = (contadorSobrePeso * 100) / 4;

        System.out.println("---------------------------------------");
        System.out.println("Porcentaje de personas con bajo peso: " + porcentajeBajoPeso);
        System.out.println("Porcentaje de personas con peso ideal: " + porcentajePesoIdeal);
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrePeso);
        System.out.println("Porcentaje de mayores de edad: " + porcentajeMayoresDeEdad);
        System.out.println("Porcentaje de menores de edad: " + porcentajeMenoresDeEdad);

    }
}
