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
        int filaCAM=filaOrigen-filaDestino;
        int colABS=Math.abs(filaCAM);
        
        int columnaCAM=columnaOrigen-columnaDestino;
        int filABS=Math.abs(columnaCAM);

        System.out.println(columnaOrigen);
        if(columnaOrigen==1 || columnaOrigen==6 ){
            System.out.println("help 1");
            if(filaOrigen==filaOrigen){
                System.out.println("help 2");
                if(filABS==1 || filABS==2){
                    return true;
                }
                else
                    return false;
                
            }

            else
                return false;
        }
        else{
            System.out.println("else 1");
            if(filaOrigen==filaOrigen){
                if(filABS==1){
                    return true;
                }
                else
                    return false;
                
            }

            else{

                return false;
            }

        }
    }
}