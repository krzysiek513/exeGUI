package ch5_control2.DrawShapes;

// Fig. 5.27: DrawShapesController.java
// Using strokeRect and strokeOval to draw rectangles and ovals.
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawShapesController {
    @FXML private Canvas canvas;

    @FXML
    void drawRecButtonPressed(ActionEvent event) {
        draw("rec");
    }

    @FXML
    void drawOvaButtonPressed(ActionEvent event) {
        draw("ova");
    }

    // when user presses Draw Rectangles button, call draw for rectangles
    @FXML
    void drawRectanglesButtonPressed(ActionEvent event) {
        draw("rectangles");
    }

    // when user presses Draw Ovals button, call draw for ovals
    @FXML
    void drawOvalsButtonPressed(ActionEvent event) {
        draw("ovals");
    }

    // draws rectangles or ovals based on which Button the user pressed
    public void draw(String choice) {
        // get the GraphicsContext, which is used to draw on the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // clear the canvas for next set of shapes
        // gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        int step = 10;

        // draw 10 overlapping shapes
        for (int i = 0; i < 10; i++) {
            // pick the shape based on the user's choice
            switch (choice) {
                case "rectangles": // draw rectangles
                    gc.strokeRect(10 + i * step, 10 + i * step,
                            90 + i * step, 90 + i * step);
                    break;
                case "ovals": // draw ovals
                    gc.strokeOval(10 + i * step, 10 + i * step,
                            90 + i * step, 90 + i * step);
                    break;
                case "rec": // draw rectangles
                    gc.strokeRect((canvas.getWidth()/2)-50 -i*step, (canvas.getHeight()/2)-50-i*step,// + i * step,
                            90 + 2*i * step, 90 + 2*i * step);
                    break;
                case "ova": // draw ovals
                    gc.strokeOval((canvas.getWidth()/2) - i * step, (canvas.getHeight()/2) - i * step ,// + i * step,
                            2*i * step,2*i * step);
                    break;
            }
        }
    }


    @FXML
    void clearButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
    }
}
