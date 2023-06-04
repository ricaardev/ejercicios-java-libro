/*

 */
package ejemplo_02;

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

        System.out.print("¿Qué nota has sacado en el último examen? ");
        String line = System.console().readLine();
        double nota = Double.parseDouble(line);
        if (nota >= 5) {
            System.out.println("¡Enhorabuena!, ¡has aprobado!");
        } else {
            System.out.println("Lo siento, has suspendido.");
        }
    }

}
