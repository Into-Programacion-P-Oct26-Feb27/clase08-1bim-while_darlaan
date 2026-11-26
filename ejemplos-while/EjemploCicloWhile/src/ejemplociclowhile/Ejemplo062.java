/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */



public class Ejemplo062 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        
        while (bandera == true){
            System.out.println("Estoy en el ciclo");// esta linea ímprime, estoy en el ciclo
            
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si ");
            salir = entrada.nextLine();
            if (salir.equals("si")){
                bandera = false;
                
            }
        }
        
        
}
}
/*
En este ejercicio estamos ingresando un valor booleano y en el while lo comparamos
esto para seguir dentro de un ciclo o salir, si es verdadero y verdadero, el ciclo se repite
y si es falso verdadero, el ciclo para y salimos del ciclo, la variable salir es la variable que usamos
para salir del ciclo si esta es == entonces sale del ciclo pero si no es igual al valor q le dimos, 
no sale del ciclo
*/