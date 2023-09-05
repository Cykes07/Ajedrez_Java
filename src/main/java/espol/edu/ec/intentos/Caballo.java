/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

/**
 *
 * @author Cykes
 */
public class Caballo extends PiezaAjedrez  {
    public Caballo (String imagen, boolean is) {
        super(imagen, is);
    }

    @Override
    public boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        
        if(columnaOrigen+1==columnaDestino && (filaOrigen+2==filaDestino || filaOrigen-2==filaDestino)){
            System.out.println("val1");
                return true;
        }
        else if(columnaOrigen-1==columnaDestino && (filaOrigen+2==filaDestino || filaOrigen-2==filaDestino)){
            System.out.println("val2");
                return true;
        }
        else if(filaOrigen+1==filaDestino && (columnaOrigen+2==columnaDestino || columnaOrigen-2==columnaDestino)){
            System.out.println("val3");
                return true;
        }
        else if(filaOrigen-1==filaDestino && (columnaOrigen+2==columnaDestino || columnaOrigen-2==columnaDestino)){
            System.out.println("val4");
                return true;
        }
        else{
            System.out.println("incorrecto");
            return false;
        }
        
    }
}