/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

import javafx.scene.control.Alert;

/**
 *
 * @author arife
 */
public class Alerta {
    public static void movAlert(){
      Alert a= new Alert(Alert.AlertType.ERROR);
      a.setTitle("ERROR");
      a.setHeaderText(null);
      a.setContentText("El movimiento de esta ficha es incorrecto. Por favor, selecciona otro movimiento.");
      a.showAndWait();
    }
    public static void obsAlert(){
      Alert a= new Alert(Alert.AlertType.ERROR);
      a.setTitle("ERROR");
      a.setHeaderText(null);
      a.setContentText("No puede saltar la ficha");
      a.showAndWait();
    }
    
    public static void endGame(){
      Alert a= new Alert(Alert.AlertType.INFORMATION);
      a.setTitle("WIN");
      a.setHeaderText("Fin del juego");
      a.setContentText("Ha comido el Rey");
      a.showAndWait();
    }
    
    public static void winBlackAlert(){
      Alert a= new Alert(Alert.AlertType.INFORMATION);
      a.setTitle("WIN");
      a.setHeaderText("¡JAQUE MATE!");
      a.setContentText("El jugador de fichas negras ha ganado");
      a.showAndWait();
    }
    
}
