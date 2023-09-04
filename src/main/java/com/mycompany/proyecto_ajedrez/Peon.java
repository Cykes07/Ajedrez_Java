/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Cykes
 */
public class Peon extends PiezaAjedrez {

    public Peon(String imagen, boolean esBlanca) {
        super(imagen, esBlanca);
    }

    @Override
    public boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        // Verificar que el destino esté una casilla adelante en la misma columna
     int filDif = Math.abs(columnaDestino - columnaOrigen);
        int colDif = Math.abs(filaDestino - filaOrigen);
        // El movimiento debe ser diagonal de una casilla para capturar

        return filDif == 1 && colDif==0;

    }
}