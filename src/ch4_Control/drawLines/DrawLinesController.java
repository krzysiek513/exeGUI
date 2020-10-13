package ch4_Control.drawLines;

// Fig. 4.26: DrawLinesController.java
// Using strokeLine to connect the corners of a canvas.
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawLinesController {
    @FXML private Canvas canvas; // used to get the GraphicsContext

    @FXML
    void drawLines4xButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int i = 0;
        while (i < 20) {
            i++;
            gc.strokeLine(0,0,0+(i*20),canvas.getHeight() - (i*20));
            gc.strokeLine( canvas.getWidth(),0, 0 + (i*20), 0 + (i*20));
            gc.strokeLine( canvas.getWidth(), canvas.getHeight(), 0 + (i*20), canvas.getHeight() - (i*20));
            gc.strokeLine(0, canvas.getHeight(), 0 + (i*20), 0 + (i*20));
        }
    }

    @FXML
    void drawNiceLines4xButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int i = 0;
        while (i<20) {
            i++;
            gc.strokeLine(0,0+(i*20),20+(i*20), canvas.getHeight());
            gc.strokeLine(canvas.getWidth(),0 + (i*20), canvas.getWidth() - 20 - (i*20), canvas.getHeight());
            gc.strokeLine(canvas.getWidth(), canvas.getHeight() - (i*20), canvas.getWidth() - 20 - (i*20), 0);
            gc.strokeLine(0, canvas.getHeight() - (i*20), 0 + (i*20), 0);
        }
    }

    @FXML
    void drawNiceLinesButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int i = 0;
        while (i<20) {
            i++;
            gc.strokeLine(0,0+(i*20),20+(i*20), canvas.getHeight());
        }

    }


    @FXML
    void clearButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
    }

    // when user presses Draw Lines button, draw two Lines in the Canvas
    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int i = 0;
        while(i<20){
            i++;
            //gc.strokeLine(0, 0, 0, canvas.getHeight());
            gc.strokeLine(0,0,0 + ( i * 20),300 - ( i * 20));
        }
//        // draw line from upper-left to lower-right corner
//        gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());
//
//        // draw line from upper-right to lower-left corner
//        gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());
    }
}
