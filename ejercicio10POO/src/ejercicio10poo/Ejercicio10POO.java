/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20. 

 */
package ejercicio10poo;

import java.util.Arrays;
import static java.util.Arrays.sort;

public class Ejercicio10POO {

    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < arregloA.length; i++) {
            double numRandom = (double) (Math.random() * 100);
            arregloA[i] = numRandom;
            System.out.println(arregloA[i]);
        }
        System.out.println("------------------------------");

        sort(arregloA);
        for (int i = 0; i < arregloA.length; i++) {

            System.out.println(arregloA[i]);
        }
        System.out.println("------------------------------");

        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
            System.out.println(arregloB[i]);
        }

        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println(Arrays.toString(arregloB));
    }

}
