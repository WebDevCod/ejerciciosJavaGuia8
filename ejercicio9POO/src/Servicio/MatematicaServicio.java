package Servicio;

import Entidad.Matematica;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class MatematicaServicio {

    public double devolverMayor(Matematica m) {
        System.out.println(m.getNum_1());
        System.out.println(m.getNum_2());
        System.out.println("--------------------");
        return max(m.getNum_1(), m.getNum_2());
    }

    public void calcularPotencia(Matematica m) {
        double num1 = round(m.getNum_1());
        double num2 = round(m.getNum_2());
        double resultado;

        if (num1 > num2) {
            resultado = pow(num1, num2);
            System.out.println(num1 + "^" + num2 + " = " + resultado);
        } else {
            resultado = pow(num2, num1);
            System.out.println(num2 + "^" + num1 + " = " + resultado);
        }
        System.out.println("--------------------");
    }

    public void calculaRaiz(Matematica m) {
        double num1 = m.getNum_1();
        double num2 = m.getNum_2();

        double numMinimo = min(num1, num2);
        System.out.println("La raíz cuadrada de " + numMinimo + " es " + sqrt(abs(numMinimo)));
    }
}
