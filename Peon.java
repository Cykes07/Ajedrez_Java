/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.intentos;

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
        int colmCAM=filaDestino-filaOrigen;
        int colmABS= Math.abs(colmCAM);
        int filaCAM= columnaDestino-columnaOrigen;

        String idDESTINO= App.obtenerIdDeBoton(columnaDestino, filaDestino);        
        String idORIGEN= App.obtenerIdDeBoton(columnaOrigen, filaOrigen);        
        
        if((columnaOrigen==1 || columnaOrigen==6)){ //FILA 1 O 6,   2 O 1 AVANCE
            
            if(idORIGEN.equals("blanco")){ //FICHA BLANCA
                if(colmCAM==0 && ( filaCAM==-2 || filaCAM==-1 ) && idDESTINO.equals("vacio")){ //MISMA COLUMNA   1 O 2 AVANCE
                    return true;
                }
                else if(idDESTINO.equals("negro") && colmABS==1 && filaCAM==-1){
                    return true;
                }
                else
                    return false;
            
            
            }
            else if(idORIGEN.equals("negro")){ //FICHA NEGRA
                if(colmCAM==0 && ( filaCAM==2 || filaCAM==1 ) && idDESTINO.equals("vacio")){ //MISMA COLUMNA   1 O 2 AVANCE
                    return true;
                }
                else if(idDESTINO.equals("blanco") && colmABS==1 && filaCAM==1){
                    return true;
                }
                else
                    return false;
            }
            
        }
        else { // RESTO DE FILAS,  1 PASO
            if(idORIGEN.equals("blanco")){ //FICHA BLANCA
                if(colmCAM==0 && filaCAM==-1 && idDESTINO.equals("vacio") ){ //MISMA COLUMNA   1 O 2 AVANCE
                    return true;
                }
                else if(idDESTINO.equals("negro") && colmABS==1 && filaCAM==-1){
                    return true;
                }
            }
            else if(idORIGEN.equals("negro")){ //FICHA NEGRA
                if(colmCAM==0 && filaCAM==1 && idDESTINO.equals("vacio")){ //MISMA COLUMNA   1 O 2 AVANCE
                    return true;
                }
                else if(idDESTINO.equals("blanco") && colmABS==1 && filaCAM==1){
                    return true;
                }
                else
                    return false;
            }
            else{
                System.out.println("algo esta mal else 1");
            }
            
        }
        
        return true;
    }
}