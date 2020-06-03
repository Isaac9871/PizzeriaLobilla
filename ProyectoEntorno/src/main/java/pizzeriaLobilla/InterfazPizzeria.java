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
        
        //Menú inicial para elegir entre las diferentes pizzas
           System.out.println("Pizzeria Lobilla, que deseas?:\n"
                + "1-Pizza Basica\n"
                + "2-PizzaLobilla\n"
                + "3-PizzaPericolosa");
        opcion = teclado.nextInt();
        
          switch (opcion) {
            case 1:
                //Opción para añadir o no ingredientes
                System.out.println("Quieres añadirle ingredientes?\n"
                        + "1-Si\n"
                        + "2-No");
                ingre = teclado.nextInt();
                //Menú con los diferentes ingredientes a añadir
                if (ingre == 1) {
                    System.out.println("Elegir ingredientes:\n"
                            + "1-Barbako\n"
                            + "2-Verdura\n"
                            + "3-Queso\n"
                            + "4-Peperonni\n"
                            + "5-Gambas\n"
                            + "6-Atun\n"
                            + "7-Piña\n"
                            + "8-Bacon\n"
                            + "9-Jamón\n"
                            + "0-Salir");
                    ingredientes = teclado.nextInt();
                    /*Bucle while que seguirá añadiendo hasta que se pulse el botón 0,
                    o hasta que el control del Array no le permita añadir más
                    */ 
                    while (ingredientes != 0) {
                           //Relación con la clase PizzaBase
                        base.añadirIngredientes(ingredientes);
                        ingredientes = teclado.nextInt();
                    };
                    //Precio de la pizzaBase con ingredientes añadidos
                    System.out.println("Producto eligido:");
                    System.out.println(base.precioFinal() + " euros");
                } else {
                    //Precio de la pizzaBase sin ingrediente añadidos
                    System.out.println("Producto eligido:");
                    System.out.println(base.precioFinal() + " euros");
                }
                ;
                break;

            case 2:
                //Precio de la pizza Lobilla
                System.out.println("Producto eligido:");
                System.out.println(lobi.precioFinal() + " euros");
                break;

            case 3:
                //Precio de la pizza Pericolosa
                System.out.println("Producto eligido:");
                System.out.println(peri.precioFinal() + " euros");
                break;

        }
        
    }
    
}
