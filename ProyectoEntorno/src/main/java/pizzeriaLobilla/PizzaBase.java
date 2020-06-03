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
}
