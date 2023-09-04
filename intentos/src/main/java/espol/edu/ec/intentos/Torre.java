/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

/**
 *
 * @author Cykes
 */
public class Torre extends PiezaAjedrez {
    public Torre(String imagen, boolean is) {
        super(imagen, is);
    }

    @Override
    public boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        boolean mismoColumna = columnaOrigen == columnaDestino;
        boolean mismaFila = filaOrigen == filaDestino;

        if (!mismoColumna && !mismaFila) {
            return false; 
        }

        return true;
    }
}