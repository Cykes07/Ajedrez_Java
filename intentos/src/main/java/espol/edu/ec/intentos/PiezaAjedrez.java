/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

/**
 *
 * @author Cykes
 */
public abstract class PiezaAjedrez {
    private String imagen;
    private boolean esBlanca; // Nuevo atributo para indicar el color de la pieza

    public PiezaAjedrez(String imagen, boolean esBlanca) {
        this.imagen = imagen;
        this.esBlanca = esBlanca;
    }

    public String getImagen() {
        return imagen;
    }

    public boolean esBlanca() {
        return esBlanca;
    }

    // Método abstracto para validar movimientos específicos de la pieza
    public abstract boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino);

    // Otros métodos comunes a todas las piezas, si los hay

    public boolean getEsBlanca() {
        return esBlanca;
    }
}