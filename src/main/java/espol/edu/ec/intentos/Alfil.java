/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

/**
 *
 * @author Cykes
 */
public class Alfil extends PiezaAjedrez {
    public Alfil (String imagen, boolean is) {
        super(imagen, is);
    }

    @Override
    public boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
            int rowDiff = Math.abs(filaDestino - filaOrigen);
            int colDiff = Math.abs(columnaDestino - columnaOrigen);

            if (rowDiff == colDiff) {
                return true;
            }
        return false;
        }
}