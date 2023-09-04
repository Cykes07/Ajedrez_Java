/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

/**
 *
 * @author Cykes
 */
public class Reina extends PiezaAjedrez  {
    public Reina (String imagen, boolean is) {
        super(imagen, is);
    }

    @Override
    public boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        if(filaOrigen==filaDestino || columnaOrigen==columnaDestino){
            System.out.println("si da 1");
            return true;
        }
        else{
            int filaCAMB=filaOrigen-filaDestino;
            int columnaCAM=columnaOrigen-columnaDestino;
            int proporcion=filaCAMB/columnaCAM;
                
                if(proporcion==1 || proporcion==-1){
                    System.out.println("si da 2");
                    return true;
                }
                else
                    return false;
        }
        
    }
}