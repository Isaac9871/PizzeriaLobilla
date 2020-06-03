/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriaLobilla;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class InterfazPizzeria {
    //Método main
    public static void main(String[] args) {
            //Scanner, para añadir datos desde el teclado
            Scanner teclado = new Scanner(System.in);
            /*Variables necesarias (opcion) para elegir entre las diferentes pizzas,
            (ingre)para opcion de añadir ingredientes y ingredientes para añadir los diferentes ingredientes*/
             int ingre, opcion, ingredientes;
             /*Relacionar esta clase con las otras 3 clases creadas antes,
             para tener acceso a sus contenidos
             */
        PizzaBase base = new PizzaBase();
        PizzaPericolosa peri = new PizzaPericolosa();
        PizzaLobilla lobi = new PizzaLobilla();
    }
    
}
