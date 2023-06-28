package Servicio;

import Entidad.Cadena;

public class CadenaServicio {

    public void mostrarVocales(Cadena c) {
        int cantidadVocales = 0;

        String frase = c.getFrase();
        int longitudFrase = c.getLongitudFrase();

        String vocales[] = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < longitudFrase; i++) {
            char caracter = frase.charAt(i);
            for (int j = 0; j < vocales.length; j++) {
                String vocal = vocales[j];
                if (Character.toString(caracter).equals(vocal)) {
                    cantidadVocales++;
                    break;
                }
            }
        }
        System.out.println("La cantidad de vocales es: " + cantidadVocales);
        System.out.println("---------------------------");
    }

    public void invertirFrase(Cadena c) {
        String frase = c.getFrase();
        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);
            fraseInvertida += Character.toString(caracter);
        }
        System.out.println("Frase invertida: " + fraseInvertida);
        System.out.println("---------------------------");

    }

    public void vecesRepetido(Cadena c, String letra) {
        int contador = 0;

        String frase = c.getFrase();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.toString(caracter).equals(letra)) {
                contador++;
            }
        }

        if (contador > 1) {
            System.out.println(letra + " se repite " + contador);
        } else {
            System.out.println(letra + " no se repite ");
        }
        System.out.println("---------------------------");

    }

    public void compararLongitud(Cadena c, String fraseComparada) {
        if (c.getFrase().length() == fraseComparada.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases tienen diferente longitud");
        }
        System.out.println("---------------------------");

    }

    public void unirFrase(Cadena c, String fraseUnir) {
        System.out.println(c.getFrase().concat(" " + fraseUnir));
        System.out.println("---------------------------");

    }

    public void reemplazar(Cadena c, String caracterNuevo) {
        String frase = c.getFrase();
        String fraseNueva = "";

        for (int i = 0; i < frase.length(); i++) {
            String caracterViejo = Character.toString(frase.charAt(i));
            if (caracterViejo.equals("a")) {
                fraseNueva = frase.replace(caracterViejo, caracterNuevo);
            }
        }
        System.out.println(fraseNueva);
        System.out.println("---------------------------");
    }

    public boolean contiene(Cadena c, String letraBuscar) {
        String frase = c.getFrase();
        return frase.contains(letraBuscar);
    }
}
