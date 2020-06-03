/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriaLobilla;

/**
 *
 * @author Isaac
 */

//Herencia de la clase PizzaBase,pudiendo acceder a todo el contenido de este
public class PizzaLobilla extends PizzaBase{

    public PizzaLobilla() {
        /*Precio incial de la pizzaLobilla,introducimos 5 
        para que el precio sea de 7,5 que su precio predeterminado*/
        setPrecio(5);
        //Ingredientes que tiene la pizza aparte de los ingredientes que tiene de por si la pizza Base
        //Aqui no hay que añadir más ingredientes ,sino que se queda con los que tiene ya
        super.getIngredientes().add("Atun");
        super.getIngredientes().add("Cebolla");
        
    }
     
     
    
}
