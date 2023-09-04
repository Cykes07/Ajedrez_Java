package espol.edu.ec.intentos;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;


import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private final Button previousButton = null;
    private Button selectedButton = null;
    private final int BUTTON_SIZE = 60;
    private final int IMAGE_SIZE = 40;
    private String originalButtonStyle = "";
    private boolean turnoBlanco = true;
    private PiezaAjedrez[][] tablero = new PiezaAjedrez[8][8];

    private String[] fBlanca={
    "Fichas/torreB.png","Fichas/caballoB.png",
    "Fichas/alfilB.png","Fichas/reinaB.png",
    "Fichas/reyB.png","Fichas/alfilB.png",
    "Fichas/caballoB.png","Fichas/torreB.png"};
        
    private String[] fNegra={
        "Fichas/torreN.png","Fichas/caballoN.png",
        "Fichas/alfilN.png","Fichas/reinaN.png",
        "Fichas/reyN.png","Fichas/alfilN.png",
        "Fichas/caballoN.png","Fichas/torreN.png"};
    
    @Override
    public void start(Stage stage) {
        GridPane gp = new GridPane();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Button boton;
                if(j==0 && (i==0||i==7)){
                    PiezaAjedrez torreN = new Torre("Fichas/torreN.png", false);
                    boton = createButton(torreN);
                    boton.setId("negro");
                     tablero[i][j] = new Torre("Fichas/torreN.png", false);
                }else if(j==0 && (i==1||i==6)){
                    PiezaAjedrez caballoN = new Caballo("Fichas/caballoN.png", false);
                    boton = createButton(caballoN);
                    boton.setId("negro");
                     tablero[i][j] = new Caballo("Fichas/caballoN.png", false);
                }
                else if(j==0 && (i==2||i==5)){
                    PiezaAjedrez alfilN = new Alfil("Fichas/alfilN.png",false);
                    boton = createButton(alfilN);
                    boton.setId("negro");
                    tablero[i][j] = new Alfil("Fichas/alfilN.png", false);
                }
                else if(j==0 && (i==3)){
                    PiezaAjedrez ReinaN = new Reina("Fichas/reinaN.png", false);
                    boton = createButton(ReinaN);
                    boton.setId("negro");
                    tablero[i][j] = new Reina("Fichas/reinaN.png", false);
                }
                else if(j==0 && (i==4)){
                    PiezaAjedrez reyN = new Rey("Fichas/reyN.png", false);
                    boton = createButton(reyN);
                    boton.setId("negro");
                    tablero[i][j] = new Rey("Fichas/reyN.png", false);
                }
                else if(j==1){
                    PiezaAjedrez peonN = new Peon("Fichas/peonN.png", false);
                    boton = createButton(peonN);
                    boton.setId("negro");
                    tablero[i][j] = new Peon("Fichas/peonN.png", false);
                }else if(j==6){
                    PiezaAjedrez peonB = new Peon("Fichas/peonB.png",true);
                    boton = createButton(peonB);
                    boton.setId("blanco");
                    tablero[i][j] = new Peon("Fichas/peonB.png", true);
                
                }else if(j==7 && (i==2||i==5)){
                    PiezaAjedrez alfilB = new Alfil("Fichas/alfilB.png",true);
                    boton = createButton(alfilB);
                    boton.setId("blanco");
                    tablero[i][j] = new Alfil("Fichas/alfilB.png", true);
                }
                else if(j==7 && (i==3)){
                    PiezaAjedrez ReinaB = new Reina("Fichas/reinaB.png",true);
                    boton = createButton(ReinaB);
                    boton.setId("blanco");
                    tablero[i][j] = new Reina("Fichas/reinaB.png", true);
                }
                else if(j==7 && (i==4)){
                    PiezaAjedrez reyB = new Rey("Fichas/reyB.png",true);
                    boton = createButton(reyB);
                    boton.setId("blanco");
                    tablero[i][j] = new Rey("Fichas/reyB.png", true);
                }
                else if(j==7 && (i==1||i==6)){
                    PiezaAjedrez caballoB = new Caballo("Fichas/caballoB.png",true);
                    boton = createButton(caballoB);
                    boton.setId("blanco");
                    tablero[i][j] = new Rey("Fichas/reyB.png", true);
                }
                else if(j==7 && (i==0||i==7)){
                    PiezaAjedrez torreB = new Torre("Fichas/torreB.png",true);
                    boton = createButton(torreB);
                    boton.setId("blanco");
                    tablero[i][j] = new Torre("Fichas/torreB.png", true);
                }
                else{
                    PiezaAjedrez cv = new CasillaVacia(false);
                    boton = createButton(cv);
                    boton.setId("vacio");
                    tablero[i][j] = new CasillaVacia(false);
                } //Esto coloca los botones del todo el tablero
                
                int row = i;
                int col = j;
                boton.setOnAction(event -> handleButtonAction(boton));
                gp.add(boton, i, j);
                if ((i + j) % 2 == 0) {
                    boton.setStyle("-fx-background-color: #FFE4C4; -fx-border-color: #000000 ");
                }else{
                    boton.setStyle("-fx-background-color: #8B4513; -fx-border-color: #000000"); 
               }//Esto crea el fondo 
            }
        }
        
        Scene sc = new Scene(gp);
        stage.setTitle("Tablero Ajedrez");
        stage.setScene(sc);
        stage.show();
    }

    private Button createButton(PiezaAjedrez pieza) {
        Button boton = new Button();
        boton.setPrefSize(BUTTON_SIZE, BUTTON_SIZE);
        ImageView imageView = new ImageView(new Image(pieza.getImagen())); // Cambia por la imagen por defecto
        imageView.setFitWidth(IMAGE_SIZE);
        imageView.setFitHeight(IMAGE_SIZE);//Tiene imagen y botones exactos para que no altere al cambiar entre imagenes
        boton.setGraphic(imageView);
        boton.setUserData(pieza);
        return boton;
    }

    private void handleButtonAction(Button boton) {
        boton.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                if (selectedButton == null) {
                    if ((turnoBlanco && boton.getId() != null && boton.getId().startsWith("blanco"))
                            || (!turnoBlanco && boton.getId() != null && boton.getId().startsWith("negro"))) {
                        selectedButton = boton;
                        originalButtonStyle = selectedButton.getStyle();
                        selectedButton.setStyle("-fx-background-color: #FFD700;");
                    }
                } else {
                    int columnaOrigen = GridPane.getRowIndex(selectedButton);
                    int filaOrigen = GridPane.getColumnIndex(selectedButton);
                    int columnaDestino = GridPane.getRowIndex(boton);
                    int filaDestino = GridPane.getColumnIndex(boton);

                    PiezaAjedrez piezaOrigen = (PiezaAjedrez) selectedButton.getUserData();
                    System.out.println(filaOrigen + "" + columnaOrigen);

                    if (piezaOrigen != null && piezaOrigen.esMovimientoValido(filaOrigen, columnaOrigen, filaDestino, columnaDestino)) {
                        // Verificar si la casilla de destino está ocupada por una pieza del color opuesto
                        if (boton.getId() != null && boton.getId().startsWith(turnoBlanco ? "negro" : "blanco")) {
                            ImageView imageView = (ImageView) boton.getGraphic();
                            Image image = imageView.getImage();

                            ImageView selectedImageView = (ImageView) selectedButton.getGraphic();
                            Image selectedImage = selectedImageView.getImage();

                            imageView.setImage(selectedImage);
                            selectedImageView.setImage(new Image("Fichas/vacio.png")); // Reemplaza con la ruta de la imagen vacía

                            // Actualizar los ID 
                            boton.setId(selectedButton.getId());
                            selectedButton.setId("vacio");

                            selectedButton.setStyle(originalButtonStyle);
                            selectedButton = null;
                            boton.setUserData(piezaOrigen);

                            turnoBlanco = !turnoBlanco;

                            // Actualizar la matriz de tablero
                            tablero[filaDestino][columnaDestino] = piezaOrigen;
                            tablero[filaOrigen][columnaOrigen] = new CasillaVacia(false);
                        }
                        // Si no se come una pieza, realiza el movimiento normal
                        else if (!hayObstaculosEnElCamino(filaOrigen, columnaOrigen, filaDestino, columnaDestino)
                                && !hayObstaculosEnElCaminoV(filaOrigen, columnaOrigen, filaDestino, columnaDestino)) {
                            if (boton.getId() != null && boton.getId().startsWith("vacio")) {
                                ImageView imageView = (ImageView) boton.getGraphic();
                                Image image = imageView.getImage();

                                ImageView selectedImageView = (ImageView) selectedButton.getGraphic();
                                Image selectedImage = selectedImageView.getImage();

                                imageView.setImage(selectedImage);
                                selectedImageView.setImage(new Image("Fichas/vacio.png")); // Reemplaza con la ruta de la imagen vacía

                                // Actualizar los ID 
                                boton.setId(selectedButton.getId());
                                selectedButton.setId("vacio");

                                selectedButton.setStyle(originalButtonStyle);
                                selectedButton = null;
                                boton.setUserData(piezaOrigen);

                                turnoBlanco = !turnoBlanco;

                                // Actualizar la matriz de tablero
                                tablero[filaDestino][columnaDestino] = piezaOrigen;
                                tablero[filaOrigen][columnaOrigen] = new CasillaVacia(false);
                            }
                        } else {
                            Alerta.obsAlert();
                            System.out.println("Hay un obstáculo en el camino.");
                        }
                    } else {
                        Alerta.movAlert();
                        System.out.println("Movimiento no válido para la pieza seleccionada.");
                    }
                }
            } else if (event.getButton() == MouseButton.SECONDARY) {
                // Manejar el clic derecho
                if (selectedButton != null) {
                    selectedButton.setStyle(originalButtonStyle);
                    selectedButton = null;
                }
            }
        });
    }
    private boolean hayObstaculosEnElCamino(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        int rowDiff = Math.abs(filaDestino - filaOrigen);
        int colDiff = Math.abs(columnaDestino - columnaOrigen);

        // Verificar si el movimiento es diagonal
        if (rowDiff == colDiff) {
            int rowIncrement = (filaDestino > filaOrigen) ? 1 : -1;
            int colIncrement = (columnaDestino > columnaOrigen) ? 1 : -1;
            int row = filaOrigen + rowIncrement;
            int col = columnaOrigen + colIncrement;

            while (row != filaDestino && col != columnaDestino) {
                PiezaAjedrez casilla = tablero[row][col];
                if (casilla != null && !(casilla instanceof CasillaVacia)) {
                    return true; // Hay un obstáculo en el camino
                }
                row += rowIncrement;
                col += colIncrement;
            }
        }

        return false; // No hay obstáculos en el camino
    }
    
    private boolean hayObstaculosEnElCaminoV(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        // Verificar si el movimiento es horizontal
        if (filaOrigen == filaDestino) {
            int minColumna = Math.min(columnaOrigen, columnaDestino);
            int maxColumna = Math.max(columnaOrigen, columnaDestino);
            for (int col = minColumna + 1; col < maxColumna; col++) {
                PiezaAjedrez casilla = tablero[filaOrigen][col];
                if (casilla != null && !(casilla instanceof CasillaVacia)) {
                    return true; // Hay un obstáculo en el camino
                }
            }
        } else if (columnaOrigen == columnaDestino) {
            // Verificar si el movimiento es vertical
            int minFila = Math.min(filaOrigen, filaDestino);
            int maxFila = Math.max(filaOrigen, filaDestino);
            for (int row = minFila + 1; row < maxFila; row++) {
                PiezaAjedrez casilla = tablero[row][columnaOrigen];
                if (casilla != null && !(casilla instanceof CasillaVacia)) {
                    return true; // Hay un obstáculo en el camino
                }
            }
        }

        return false; // No hay obstáculos en el camino
    }
    
    
    

    public static void main(String[] args) {
        launch();
    }
}