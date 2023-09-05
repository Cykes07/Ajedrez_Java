/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

/**
 *
 * @author Cykes
 */
public class Rey extends PiezaAjedrez {
    public Rey (String imagen, boolean is) {
        super(imagen, is);
    }

    @Override
    public boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        int filDif = Math.abs(filaDestino - filaOrigen);
        int colDif = Math.abs(columnaDestino - columnaOrigen);
        return (filDif == 1 && colDif == 0) || 
                (filDif == 0 && colDif == 1) ||
                (filDif == 1 && colDif == 1);
    }
}