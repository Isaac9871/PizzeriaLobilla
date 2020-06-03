/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriaLobilla;

import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public class PizzaBase {

    /*Variable que controla  los ingredientes máximos 
    que se puede añadir a una pizza, hay 12 puesto 
    que se pueden añadir 1o mas los 2 que vienen ya por defecto*/
    private int control = 12;
    /*Variable del precio de pizza sin ingredientes añadidos*/
    private double precio = 4;
    /*Variable con el precio de cada ingrediente extra*/
    private double precioExtra = 0.5;
    /*ArrayList donde guardaremos los diferentes ingredientes a añadir*/
    private ArrayList<String> ingredientes = new ArrayList<>();
    /*Variable para saber la cantidad de ingredientes*/
    private int cantidadIngredientes = 1;
    /*Variable con los precios finales de las pizzas, tiene valor 0 puesto 
    que se modificara cuando se les añada ingredientes o se eliga otra pizza*/
    private double precioTotal = 0;
    /*Variable String qu nos permitirá enviar un mensaje al usuario*/
    private String mensaje = "";

    //Constructor con los ingredientes predeterminados
    public PizzaBase() {
        ingredientes.add("Tomate");
        ingredientes.add("Mozzarela");
    }
    
    
    //Método donde guardaremos los ingredientes en la arrayList creada anteriormente
      public void añadirIngredientes(int num) {
          //Para controlar que no se puedan añadir más ingredientes de los permitidos
            try {
                if(ingredientes.size() >= control){
                    throw new IndexOutOfBoundsException("");
                }
                //Todos los ingredientes disponibles
                switch (num) {
                    case 1:
                        ingredientes.add("Barbako");
                        break;

                    case 2:
                        ingredientes.add("Verdura");
                        break;

                    case 3:
                        ingredientes.add("Queso");
                        break;

                    case 4:
                        ingredientes.add("Peperonni");
                        break;

                    case 5:
                        ingredientes.add("Gambas");
                        break;

                    case 6:
                        ingredientes.add("Atun");
                        break;

                    case 7:
                        ingredientes.add("Piña");
                        break;

                    case 8:
                        ingredientes.add("Bacon");
                        break;

                    case 9:
                        ingredientes.add("Jamón");
                        break;
                }
                //Mensaje que nos envia al usuario cuando se sobrepasa el limite de ingredientes añadidos
            } catch (IndexOutOfBoundsException ioobe) {
                System.err.println("Demasiados ingredientes añadidos\n"
                        + "Pulsa 0 para continuar con la compra:");
            }

        
    }
}
