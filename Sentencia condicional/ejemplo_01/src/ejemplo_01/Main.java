/*

 */
package ejemplo_01;

import java.util.Scanner;

/**
 *
 * @author Ricardo Fraga Méndez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("¿Cuál es la capital de Kiribati? ");
        String respuesta = System.console().readLine();
        if (respuesta.equals("Tarawa")) {
            System.out.println("¡La respuesta es correcta!");
        } else {
            System.out.println("Lo siento, la respuest");
        }
    }
}
