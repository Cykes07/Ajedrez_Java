/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

/**
 *
 * @author Cykes
 */
public class CasillaVacia extends PiezaAjedrez {
    
    public CasillaVacia (boolean is) {
        super("Fichas/vacio.png", is);
    }

    @Override
    public boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        return true;
    }
}