/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 3;
        int contador = 1;
        double suma_total = 0;

        double promedio_final;
        double calificacion;

        String cadenaFinal = "Las notas ingresadas son: \n";
        
        System.out.println("Ingrese las notas de los estudiantes de su "
                + "materia");

        while (contador <= limite) {
            System.out.printf("Ingrese calificación "
                    + "número %d\n", contador);
            calificacion = entrada.nextDouble();
            cadenaFinal = String.format ("%s%.1f\n",
                    cadenaFinal, calificacion);
            suma_total = suma_total + calificacion;
            // contador
            contador = contador + 1;
        }
cadenaFinal = String.format ("%sLa suma de notas es: %.2f\n",cadenaFinal, 
        suma_total);
       promedio_final = suma_total / limite;
cadenaFinal = String.format ("%sPromedio es: %.2f\n", cadenaFinal, promedio_final);


   //     System.out.printf("El promedio final es %f\n", promedio_final); Hemos agregado cadena final
System.out.printf("%s\n", cadenaFinal);
    }
}
/* 
La cadena final esta acumulando los valores del promedio para poder mostrarlos en pantalla,
sin la cadenaFinal acumulada en el while, no podria mostrarse ningun valor en pantalla, solo 
lo que imprimimos al final
*/